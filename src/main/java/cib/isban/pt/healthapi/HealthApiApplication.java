package cib.isban.pt.healthapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"cib.isban.pt"})
@EnableJpaRepositories(basePackages={"cib.isban.pt"}) 
@EntityScan(basePackages={"cib.isban.pt"})
public class HealthApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthApiApplication.class, args);
	}

}
