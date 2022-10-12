package com.ru.waka.app.domains.services

import sangria.execution.Executor
import sangria.macros.LiteralGraphQLStringContext
import sangria.schema._
import sangria.marshalling.json4s.jackson._

import java.util.concurrent.TimeUnit
import scala.concurrent.{Await, duration}
import scala.concurrent.ExecutionContext.Implicits.global

class GraphQLService {
  private val QueryType =
    ObjectType(
      "Query",
      fields[Unit, Unit](
        Field("hello", StringType, resolve = _ => "Hello World")
      )
    )

  private val schema = Schema(QueryType)

  def fetch(): Any = {
    val query = graphql"{ hello }"
    val result = Executor.execute(schema, query)
    Await.result(result, duration.Duration(3, TimeUnit.SECONDS))
  }

}
