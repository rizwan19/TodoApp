# Use an official OpenJDK runtime as a parent image
FROM openjdk:22

# Set the working directory
WORKDIR /app

# Copy the application JAR file
COPY target/Todo-Application-0.0.1-SNAPSHOT.jar app.jar

# Expose the application's port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
