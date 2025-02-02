FROM openjdk:17-jdk-slim

COPY .env /app/.env

WORKDIR /app

COPY target/service-registry-0.0.1-SNAPSHOT.jar service-registry.jar

EXPOSE ${SERVER_PORT}

ENTRYPOINT ["java", "-jar", "service-registry.jar"]
