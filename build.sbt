lazy val root = (project in file("."))
  .settings(
    name := "jsoup-scala",
    version := "0.1",
    scalaVersion := "2.13.2",
    libraryDependencies ++= Seq(
      "org.jsoup" % "jsoup" % "1.13.1",
      "org.scalatest" %% "scalatest" % "3.1.2" % "test")
  )

