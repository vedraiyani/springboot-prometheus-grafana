package chintan.springbootprometheus;

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
@RestController
public class SpringBootPrometheusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPrometheusApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String getProductList() {
	   return "Hello World";
	}
}
