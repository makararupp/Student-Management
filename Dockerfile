# start with best image containing java runtime
FROM openjdk:17 as build

# Imformation of own or maintaner image
MAINTAINER studentmanagemetsystem

# Add the application's jar to container
COPY target/Student-Management-0.0.1-SNAPSHOT.jar Student-Management-0.0.1-SNAPSHOT.jar

# Execute the apllication
ENTRYPOINT ["java","-jar","/Student-Management-0.0.1-SNAPSHOT.jar"]