package by.jonline.composition.bank.logic;

import java.util.List;

import by.jonline.composition.bank.entity.Account;
import by.jonline.composition.bank.entity.Customer;

public class CustomerLogic {

	// Сортировка счетов клиента по возрастанию баланса
	public void sortAccounts(Customer customer) {
		List<Account> accounts = customer.getAccounts();

		for (int i = accounts.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (accounts.get(j).getBalance() > accounts.get(j + 1).getBalance()) {
					Account tempEl;
					tempEl = accounts.get(j);
					accounts.remove(j);
					accounts.add(j, accounts.get(j));
					accounts.remove(j + 1);
					accounts.add(j + 1, tempEl);
				}
			}
		}

	}

	// Поиск счета по номеру
	public Account findAccount(Customer customer, int id) {
		for (Account account : customer.getAccounts()) {
			if (account.getID() == id) {
				return account;
			}
		}

		return null;
	}

	// Вычисление общей суммы по счетам
	public double getAccountsTotal(Customer customer) {
		double total = 0;

		for (Account account : customer.getAccounts()) {
			total += account.getBalance();
		}

		return total;
	}

	// Вычисление суммы по всем счетам, имеющим положительный баланс
	public double getPositiveTotal(Customer customer) {
		double total = 0;

		for (Account account : customer.getAccounts()) {
			if (account.getBalance() > 0) {
				total += account.getBalance();
			}
		}

		return total;
	}
	
	// Вычисление суммы по всем счетам, имеющим отрицательный баланс
	public double getNegativeTotal(Customer customer) {
		double total = 0;

		for (Account account : customer.getAccounts()) {
			if (account.getBalance() < 0) {
				total += account.getBalance();
			}
		}

		return total;
	}

}
