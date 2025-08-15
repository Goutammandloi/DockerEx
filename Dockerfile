FROM openjdk:17

COPY target/docker-example-app.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "docker-example-app.jar"]