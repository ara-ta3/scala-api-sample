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

  def updateXAccount(userId: Long, xAccount: String): EitherThrowable[Unit] =
    for {
      userOpt <- userRepository.fetch(userId)
      user <- userOpt.toRight(new Exception(s""))
      currentAccount <- accountProfileRepository.fetch(Seq(user.id))
      updated = ??? // user.update(currentAccount, xAccount)
      // _ <- accountProfileRepository.put(updated)
    } yield ()
}
