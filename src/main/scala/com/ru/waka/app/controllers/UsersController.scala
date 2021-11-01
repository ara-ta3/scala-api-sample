package com.ru.waka.app.controllers

import org.json4s.Formats
import org.json4s.DefaultFormats
import com.ru.waka.app.mixin.MixInUserService
import com.ru.waka.app.domains.services.UserService

class UsersController extends BaseController with MixInUserService {
  override implicit protected def jsonFormats: Formats = DefaultFormats

  get("/") {
    "{\"users\": [\"a\", \"b\"]}"
  }
}

object UsersController extends MixInUserService