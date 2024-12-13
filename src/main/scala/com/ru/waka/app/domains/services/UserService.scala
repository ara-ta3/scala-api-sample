package com.ru.waka.app.domains.services

import com.ru.waka.app.Types.EitherThrowable
import com.ru.waka.app.domains.{AccountProfile, User}

trait UserService
    extends UsesUserRepository[EitherThrowable]
    with UsesAccountProfileRepository[EitherThrowable] {
  def fetchAll(): EitherThrowable[Seq[(User, Option[AccountProfile])]] =
    for {
      users <- userRepository.fetch()
      accounts <- accountProfileRepository.fetch(users.map(_.id))
    } yield users.map(u => (u, accounts.get(u.id)))
}
