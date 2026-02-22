FROM eclipse-temurin:21-jdk

# Container ke andar ka working directory
WORKDIR /app

# Tumhara compile kiya hua JAR file container mein copy karna
COPY target/redistut-0.0.1-SNAPSHOT.jar app.jar

# Port 8080 expose karna taaki tum browser se access kar sako
EXPOSE 8080

# App ko run karne ka command
ENTRYPOINT ["java", "-jar", "app.jar"]