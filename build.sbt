ThisBuild / version := "0.1.0-SNAPSHOT"

val scala12Version = "2.12.18"
val scala13Version = "2.13.11"
val scala3Version = "3.3.0"
ThisBuild / scalaVersion := scala13Version
ThisBuild / crossScalaVersions := Seq(scala12Version, scala13Version, scala3Version)

val pekkoVersion = "1.0.1"
val jacksonVersion = "2.15.2"

lazy val root = (project in file("."))
  .settings(
    name := "pekko-serialization-jackson215",
    libraryDependencies ++= Seq(
      "org.apache.pekko" %% "pekko-actor" % pekkoVersion,
      "org.apache.pekko" %% "pekko-actor-typed" % pekkoVersion % Optional,
      "org.apache.pekko" %% "pekko-stream" % pekkoVersion % Optional,
      "com.fasterxml.jackson.core" % "jackson-databind" % jacksonVersion,
      "com.fasterxml.jackson.core" % "jackson-core" % jacksonVersion,
      "com.fasterxml.jackson.dataformat" % "jackson-dataformat-cbor" % jacksonVersion,
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jdk8" % jacksonVersion,
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % jacksonVersion,
      "com.fasterxml.jackson.module" % "jackson-module-parameter-names" % jacksonVersion,
      "com.fasterxml.jackson.module" %% "jackson-module-scala" % jacksonVersion,
      "org.lz4" % "lz4-java" % "1.8.0",
      "org.scala-lang.modules" %% "scala-java8-compat" % "1.0.2",
      "org.apache.pekko" %% "pekko-testkit" % pekkoVersion % Test,
      "org.scalatest" %% "scalatest" % "3.2.16" % Test,
      "ch.qos.logback" % "logback-classic" % "1.2.12" % Test
    ),
    javacOptions += "-parameters"
  )
