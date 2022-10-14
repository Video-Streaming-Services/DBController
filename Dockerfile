FROM openjdk:8
EXPOSE 8090
ADD target/DBController.jar DBController.jar
ENTRYPOINT ["java","-jar","DBController.jar"]
