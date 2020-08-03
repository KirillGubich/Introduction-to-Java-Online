package by.jonline.decomposition.main;

//  Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9. 

public class Task7 {

	public static void main(String[] args) {

		System.out.println(oddFactorialSum(1, 9));
	}

	// Сумма факториалов нечетных чисел
	private static int oddFactorialSum(int min, int max) {
		int sum = 0;

		for (int i = min; i <= max; i++) {

			if (i % 2 == 1) {
				sum += factorial(i);
			}

		}

		return sum;
	}

	// Факториал числа
	private static int factorial(int num) {
		int result = 1;

		for (int i = 1; i <= num; i++) {
			result *= i;
		}

		return result;
	}

}
