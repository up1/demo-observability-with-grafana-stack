FROM arm64v8/eclipse-temurin:17.0.6_10-jre-focal
WORKDIR /app
COPY ./demo/target/demo.jar .
COPY opentelemetry-javaagent.jar .
CMD java $JAVA_OPTS -jar /app/demo.jar