FROM openjdk:8
COPY ./target/Calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "src/main/java/Calculator/Calculator", "./target/Calculator-1.0-SNAPSHOT.jar", "Calculator"]
