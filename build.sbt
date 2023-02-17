name := "my-microsite"
organization := "com.necosta"

lazy val root = (project in file("."))
  .settings(
      micrositeName := "My awesome website",
      micrositeDescription := "My totally awesome website",
      micrositeAuthor := "Nelson Costa",
      micrositeHomepage := "https://necosta.github.io/my-microsite-template/",
      micrositeGithubOwner := "necosta",
      micrositeGithubRepo := "my-microsite-template",
      //micrositeGithubToken := getEnvVar("GITHUB_TOKEN"),
      micrositePushSiteWith := GitHub4s
  )
  .enablePlugins(MicrositesPlugin)
