package th.ac.ku.kps.eng.cpe.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneNumber {
	 @JsonProperty("num")
	private String number;
	public PhoneNumber() {
		
		// TODO Auto-generated constructor stub
	}
	public PhoneNumber(String num) {
		number = num;
		// TODO Auto-generated constructor stub
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}	
}
