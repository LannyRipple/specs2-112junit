name := "eg"

organization := "me.ljr"

version := "1.0-SNAPSHOT"

scalaVersion := "2.9.2"

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.12",
  "junit" % "junit" % "4.10"
)
