# [spring-boot-study]

## Testing

### Using Maven

``` bash
mvn spring-boot:run -Dspring.profiles.active=dev
```
or

``` bash
mvn spring-boot:run -Dspring.profiles.active=prod
```

### Deployment on OpenShift

OpenShift Action Hooks are declared in the .openshift directory.

OpenShift Action Hooks order :
- The pre_build user action hook is executed, if present.
- The build user action hook is executed.
- The prepare user action hook is executed, if present.
- The deploy user action hook is executed, if present.
- The post_deploy user action hook is executed, if present.