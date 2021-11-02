package com.ru.waka.app.infrastructures

import com.ru.waka.app.domains.services.UserRepository
import com.ru.waka.app.domains.User

class UserRepositoryImpl(data: Map[Long, User]) extends UserRepository {
  override def fetch(): Either[Exception,Seq[User]] = Right(data.values.toSeq)

  override def fetch(id: Long): Either[Exception,Option[User]] = Right(data.get(id))
}