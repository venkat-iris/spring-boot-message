package com.springboot.message.services;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.message.dto.UniversityCloneObj;

@Service
public class AsiaContServices {
	
	@Autowired
	RestTemplate template;

	public List<UniversityCloneObj>consumeRestService() {
		//template.
		//List<UniversityCloneObj> obj = template.getForObject("http://localhost:9090/uni/all",
		//UniversityCloneObj.class
		//,Collections.singletonMap("id", 7l)
		//);
		return null;
	}
}
