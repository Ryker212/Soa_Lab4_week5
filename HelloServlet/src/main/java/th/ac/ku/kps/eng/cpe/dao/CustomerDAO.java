package th.ac.ku.kps.eng.cpe.dao;

import java.util.ArrayList;

import th.ac.ku.kps.eng.cpe.controller.Customer;
import th.ac.ku.kps.eng.cpe.controller.PhoneNumber;

public class CustomerDAO {
	public CustomerDAO() {
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<Customer> getAllCustomers()
	{	
		ArrayList<Customer> listOfCustomers = new ArrayList<Customer>();
		
		Customer c1 = new Customer();
		c1.setName("feel");
		ArrayList<PhoneNumber> p1 = new ArrayList<PhoneNumber>();
		p1.add(new PhoneNumber("097"));
		p1.add(new PhoneNumber("095"));
		c1.setPhonenumbers(p1);
		Customer c2 = new Customer();
		c2.setName("didkuy");
		listOfCustomers.add(c1);
		listOfCustomers.add(c2);
		
		return listOfCustomers;
	}
}
