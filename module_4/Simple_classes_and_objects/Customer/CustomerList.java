package by.jonline.simple_class.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {

	private List<Customer> customers;

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public CustomerList() {
		customers = new ArrayList<Customer>();
	}

	public CustomerList(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}
