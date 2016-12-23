name := """finagle-http-auth"""
version := "1.0"
scalaVersion := "2.11.8"

lazy val finagleVersion = "6.40.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"


val validateCommands = List(
  "clean",
  "test"
)
addCommandAlias("validate", validateCommands.mkString(";", ";", ""))
