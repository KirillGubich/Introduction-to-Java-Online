package by.jonline.oopbasic.payment;

import java.util.ArrayList;

public class Payment {

	private ArrayList<Product> purchases;
	private double totalPrice;

	public Payment(ArrayList<Product> purchases, double totalPrice) {
		super();
		this.purchases = purchases;
		this.totalPrice = totalPrice;
	}

	public Payment() {
		purchases = new ArrayList<Product>();
		totalPrice = 0.0;
	}

	public ArrayList<Product> getPurchases() {
		return purchases;
	}

	public void setPurchases(ArrayList<Product> purchases) {
		this.purchases = purchases;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	// Добавить товар
	public void addProduct(String name, double price) {
		
		purchases.add(new Product(name, price));
		totalPrice += price;
	}

	@Override
	public String toString() {
		return "Payment purchases = " + purchases + ", totalPrice = " + totalPrice;
	}



	class Product {
		private String name;
		private double price;

		public Product() {
			name = "default";
			price = 0.0;
		}

		public Product(String name, double price) {
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Product name = " + name + ", price = " + price;
		}

	}
}
