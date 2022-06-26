package com.ru.waka.app.domains.services

import com.ru.waka.app.domains.User

import scala.util.Try

trait UserService extends UsesUserRepository[Try] {
  def fetch(id: Long): Try[Option[User]] = {
    for {
      r <- userRepository.fetch(id)
    } yield r
  }

  def fetchAll(): Try[Seq[User]] =
    userRepository.fetch()
}
