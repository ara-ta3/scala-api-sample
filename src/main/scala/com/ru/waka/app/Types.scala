package com.ru.waka.app

object Types {
  type EitherResult[A] = Either[Throwable, A]
  type DatabaseIO[T] = Either[Throwable, T]
}
