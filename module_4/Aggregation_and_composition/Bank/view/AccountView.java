package by.jonline.composition.bank.view;

import by.jonline.composition.bank.entity.Account;
import by.jonline.composition.bank.entity.Customer;

public class AccountView {

	// Вывод информации о счете
	public void viewAccount(Account account) {
		System.out.println(account.toString());
		System.out.println();
	}

	// Вывод информации о всех счетах пользователя
	public void viewCustomerAccounts(Customer customer) {
		int accIndex = 1;

		for (Account account : customer.getAccounts()) {
			System.out.print(accIndex + ") ");
			System.out.println(account.toString());
			accIndex++;
		}

		System.out.println();
	}
}
