package th.ac.ku.kps.eng.cpe.controller;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
	private String name;

	private List<PhoneNumber> phoneNumbers;

	public Customer(String name) {
		this.name = name;
	}

	@JsonProperty("name")
	public String getCustomer() {
		return name;
	}
}
