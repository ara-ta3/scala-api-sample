package com.ru.waka.app.infrastructures

import com.ru.waka.app.Types.EitherResult
import com.ru.waka.app.domains.AccountProfile
import com.ru.waka.app.domains.services.AccountProfileRepository

class AccountProfileRepositoryImpl
    extends AccountProfileRepository[EitherResult] {
  override def fetch(ids: Seq[Long]): EitherResult[Map[Long, AccountProfile]] =
    ???
}
