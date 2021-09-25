package com.MS.B.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("ApplicationA")
public interface ApplicationAFeign {

	//URL in @RequestMapping should be exactly like how we would call with local host
	@RequestMapping("/A/{number}")
	public ResponseEntity<String>  randomName(@PathVariable("number") String mobileNumber);
}
