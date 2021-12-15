FROM adoptopenjdk:11-jdk-hotspot AS builder
COPY gradlew .
COPY gradle gradle
COPY build.gradle.kts .
COPY settings.gradle.kts .
COPY src src
RUN chmod +x ./gradlew
RUN ./gradlew bootJar

FROM adoptopenjdk:11-jdk-hotspot
COPY --from=builder build/ligs/*.jar app.jar

ARG ENVIRONMENT

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "./app.jar", "--Dspring.profiles.active=${ENVIRONMENT}"]