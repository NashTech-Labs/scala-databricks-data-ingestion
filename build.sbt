ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

lazy val root = (project in file("."))
  .settings(
    name := "scala-databricks-data-ingestion",
    idePackagePrefix := Some("com.nashtech")
  )

libraryDependencies += "io.spray" %% "spray-json" % "1.3.6"
libraryDependencies += "org.scalaj" %% "scalaj-http" % "2.4.2"
libraryDependencies += "com.typesafe" % "config" % "1.4.1"