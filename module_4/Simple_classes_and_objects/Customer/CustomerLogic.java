package by.jonline.simple_class.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerLogic {
	
	// Сортировка клиентов в алфавитном порядке
	public List<Customer> sortCustomers(CustomerList customerList) {
		
		List<Customer> customers;
		customers = new ArrayList<Customer>(customerList.getCustomers());
		
		for (int i = customers.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (customers.get(j).getSurname().compareTo(customers.get(j + 1).getSurname()) > 0) {
					Customer tempEl;
					tempEl = customers.get(j);
					customers.remove(j);
					customers.add(j, customers.get(j));
					customers.remove(j + 1);
					customers.add(j + 1, tempEl);
				}
			}
		}
		
		return customers;
	}
	
	// Поиск клиентов по диапазону номеров кредитной карты
	public List<Customer> getCustomersByCreditCard(CustomerList customers, long minNum, long maxNum) {
		List<Customer> suitableCustomers = new ArrayList<Customer>();
		
		for (int i = 0; i < customers.getCustomers().size(); i++) {
			Customer currentCustomer;
			currentCustomer = customers.getCustomers().get(i);
			
			boolean liesInTheRange;
			liesInTheRange = currentCustomer.getCreditCard() >= minNum && currentCustomer.getCreditCard() <= maxNum;
			
			if (liesInTheRange) {
				suitableCustomers.add(currentCustomer);
			}
		}
		
		return suitableCustomers;
	}

}
