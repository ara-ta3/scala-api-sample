package com.ru.waka.app.domains.services

import com.ru.waka.app.Types.EitherThrowable
import com.ru.waka.app.domains.{AccountProfile, User}

trait UserService
    extends UsesUserRepository[EitherThrowable]
    with UsesAccountProfileRepository[EitherThrowable] {
  def fetch(id: Long): EitherThrowable[(Option[User], Option[AccountProfile])] =
    for {
      r <- userRepository.fetch(id)
      info <- accountProfileRepository.fetch(id)
    } yield (r, info)

  def fetchAll(): EitherThrowable[Seq[User]] =
    userRepository.fetch()
}
