val ScalatraVersion = "2.8.2"

organization := "com.ru.waka"

name := "scala-api-sample"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-jackson" % "4.0.3",
  "javax.servlet" % "javax.servlet-api" % "4.0.1" % "provided"
) ++ scalatra ++ sangria

val scalatra = Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-json" % ScalatraVersion,
  "org.scalatra" %% "scalatra-swagger" % ScalatraVersion,
)

val sangria = Seq(
  "org.sangria-graphql" %% "sangria" % "3.4.0",
  "org.sangria-graphql" %% "sangria-json4s-jackson" % "2.0.1"
)

enablePlugins(JettyPlugin)
