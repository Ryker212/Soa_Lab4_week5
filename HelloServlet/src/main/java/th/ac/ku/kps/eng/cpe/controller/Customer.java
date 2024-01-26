package th.ac.ku.kps.eng.cpe.controller;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;



public class Customer {
	private String name;
	
	private ArrayList<PhoneNumber> phonenumbers;
	
	
	public Customer(String name) {
		this.name = name;
		
	}
	
	public Customer() {
		phonenumbers = new ArrayList<PhoneNumber>();
		
	}
	@JsonProperty("hi")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@JsonProperty("olo")
	public ArrayList<PhoneNumber> getPhonenumbers() {
		return phonenumbers;
	}
	
	public void setPhonenumbers(ArrayList<PhoneNumber> phonenumbers) {
		this.phonenumbers = phonenumbers;
	}
	
}