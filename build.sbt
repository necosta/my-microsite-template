name := "my-microsite-template"
organization := "com.necosta"

lazy val `sbt-microsites` = (project in file("."))
  .settings(moduleName := "my-microsite-template")
