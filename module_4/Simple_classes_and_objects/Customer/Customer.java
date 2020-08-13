package by.jonline.simple_class.customer;

public class Customer {

	private static int nextId = 1;
	private final int id;
	private String surname;
	private String name;
	private String patronymic;
	private String adress;
	private long creditCard;
	private long bankAccount;

	public Customer(String surname, String name, String patronymic, String adress, long creditCard, long bankAccount) {
		this.id = nextId++;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.adress = adress;
		this.creditCard = creditCard;
		this.bankAccount = bankAccount;
	}

	public Customer() {
		id = nextId++;
		name = "default";
		surname = "default";
		patronymic = "default";
		adress = "default";
		creditCard = 0;
		bankAccount = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(long creditCard) {
		this.creditCard = creditCard;
	}

	public long getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(long bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "Customer id " + id + ":  " + surname + " " + name + " " + patronymic + ", adress: " + adress
				+ ", creditCard: " + creditCard + ", bankAccount: " + bankAccount;
	}

}
