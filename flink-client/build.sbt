name := "flink-client"

resolvers += "apache-snapshots" at "https://repository.apache.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
  "com.github.jkutner" % "env-keystore" % "0.1.2",
  "org.apache.flink" %% "flink-streaming-scala" % "1.2-SNAPSHOT",
  "org.apache.flink" %% "flink-connector-kafka-0.10" % "1.2-SNAPSHOT",
  "com.typesafe.play" %% "play-json" % "2.5.10"
)
