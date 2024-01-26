package com.springboot.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;




//@EnableSwagger2
@SpringBootApplication
@OpenAPIDefinition(info = @Info(
	title = "INDIANBANK",
	description = "This bank will perform all savingbank operations to customers",
	version = "1.0",
	license = @License(name = "Apache Licence",
						url = "http://apache/com"
			),
	contact = @Contact(name="Venkat-Iris",email = "Venkat@Company.com"),
	summary = "This bank located at all over india and large nuber of customers and provide operation to all aged customers"
	
	
))
public class SpringBootMessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMessageApplication.class, args);
	}

}
