package th.ac.ku.kps.eng.cpe.dao;

import java.util.ArrayList;

import th.ac.ku.kps.eng.cpe.controller.Customer;

public class CustomerDAO {
	public CustomerDAO() {
		
	}
	public  static ArrayList<Customer> getAllCustomers(){
		
		ArrayList<Customer> listOfCustomers = new ArrayList<>();
		
		Customer c1 = new Customer("Best");
		Customer c2 = new Customer("Feel");
		
		listOfCustomers.add(c1);
		listOfCustomers.add(c2);
		
		return listOfCustomers;
	}
}
