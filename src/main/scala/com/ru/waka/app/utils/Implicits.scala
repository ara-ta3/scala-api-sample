package com.ru.waka.app.utils

object Implicits {
  implicit class RichOption[A](opt: Option[A]) {
    def orError(message: Option[String] = None,
                ex: Option[String] => Throwable = m =>
                  new NotFoundException(m.orNull, null),
    ): Either[Throwable, A] = opt.toRight(ex(message))

    def orError(message: String): Either[Throwable, A] = orError(Some(message))
  }

}
