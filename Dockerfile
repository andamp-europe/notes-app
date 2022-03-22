FROM openjdk:11
COPY target/notes-app-0.0.1-SNAPSHOT.jar /notes-app.jar
CMD ["java", "-jar", "/notes-app.jar"]