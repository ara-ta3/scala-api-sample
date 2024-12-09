package com.ru.waka.app.mixin

import com.ru.waka.app.domains.services.UserService

trait MixInUserService {
  val userService: UserService = new UserService with MixInUserRepository
  with MixInAccountProfileRepository {}
}
