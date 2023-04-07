# Demo observability with grafana-stack
* Grafana
* Tempo
* Loki

[Detail in my blog](https://www.somkiat.cc/observability-with-grafana-platform/)


Step to run
```
$docker compose build
$docker compose up -d
$docker compose ps
```

Step to test
* Call api => http://localhost:8080/demo/hi
* Search tracing data from Grafana => http://localhost:3000
