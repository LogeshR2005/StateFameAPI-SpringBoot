FROM maven:3.8.5-openjdk-17 AS build

COPY . .
RUN mvn clean package -DSkipTests
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/CulturalPopularity-0.0.1-SNAPSHOT.jar CulturalPopularity.jar

EXPOSE 8095

ENTRYPOINT ["java","-jar","CulturalPopularity.jar"]
