package com.ru.waka.app.controllers

import com.ru.waka.app.mixin.MixInUserService
import org.json4s.{DefaultFormats, Formats}

class UsersController extends BaseController with MixInUserService {
  override implicit protected def jsonFormats: Formats = DefaultFormats

  get("/") {
    userService.fetchAll()
  }
}