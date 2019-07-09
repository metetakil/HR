FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
RUN mkdir config
COPY config/application.properties config/application.properties
ENTRYPOINT ["java","-jar","/app.jar"]