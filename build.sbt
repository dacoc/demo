import Dependencies._

lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      organization := "com.demo",
      scalaVersion := "2.12.1"    
    )),
    name := "demoapp",
    assemblyJarName in assembly := "something.jar",
    libraryDependencies += scalaTest % Test
  )
