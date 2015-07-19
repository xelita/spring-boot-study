# [spring-boot-study]

The aim of the project is to deep into Spring Boot project.

Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can “just run”. We take an opinionated view of the Spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need very little Spring configuration.
You can use Spring Boot to create Java applications that can be started using java -jar or more traditional war deployments. We also provide a command line tool that runs “spring scripts”.

More information about Spring Boot:
[http://projects.spring.io/spring-boot/](http://projects.spring.io/spring-boot/)

## Anatomy

The application is composed of a controller that makes requests to a H2 database using Spring Data JPA API.

## Usage

Several ways are available to test the application.

### Using Maven

``` bash
mvn spring-boot:run -Dspring.profiles.active=dev
```
or

### Using Bash command

``` bash
mvn clean package && java -jar target/spring-boot-study*.jar
```

### Deployment on OpenShift

The application is deployed on OpenShift thanks to OpenShift Action Hooks.

OpenShift Action Hooks are declared in the .openshift directory.

OpenShift Action Hooks order :
- The pre_build user action hook is executed, if present.
- The build user action hook is executed.
- The prepare user action hook is executed, if present.
- The deploy user action hook is executed, if present.
- The post_deploy user action hook is executed, if present.

You can test the application [here](http://study-xelita.rhcloud.com/users).