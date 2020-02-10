FROM maven:3.6.1-jdk-13-alpine as build

RUN mkdir /app
WORKDIR /app

COPY ./src ./src
COPY ./pom.xml .
RUN mvn clean install

FROM openjdk:13-alpine
WORKDIR /app

COPY --from=build /app/target/primes-0.0.1-SNAPSHOT.jar /app

CMD java -jar primes-0.0.1-SNAPSHOT.jar
