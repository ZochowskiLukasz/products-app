package soft.dev.academy.productsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class ProductsAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductsAppApplication.class, args);
	}
}
