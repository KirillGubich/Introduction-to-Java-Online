package by.jonline.composition.bank.entity;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private String name;
	private List<Customer> customers;

	public Bank(String name, List<Customer> customers) {
		this.name = name;
		this.customers = customers;
	}

	public Bank(String name) {
		this.name = name;
		customers = new ArrayList<Customer>();
		
	}

	public Bank() {
		name = "default";
		customers = new ArrayList<Customer>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", customers=" + customers + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
