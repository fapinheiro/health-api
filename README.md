# health-api
Demonstration of Spring Actuator

## /health 
Shows application health information (a simple ‘status' when accessed over an unauthenticated connection or full message details when authenticated); it's not sensitive by default

We can implement our own health check to connect to database and show its status also.

## /info 
Displays arbitrary application info; not sensitive by default
This is app info such as version, name, description

## /metrics 
Shows ‘metrics' information for the current application; it's also sensitive by default
JVM and OS metrics such as, memory, threads, heap, connections, etc

## /trace 
Displays trace information (by default the last few HTTP requests)

## /shutdown
Greatful shutdown the application

Reference: https://www.baeldung.com/spring-boot-actuators

## docker

Play With Docker

https://medium.com/@mingderwang/how-to-create-endpoints-for-your-docker-containers-in-pwd-af6920e11c7c

docker container run --rm -d --name health-api -p 8089:8089 fapinheiro/health-api:1.0.0