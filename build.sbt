name := """data-dictionary"""
organization := "com.pbrandwijk"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.2" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.pbrandwijk.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.pbrandwijk.binders._"
