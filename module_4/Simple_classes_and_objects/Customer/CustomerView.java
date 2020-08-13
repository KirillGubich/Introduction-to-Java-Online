package by.jonline.simple_class.customer;

import java.util.List;

public class CustomerView {
	
	// Вывод в консоль списка всех клиентов
		public void viewCustomerList(CustomerList customers) {
			System.out.println("Customer list:");
			
			for (Customer customer : customers.getCustomers()) {
				System.out.println(customer.toString());
			}	
					
			System.out.println();
		}
	
	// Вывод в консоль списка клиентов
	public void viewCustomerList(List<Customer> customers) {
		System.out.println("Customer list:");
		
		for (Customer customer : customers) {
			System.out.println(customer.toString());
		}
		
		System.out.println();
	}

}
