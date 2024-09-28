FROM base:1

COPY target/*.jar app.jar

CMD java $JAVA_OPTS -jar app.jar
