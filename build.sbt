name := "my-microsite-template"
organization := "com.necosta"

lazy val root = (project in file("."))
  .settings(moduleName := "site")

lazy val docs = (project in file("website"))
  .dependsOn(root)
  .enablePlugins(MdocPlugin)
