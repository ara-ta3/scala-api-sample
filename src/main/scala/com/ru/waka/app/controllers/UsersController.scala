package com.ru.waka.app.controllers

import org.json4s.Formats
import org.json4s.DefaultFormats

class UsersController extends BaseController {
  override implicit protected def jsonFormats: Formats = DefaultFormats

  get("/") {
    "{\"users\": [\"a\", \"b\"]}"
  }
}