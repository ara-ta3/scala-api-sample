package com.ru.waka.app.domains.services

import com.ru.waka.app.domains.User

trait UserRepository[F[_]] {
  def fetch(): F[Seq[User]]
}

trait UsesUserRepository[F[_]] {
  val userRepository: UserRepository[F]
}
