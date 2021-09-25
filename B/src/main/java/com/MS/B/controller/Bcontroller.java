package com.MS.B.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MS.B.dto.Bdto;
import com.MS.B.service.Bservice;

@RestController
@RequestMapping("/B")
public class Bcontroller {

	@Autowired
	Bservice bserv;
	
	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody Bdto bdto){
		return ResponseEntity.ok(bserv.create(bdto));
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<String> getCustomerCarrier(@PathVariable String name){
		return ResponseEntity.ok(bserv.getCustomerCarrier(name));
	}
	
	@GetMapping("/feign/{name}")
	public ResponseEntity<String> getCustomerCarrierUsingFeign(@PathVariable String name){
		return ResponseEntity.ok(bserv.getCustomerCarrierUsingFeign(name));
	}
	
}
