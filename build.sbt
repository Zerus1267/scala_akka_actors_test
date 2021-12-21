name := "scala_jade_test"

version := "0.1"

scalaVersion := "2.13.7"

val AkkaVersion = "2.6.18"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test
)
libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.2" % Test
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3" % Runtime

