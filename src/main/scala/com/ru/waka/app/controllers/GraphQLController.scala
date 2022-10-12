package com.ru.waka.app.controllers

import com.ru.waka.app.domains.services.GraphQLService
import com.ru.waka.app.mixin.MixInUserService
import org.json4s.{DefaultFormats, Formats}

class GraphQLController extends BaseController with MixInUserService {
  override implicit protected def jsonFormats: Formats = DefaultFormats

  get("/") {
    val s = new GraphQLService
    s.fetch()
  }
}
