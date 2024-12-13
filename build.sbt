organization := "com.ru.waka"

name := "scala-api-sample"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.15"

val ScalatraVersion = "2.8.2"
val scalatra = Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-json" % ScalatraVersion,
  "org.scalatra" %% "scalatra-swagger" % ScalatraVersion,
)

val ZIOVersion = "2.1.13"
val zio = Seq("dev.zio" %% "zio" % ZIOVersion)

libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-jackson" % "4.0.3",
  "javax.servlet" % "javax.servlet-api" % "4.0.1" % "provided"
) ++ scalatra ++ zio

enablePlugins(JettyPlugin)
