package com.OpenAPIDocs.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(info = @Info(
		title = "OpenAPI Documentation using Java Springboot",
		description = "OpenAPI Documentation with Swagger UI using Java Springboot",
		version = "v1",
		contact = @Contact(
				name = "Kaushik Natua",
				email = "kaushik.natua@hyland.com"
				
		),
		license = @License(
				name = "Apache 2.0",
				url = "http://www.apache.org/licenses/LICENSE-2.0.html"
				
		)
)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}
}
