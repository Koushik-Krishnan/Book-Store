FROM openjdk:18-jdk
VOLUME /tmp
COPY target/bookstore-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080