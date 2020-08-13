package by.jonline.simple_class.customer;

import java.util.List;

/*
   Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, 
   set- и get- методы и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, 
    с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль. 
*/

public class CustomerMain {

	public static void main(String[] args) {
		
		CustomerLogic customerLogic = new CustomerLogic();
		CustomerView customerView = new CustomerView();
		
		CustomerList customerList = new CustomerList();
		
		customerList.addCustomer(new Customer("Ivanov", "Ivan", "Ivanovich", "Centralnaya str. 25", 3465, 6897345));
		customerList.addCustomer(new Customer("Petrov", "Petr", "Petrovich", "Kalinovskiy str. 134", 9540, 9520863));
		customerList.addCustomer(new Customer("Sidorov", "Nikita", "Sergeevich", "Tolstoy str. 59", 4879, 5876449));
		customerList.addCustomer(new Customer("Gagarin", "Yuriy", "Alekseevich", "Lenin str. 7", 7737, 43759305));
		customerList.addCustomer(new Customer("Frolov", "Sergey", "Vasilievich", "Yasinski str. 98", 9834, 33000058));
		
		customerView.viewCustomerList(customerList);
		
		List<Customer> customersSorted;
		customersSorted = customerLogic.sortCustomers(customerList);
		customerView.viewCustomerList(customersSorted);
		
		List<Customer> customersByCreditCard;
		customersByCreditCard = customerLogic.getCustomersByCreditCard(customerList, 3000, 6000);
		customerView.viewCustomerList(customersByCreditCard);
	}

}
