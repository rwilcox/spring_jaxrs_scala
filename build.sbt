import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.3",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    resolvers ++= Seq(
      "spring releases" at "https://repo.spring.io/milestone",
      "mvnrepo" at "https://mvnrepository.com/artifact/",
      "maven" at "https://repo.maven.apache.org/maven2/"
    ),
  libraryDependencies += "javax.ws.rs" % "javax.ws.rs-api" % "2.1" artifacts( Artifact("javax.ws.rs-api", "jar", "jar")), // this is a workaround for jax-rs/api#571
    libraryDependencies ++= Seq(
      scalaTest % Test ,
      "org.springframework.boot" % "spring-boot-starter-jersey" % "2.0.0.RC1",
      "org.springframework.boot" % "spring-boot-starter-data-mongodb-reactive" % "2.0.0.RC1"
    )
  )
