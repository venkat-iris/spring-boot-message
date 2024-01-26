package com.springboot.message.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.generator.Generator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table
@Setter @Getter  @NoArgsConstructor
public class Customer extends BaseEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@GenericGenerator(name = "native")
	private Long customerId;
	
	
	@Column(name = "name")
	private String name;
	
	private String email;
	
	@Column(name="mobile_number")
	private Integer mobileNumber;
	

}
