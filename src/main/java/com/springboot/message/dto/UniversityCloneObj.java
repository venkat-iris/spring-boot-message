package com.springboot.message.dto;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UniversityCloneObj {
	
	private Long uId;
	private String uName;
	private String location;
	private LocalDate startDate;

}
