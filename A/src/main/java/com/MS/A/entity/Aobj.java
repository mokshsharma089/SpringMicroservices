package com.MS.A.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aobj {
	@Id
	private String mobileNo;
	private String carrierName;
	public Aobj() {
		
	}
	public Aobj(String mobileNo, String carrierName) {
		super();
		this.mobileNo = mobileNo;
		this.carrierName = carrierName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	@Override
	public String toString() {
		return "Aobj [mobileNo=" + mobileNo + ", carrierName=" + carrierName + "]";
	}

}
