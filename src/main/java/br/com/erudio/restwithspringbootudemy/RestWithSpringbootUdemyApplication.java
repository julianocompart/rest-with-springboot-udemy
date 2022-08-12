package br.com.erudio.restwithspringbootudemy;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
	info = @Info(
		title = "SpringBoot Práticas Udemy API",
		version = "v1.0.0"
	)
)
@SpringBootApplication
public class RestWithSpringbootUdemyApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestWithSpringbootUdemyApplication.class, args);
	}

}
