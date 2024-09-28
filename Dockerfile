FROM openjdk:21-jdk

COPY target/*.jar app.jar

CMD java $JAVA_OPTS -jar app.jar
