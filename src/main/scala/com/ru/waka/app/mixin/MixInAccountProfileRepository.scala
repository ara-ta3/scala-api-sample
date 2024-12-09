package com.ru.waka.app.mixin

import com.ru.waka.app.Types.EitherThrowable
import com.ru.waka.app.domains.services.AccountProfileRepository
import com.ru.waka.app.infrastructures.AccountProfileRepositoryImpl

trait MixInAccountProfileRepository {
  val accountProfileRepository: AccountProfileRepository[EitherThrowable] =
    new AccountProfileRepositoryImpl
}
