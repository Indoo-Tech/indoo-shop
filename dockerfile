FROM openjdk:21-jdk-alpine

WORKDIR /shop

COPY build/libs/shop-0.0.1-SNAPSHOT.jar /shop/shop-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/shop/shop-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080
