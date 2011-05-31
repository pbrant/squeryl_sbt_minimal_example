import sbt._

class ExampleProject(info: ProjectInfo) extends DefaultProject(info) with IdeaProject {
    val squeryl = "org.squeryl" %% "squeryl" % "0.9.4" % "compile" withSources()
    val h2 = "com.h2database" % "h2" % "1.2.127" withSources()
}
