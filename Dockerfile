# Use Java 17 as base image
FROM openjdk:17-jdk-slim

# Set working directory inside container
#WORKDIR /app

# Copy the JAR file from target folder to container
COPY target/todolist-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (Spring Boot default)
EXPOSE 8080

# Command to run when container starts
ENTRYPOINT ["java", "-jar", "app.jar"]