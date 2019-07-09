FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar hr.jar
RUN mkdir config
COPY config/application.properties config/application.properties
ENTRYPOINT ["java", "-jar", "/hr.jar"]