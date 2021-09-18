package com.MS.A.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MS.A.dto.Adto;
import com.MS.A.entity.Aobj;
import com.MS.A.repository.Arepo;

@Service
public class Aservice {
	@Autowired
	Arepo arepo;
	
	public String create(Adto adto) {
		if(arepo.existsById(adto.getMobileNo())==true) {
			return "Already exists with mobile number";
		}
		else {
			arepo.save(Adto.prepareEntity(adto));
			return "New row created with :-"+adto.toString();
		}
	}
	
	public String getCarrier(String mobileNo) {
		if(arepo.existsById(mobileNo)==false) {
			return "No such Customer record Exists";
		}
		else {
			Optional<Aobj> obj=arepo.findById(mobileNo);
			return obj.get().getCarrierName();
		}
	}

}
