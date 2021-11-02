package com.ru.waka.app.mixin

import com.ru.waka.app.domains.User
import com.ru.waka.app.domains.services.UserRepository
import com.ru.waka.app.infrastructures.UserRepositoryImpl

trait MixInUserRepository {
    val userRepository: UserRepository = new UserRepositoryImpl(
        Map(
            1 -> User(1, "hoge"),
            2 -> User(2, "fuga")
        )
    )
}