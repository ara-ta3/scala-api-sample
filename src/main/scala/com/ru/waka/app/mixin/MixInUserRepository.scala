package com.ru.waka.app.mixin

import com.ru.waka.app.domains.User
import com.ru.waka.app.domains.services.UserRepository
import com.ru.waka.app.implicits.FlatMap.EitherThrowable
import com.ru.waka.app.infrastructures.UserRepositoryImpl

trait MixInUserRepository {
  val userRepository: UserRepository[EitherThrowable] = new UserRepositoryImpl(
    Map(1L -> User(1L, "hoge"), 2L -> User(2L, "fuga"))
  )
}
