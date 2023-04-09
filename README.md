# Demo observability with grafana-stack (Tracing)
* [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
* Grafana
* Tempo

[Detail in my blog](https://www.somkiat.cc/observability-with-grafana-platform/)


## Step to run

### 1. Build service

Service 1
```
$cd agent/demo
$mvnw package
```

Service 2
```
$cd agent/service2
$mvnw package
```

### 2. Build and start service with Docker compose
```
$docker compose build
$docker compose up -d
$docker compose ps
$docker compose logs --follow
```

### 3. Test and see result
* Call api from service 1 => http://localhost:8080/demo/hi
* Call api from service 1 => http://localhost:8081/target
* Search tracing data from Grafana => http://localhost:3000/explore
