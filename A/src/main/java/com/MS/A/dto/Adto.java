package com.MS.A.dto;

import com.MS.A.entity.Aobj;

public class Adto {
	private String mobileNo;
	private String carrierName;
	public Adto(){}
	public Adto(String mobileNo, String carrierName) {
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
		return "Adto [mobileNo=" + mobileNo + ", carrierName=" + carrierName + "]";
	}
	public static Aobj prepareEntity(Adto adto) {
		Aobj temp=new Aobj(adto.getMobileNo(),adto.getCarrierName());
		return temp;
	}
	
	
}
