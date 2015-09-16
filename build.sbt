name := """peripleo-wrapper-trial"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.webjars" % "requirejs" % "2.1.14-1",
  "org.webjars" % "jquery" % "1.9.1",
  "org.webjars" % "leaflet" % "0.7.5",
  "org.webjars.bower" % "velocity" % "1.2.2",
  "org.webjars.bower" % "numeral" % "1.5.3",
  "org.webjars" % "typeaheadjs" % "0.11.1",
  specs2 % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
