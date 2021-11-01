val ScalatraVersion = "2.8.2"

organization := "com.ru.waka"

name := "acala-api-sample"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-json" % ScalatraVersion,
  "org.scalatra" %% "scalatra-swagger" % ScalatraVersion,
  "org.json4s"   %% "json4s-jackson" % "4.0.3",
  "javax.servlet" % "javax.servlet-api" % "4.0.1" % "provided"
)

enablePlugins(JettyPlugin)