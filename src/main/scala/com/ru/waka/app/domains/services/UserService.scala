package com.ru.waka.app.domains.services

import com.ru.waka.app.domains.User

trait UserService extends UsesUserRepository {
    def fetch(id: Long): Either[Exception, Option[User]] = 
        userRepository.fetch(id)
}