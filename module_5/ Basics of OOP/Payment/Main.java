package by.jonline.oopbasic.payment;

// Создать класс Payment с внутренним классом, 
// с помощью объектов которого можно сформировать покупку из нескольких товаров

public class Main {

	public static void main(String[] args) {
		
		Payment payment = new Payment();
		
		payment.addProduct("Water", 1.25);
		payment.addProduct("Bread", 0.65);
		
		System.out.println(payment.getTotalPrice());
	}

}
