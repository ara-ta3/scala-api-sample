package com.ru.waka.app.controllers

import org.scalatra.ScalatraServlet
import org.scalatra.json.JacksonJsonSupport

trait BaseController extends ScalatraServlet with JacksonJsonSupport{
  before() {
    contentType = formats("json")
  }

  notFound {
    halt(404, "{}")
  }
}