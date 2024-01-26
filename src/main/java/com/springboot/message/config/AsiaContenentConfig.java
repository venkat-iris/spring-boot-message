package com.springboot.message.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.client.RestTemplate;


@Configuration
public class AsiaContenentConfig {
	
	//@Value("${spring.datasource.url:jdbc:mysql://localhost:3306/asia}")
	private String url;
	
	//@Value("${spring.datasource.username:root}")
	private String userName;
	
	//@Value("${spring.datasource.password:Venkat@07}")
	private String password;
	
	//@Value("${spring.datasource.driver-class-name:com.mysql.cj.jdbc.Driver}")
	private String driverClass;
	
	//@Value("spring.jpa.hibernate.ddl-auto:update")
	private String ddl;
	
	@Autowired
	private RestTemplateBuilder builder;
	

	
	@Bean
	protected RestTemplate getRestTEmplate() {
		return builder.build();
	}

}
