FROM java:8-jdk
RUN mkdir /app
WORKDIR /app
COPY target/chintan-springboot-prometheus-0.0.1-SNAPSHOT.jar /app
COPY jmx/jmx_prometheus_javaagent-0.14.0.jar /app
COPY jmx/config.yaml /app
ENTRYPOINT ["java", "-javaagent:jmx_prometheus_javaagent-0.14.0.jar=8081:config.yaml", "-jar", "/app/chintan-springboot-prometheus-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
EXPOSE 8081