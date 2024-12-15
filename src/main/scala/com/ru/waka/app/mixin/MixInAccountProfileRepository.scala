package com.ru.waka.app.mixin

import com.ru.waka.app.Types.EitherResult
import com.ru.waka.app.domains.services.AccountProfileRepository
import com.ru.waka.app.infrastructures.AccountProfileRepositoryImpl

trait MixInAccountProfileRepository {
  val accountProfileRepository: AccountProfileRepository[EitherResult] =
    new AccountProfileRepositoryImpl
}
