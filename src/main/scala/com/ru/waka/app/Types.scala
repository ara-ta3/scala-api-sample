package com.ru.waka.app

object Types {
  type EitherThrowable[A] = Either[Throwable, A]
}
