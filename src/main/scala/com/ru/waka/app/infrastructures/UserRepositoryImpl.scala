package com.ru.waka.app.infrastructures

import com.ru.waka.app.Types.EitherResult
import com.ru.waka.app.domains.User
import com.ru.waka.app.domains.services.UserRepository

class UserRepositoryImpl(data: Map[Long, User])
    extends UserRepository[EitherResult] {
  override def fetch(): EitherResult[Seq[User]] =
    Right(data.values.toSeq)

  override def fetch(id: Long): EitherResult[Option[User]] =
    Right(data.get(id))
}
