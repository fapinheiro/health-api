package cib.isban.pt.healthapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"cib.isban.pt"})
public class HealthApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthApiApplication.class, args);
	}

}
