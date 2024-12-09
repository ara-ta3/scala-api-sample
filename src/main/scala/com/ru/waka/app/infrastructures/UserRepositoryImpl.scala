package com.ru.waka.app.infrastructures

import com.ru.waka.app.Types.EitherThrowable
import com.ru.waka.app.domains.User
import com.ru.waka.app.domains.services.UserRepository

class UserRepositoryImpl(data: Map[Long, User])
    extends UserRepository[EitherThrowable] {
  override def fetch(): EitherThrowable[Seq[User]] =
    Right(data.values.toSeq)

  override def fetch(id: Long): EitherThrowable[Option[User]] =
    Right(data.get(id))
}
