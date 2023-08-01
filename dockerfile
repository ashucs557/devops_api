# Fetching latest version of Java
FROM openjdk:17
 
# Setting up work directory
WORKDIR /app

# Copy the jar file into our app
COPY ./target/devops_api-0.0.1-SNAPSHOT.jar /app

# Exposing port 8081
EXPOSE 8081

# Starting the application
CMD ["java", "-jar", "devops-0.0.1-SNAPSHOT.jar"]