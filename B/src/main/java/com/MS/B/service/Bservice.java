package com.MS.B.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.MS.B.dto.Bdto;
import com.MS.B.entity.Bobj;
import com.MS.B.repository.Brepo;

@Service
public class Bservice {

	@Autowired
	Brepo brepo;
	
	@Autowired
	RestTemplate template;
	
	public String create(Bdto bdto) {
		if(brepo.existsById(bdto.getName())) {
			return "Customer exists already";
		}
		else {
			brepo.save(Bdto.prepareEntity(bdto));
			return "New Customer Added:- "+bdto.toString();
		}
	}
	
	public String getCustomerCarrier(String name) {
		if(brepo.existsById(name)==false) {
			return "No such Customer record Exists";
		}
		else {
			Optional<Bobj> obj=brepo.findById(name);
			String number =obj.get().getMobileNo();
			//To be used before Eureka Service 
			//String url="http://localhost:8000/A/"+number;
			
			//with eureka service directly give microservices name(registered via spring.application.name)
			String url="http://ApplicationA/A/"+number;
			ResponseEntity<String> entity = template.getForEntity(url, String.class);
			String mobileCarrier = entity.getBody();
			return mobileCarrier;
		}
		
	}
}
