FROM openjdk:17-jdk-slim AS build

WORKDIR /app

COPY .env /app/.env
COPY mvnw ./
COPY .mvn .mvn
COPY pom.xml ./
COPY src ./src

RUN chmod +x mvnw

RUN ./mvnw dependency:go-offline

RUN ./mvnw clean package -DskipTests

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=build /app/target/product-service-0.0.1-SNAPSHOT.jar product-service.jar
COPY --from=build /app/.env /app/.env

EXPOSE ${SERVER_PORT}

HEALTHCHECK --interval=30s --timeout=10s --retries=3 CMD curl --fail http://localhost:${SERVER_PORT}/actuator/health || exit 1

ENTRYPOINT ["java", "-jar", "/app/product-service.jar"]