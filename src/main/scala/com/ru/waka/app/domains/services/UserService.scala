package com.ru.waka.app.domains.services

import com.ru.waka.app.Types.EitherThrowable
import com.ru.waka.app.domains.User

trait UserService extends UsesUserRepository[EitherThrowable] {
  def fetch(id: Long): EitherThrowable[Option[User]] =
    for {
      r <- userRepository.fetch(id)
    } yield r

  def fetchAll(): EitherThrowable[Seq[User]] =
    userRepository.fetch()
}
