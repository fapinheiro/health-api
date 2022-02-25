FROM openjdk:11-jre-slim-buster

# Created by
LABEL maintainerName="Filipe Pinheiro"
LABEL maintainerEmail="filipe.alves.pinheiro@gmail.com"

# Setup workir
RUN mkdir app
WORKDIR /app

# Copy jar file
COPY target/health-api-*.jar /app/api.jar

# Start webapp
CMD java -Dserver.port=80 -jar api.jar