FROM openjdk:8-jdk-alpine
EXPOSE 8080
COPY target/studentservice-0.0.1-SNAPSHOT.jar studentservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/studentservice-0.0.1-SNAPSHOT.jar"]