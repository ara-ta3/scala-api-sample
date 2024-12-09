package com.ru.waka.app.domains.services

import com.ru.waka.app.domains.AccountProfile

trait AccountProfileRepository[F[_]] {
  def fetch(id: Long): F[Option[AccountProfile]]
}

trait UsesAccountProfileRepository[F[_]] {
  val accountProfileRepository: AccountProfileRepository[F]
}
