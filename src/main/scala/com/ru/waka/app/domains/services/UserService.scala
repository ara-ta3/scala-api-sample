package com.ru.waka.app.domains.services

import com.ru.waka.app.Types.EitherResult
import com.ru.waka.app.domains.{AccountProfile, User}

trait UserService
    extends UsesUserRepository[EitherResult]
    with UsesAccountProfileRepository[EitherResult] {
  def fetchAll(): EitherResult[Seq[(User, Option[AccountProfile])]] =
    for {
      users <- userRepository.fetch()
      accounts <- accountProfileRepository.fetch(users.map(_.id))
    } yield users.map(u => (u, accounts.get(u.id)))

  def updateXAccount(userId: Long, xAccount: String): EitherResult[Unit] =
    for {
      userOpt <- userRepository.fetch(userId)
      user <- userOpt.toRight(new Exception(s""))
      currentAccount <- accountProfileRepository.fetch(Seq(user.id))
      updated = ??? // user.update(currentAccount, xAccount)
      // _ <- accountProfileRepository.put(updated)
    } yield ()
}
