package by.jonline.loop.main;

//  Составить программу нахождения произведения квадратов первых двухсот чисел

public class Task4 {

	public static void main(String[] args) {

		long mult = 1;
		int i = 2;
		boolean overflow = false;

		while (i <= 200 && !overflow) {
			mult *= i * i;
			overflow = Long.MAX_VALUE / mult < (i + 1) * (i + 1);
			i++;
		}
		
		// В случае переполнения выводится соответствующее сообщение
		
		if (overflow) {
			System.out.println("Произошло переполнение!");
			System.out.println("Результат получен для первых " + (i - 1) + " чисел.");
		}

		System.out.println("Результат: " + mult);
	}
}
