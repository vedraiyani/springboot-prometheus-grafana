# chintan-springboot-prometheus

Steps to run on docker:

mvn clean package

docker build -t chintan-springboot-prometheus .

docker-compose up -d

---------------------------

Above steps will run chintan-service and expose on port 8080

Prometheus Metrics Endpoint-
http://localhost:9000/prometheus or http://chintan-service:9000/prometheus

Prometheus Service will run on a new container on port 9090
http://localhost:9090

AlertManager will run on a new container on port 9093
http://localhost:9093

Grafana will run on a new container on port 3000
http://localhost:3000
Creds - admin/admin

----------------------------
Service Details-
----------------
Prometheus will have 1 alert rule configured for Instance down Alert.
Metrics from chintan-service will be scraped by prometheus in real time

AlertManager.yml has placeholder for webhook API URL and slack channel name. Configure it as per environment.

Grafana data source needs to be configured.
