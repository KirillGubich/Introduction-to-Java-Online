package by.jonline.composition.bank.entity;

public class Account {

	private static int nextID = 1;
	private final int ID;
	private double balance;
	private boolean isBlocked;

	public Account() {
		ID = nextID++;
		balance = 0.0;
		isBlocked = false;
	}

	public Account(double balance, boolean isBlocked) {
		ID = nextID++;
		this.balance = balance;
		this.isBlocked = isBlocked;
	}

	public Account(double balance) {
		ID = nextID++;
		this.balance = balance;
		isBlocked = false;
		;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void block() {
		isBlocked = true;
	}

	public void unblock() {
		isBlocked = false;
	}

	public int getID() {
		return ID;
	}

	@Override
	public String toString() {
		return "Account ID = " + ID + ", balance = " + balance + (isBlocked ? " Blocked" : " Unblocked");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isBlocked ? 1231 : 1237);
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
		Account other = (Account) obj;
		if (ID != other.ID)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (isBlocked != other.isBlocked)
			return false;
		return true;
	}

}
