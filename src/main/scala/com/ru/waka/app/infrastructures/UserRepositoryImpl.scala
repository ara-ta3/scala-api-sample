package com.ru.waka.app.infrastructures

import com.ru.waka.app.domains.services.UserRepository
import com.ru.waka.app.domains.User

class UserRepositoryImpl extends UserRepository {
  override def fetch(): Either[Exception,Seq[User]] = ???

  override def fetch(id: Long): Either[Exception,Option[User]] = ???
}