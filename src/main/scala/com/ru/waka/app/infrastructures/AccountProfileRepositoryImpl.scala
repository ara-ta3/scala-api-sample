package com.ru.waka.app.infrastructures

import com.ru.waka.app.Types.EitherThrowable
import com.ru.waka.app.domains.AccountProfile
import com.ru.waka.app.domains.services.AccountProfileRepository

class AccountProfileRepositoryImpl
    extends AccountProfileRepository[EitherThrowable] {
  override def fetch(id: Long): EitherThrowable[Option[AccountProfile]] = ???
}
