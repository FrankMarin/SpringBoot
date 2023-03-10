# SpringBoot
The main goal for this demo is to show a basic microservices architecture using a gateway to consume the microservices by only one address and to balance the load by a discovery service as well.

This demostration include:
- [X] Database Manupulation using MongoDB
- [X] Basic GET and POST using org.springframework.boot / spring-boot-starter-web
- [X] Database manipulation using spring-boot-starter-data-mongodb and MongoRepository interface
- [X] Use Discovery Service to manage load balancer and multi instances for microservices using Eureka
- [X] Use API Gateway to contol the access and balance for all application request

## Product-Service
Service to add and list products Get and Post methods

## Provider-Service
Service to add and list providers and incluide a base MongoRepository implementation to find in documents by an specific enity field.

## Discovery-Service
Service to run a basic implementation for eureka server using
- *org.springframework.boot*
- *pring-cloud-starter-netflix-eureka-server*

## Api-Gateway
Gateway running all the requesto for API's implementations
- *org.springframework.boot*
- *spring-cloud-starter-gateway*
