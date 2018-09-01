FROM maven:3-jdk-8-alpine AS build
WORKDIR /usr/src/mm
COPY pom.xml ./
RUN mvn -B -s /usr/share/maven/ref/settings-docker.xml dependency:go-offline

COPY src ./src/
RUN mvn -B -s /usr/share/maven/ref/settings-docker.xml package -DskipTests

FROM openjdk:8-jre-alpine

COPY --from=build /usr/src/mm/target/material-management-backend-*.jar /jar/
ENTRYPOINT java -Dspring.profiles.active=production -jar /jar/material-management-backend-*.jar
