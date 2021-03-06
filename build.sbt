name := """pdfrender"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "io.github.cloudify" %% "spdf" % "1.3.1"
)
