package com.ru.waka.app.domains.services

import com.ru.waka.app.domains.User

trait UserRepository {
    def fetch(): Either[Exception, Seq[User]]

    def fetch(id: Long): Either[Exception, Option[User]]
}

trait UsesUserRepository {
    val userRepository: UserRepository
}
