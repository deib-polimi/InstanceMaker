import sbtassembly.AssemblyPlugin.defaultShellScript

lazy val commonSettings = Seq(
  version := "0.0.1",
  scalaVersion := "2.11.7"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "InstanceMaker",
    resolvers ++= Seq(
      "Deib Polimi" at "https://github.com/deib-polimi/deib-polimi-mvn-repo/raw/master/releases",
      "Deib Polimi Snapshots" at "https://github.com/deib-polimi/deib-polimi-mvn-repo/raw/master/snapshots"
    ),
    libraryDependencies += "it.polimi.diceH2020" % "SPACE4Cloud-shared" % "0.2.2-SNAPSHOT"
  )

assemblyOption in assembly := (assemblyOption in assembly).value.copy(prependShellScript = Some(defaultShellScript))

assemblyJarName in assembly := s"${name.value}-${version.value}"
