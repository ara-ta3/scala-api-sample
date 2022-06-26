package com.ru.waka.app.infrastructures

import com.ru.waka.app.domains.User
import com.ru.waka.app.domains.services.UserRepository

import scala.util.Try

object UserRepositoryImpl {
  type Id[A] = A
}

class UserRepositoryImpl(data: Map[Long, User]) extends UserRepository[Try] {
  override def fetch(): Try[Seq[User]] = Try(data.values.toSeq)

  override def fetch(id: Long): Try[Option[User]] =
    Try(data.get(id))
}
