FROM openjdk:21-jdk

COPY target/*.jar /app.jar

CMD [ "java", "-jar", "/app.jar" ]