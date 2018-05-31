import AssemblyKeys._

assemblySettings

name := "PredictionIo-lingpipe-MultiLabelClassification"

organization := "org.apache.predictionio"

scalaVersion := "2.10.6"

libraryDependencies ++= Seq(
  "org.apache.predictionio" %% "apache-predictionio-core" % "0.12.0-incubating" % "provided",
  "de.julielab" % "aliasi-lingpipe" % "4.1.0",
  "org.carrot2" % "carrot2-core" % "3.11.0",
  "org.apache.spark" %% "spark-core" % "1.3.0" % "provided",
  "org.apache.spark" %% "spark-mllib" % "1.3.0" % "provided",
  "org.scalatest" % "scalatest_2.10" % "2.2.1" % "test",
  //"com.google.guava" % "guava" % "12.0",
  "org.jblas" % "jblas" % "1.2.4"
)
	