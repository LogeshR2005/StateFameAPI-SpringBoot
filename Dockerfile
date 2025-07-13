# ---- Build Stage ----
FROM maven:3.8.5-openjdk-17 AS build

# Set working directory
WORKDIR /app

# Copy project files
COPY pom.xml .
COPY src ./src

# Build the application (skipping tests)
RUN mvn clean package -DskipTests

# ---- Runtime Stage ----
FROM openjdk:17.0.1-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built jar from the build stage
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar demo.jar

# Expose the application port
EXPOSE 8095

# Start the application
ENTRYPOINT ["java", "-jar", "demo.jar"]
