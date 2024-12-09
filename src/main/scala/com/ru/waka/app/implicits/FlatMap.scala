package com.ru.waka.app.implicits

trait FlatMap[F[_]] {
  def flatMap[A, B](fa: F[A])(f: A => F[B]): F[B]
  def pure[A](a: A): F[A]
  def map[A, B](fa: F[A])(f: A => B): F[B] = flatMap(fa)(a => pure(f(a)))
}

object FlatMap {
  implicit val optionFlatMap: FlatMap[Option] = new FlatMap[Option] {
    def flatMap[A, B](fa: Option[A])(f: A => Option[B]): Option[B] =
      fa.flatMap(f)

    def pure[A](a: A): Option[A] = Some(a)
  }

  implicit val eitherThrowableFlatMap: FlatMap[EitherThrowable] =
    new FlatMap[EitherThrowable] {
      def flatMap[A, B](
        fa: EitherThrowable[A]
      )(f: A => EitherThrowable[B]): EitherThrowable[B] =
        fa match {
          case Left(e)  => Left(e)
          case Right(a) => f(a)
        }

      def pure[A](a: A): EitherThrowable[A] = Right(a)
    }
  type EitherThrowable[A] = Either[Throwable, A]
}

// 型エイリアス
