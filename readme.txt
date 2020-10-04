Steps to run on docker:

//build the solution jar
mvn clean package

//create image
docker build -t chintan-springboot-prometheus .

//run docker container
docker-compose up -d

---------------------------

Above steps will run chintan-service and expose on port 9000

Prometheus Metrics Endpoint-
http://localhost:9000/prometheus or http://chintan-service:9000/prometheus

Prometheus Service will run on a new container on port 9090
http://localhost:9090

Grafana will run on a new container on port 3000
http://localhost:3000
Creds - admin/admin

----------------------------
Service Details-
----------------
Prometheus will have 1 alert rule configured for Instance down Alert.
Metrics from chintan-service will be scraped by prometheus in real time

Grafana data source needs to be configured.
