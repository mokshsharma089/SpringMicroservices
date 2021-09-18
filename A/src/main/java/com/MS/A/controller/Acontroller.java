package com.MS.A.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MS.A.dto.Adto;
import com.MS.A.service.Aservice;

@RestController
@RequestMapping("/A")
public class Acontroller {

	@Autowired
	private Aservice aserv;
	
	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody Adto adto){
		return ResponseEntity.ok(aserv.create(adto));
	}
	
	@GetMapping("/{mobileNumber}")
	public ResponseEntity<String> getCarrier(@PathVariable String mobileNumber){
		return ResponseEntity.ok(aserv.getCarrier(mobileNumber));
	}
}
