scalaVersion := "2.13.8"

libraryDependencies ++= Seq(jaxbAPI, jaxbRuntime, jaxbXJC)

lazy val jaxbAPI     = "javax.xml.bind"         % "jaxb-api"     % "2.3.1"
lazy val jaxbRuntime = "org.glassfish.jaxb"     % "jaxb-runtime" % "2.3.6"
lazy val jaxbXJC     = jaxbRuntime.organization % "jaxb-xjc"     % jaxbRuntime.revision