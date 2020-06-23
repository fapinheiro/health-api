FROM openjdk:11-jre-slim-buster

LABEL maintainerName="Filipe Pinheiro"

LABEL maintainerEmail="filipe.alves.pinheiro@gmail.com"

ENV ENVIRONMENT dev

# Moving jar file
RUN mkdir -p /opt/health-api/
WORKDIR /opt/health-api/

# Copy jar file
COPY target/*.jar .

# Rename jar file
COPY scripts/*.sh .
RUN chmod +x rename-jar.sh
RUN ./rename-jar.sh

## Start webapp
CMD java -jar webapp.jar