# Quarkus - Kafka

## Contents:

In this repository, we can find the following projects:

- [Account Service Provider](account-service-provider)
- [Statistics Service Provider](statistics-service-provider)

## Build and run the project

We use Maven Wrapper to build the project.

```bash
# Build all
./mvnw clean package -Dquarkus.package.jar.type=uber-jar
# Run Account Service Provider
cd account-service-provider && \
  ../mvnw -pl account-service-provider -am quarkus:dev
# Run Statistics Service Provider
cd statistics-service-provider && \
  ../mvnw -pl statistics-service-provider -am quarkus:dev
```
