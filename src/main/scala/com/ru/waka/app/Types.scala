package com.ru.waka.app

object Types {
  type EitherResult[A] = Either[Throwable, A]
}
