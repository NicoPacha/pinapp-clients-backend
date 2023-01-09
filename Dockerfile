FROM openjdk:17-oracle
MAINTAINER NPacha
COPY target/Client-0.0.1-SNAPSHOT.jar Client-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Client-0.0.1-SNAPSHOT.jar"]