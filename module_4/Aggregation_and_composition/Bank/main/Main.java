package by.jonline.composition.bank.main;

import by.jonline.composition.bank.entity.*;
import by.jonline.composition.bank.logic.*;
import by.jonline.composition.bank.view.AccountView;

/*
   Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. 
   Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, 
   имеющим положительный и отрицательный балансы отдельно. 
*/

public class Main {

	public static void main(String[] args) {

		Bank bank = new Bank("MyBank");

		Customer ivanov = new Customer("Ivanov I. I.");
		Customer petrov = new Customer("Petrov P. P.");

		bank.addCustomer(ivanov);
		bank.addCustomer(petrov);

		ivanov.addAccount(new Account(44.50));
		ivanov.addAccount(new Account(187.26));
		ivanov.addAccount(new Account(-76.45));
		ivanov.getAccounts().get(1).block();

		petrov.addAccount(new Account(487.61));
		petrov.addAccount(new Account(-23.98));

		AccountView accountView = new AccountView();
		CustomerLogic customerLogic = new CustomerLogic();

		accountView.viewCustomerAccounts(ivanov);
		customerLogic.sortAccounts(ivanov);
		accountView.viewCustomerAccounts(ivanov);

		Account findAcc;
		findAcc = customerLogic.findAccount(petrov, 4);
		accountView.viewAccount(findAcc);

		double ivanovTotal;
		ivanovTotal = customerLogic.getAccountsTotal(ivanov);
		System.out.println("Ivanov total: " + ivanovTotal);

		double petrovPosTotal;
		petrovPosTotal = customerLogic.getPositiveTotal(petrov);
		System.out.println("Petrov positive total: " + petrovPosTotal);

		double petrovNegTotal;
		petrovNegTotal = customerLogic.getNegativeTotal(petrov);
		System.out.println("Petrov negative total: " + petrovNegTotal);

	}

}
