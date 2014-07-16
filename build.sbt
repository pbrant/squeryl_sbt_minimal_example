name := "minimalexample"

organization := "org.squeryl"

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.1"
  
libraryDependencies ++= Seq(
    "com.h2database" % "h2" % "1.3.160",
	"org.squeryl" %% "squeryl" % "0.9.4")