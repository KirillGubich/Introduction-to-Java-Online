package by.jonline.decomposition.main;

//  Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

public class Task2 {

	public static void main(String[] args) {

		System.out.println(getGcdOfFour(256, 512, 1024, 4096));

	}

	// НОД четырех чисел
	private static int getGcdOfFour(int a, int b, int c, int d) {

		int result;
		result = getGCD(d, getGCD(c, getGCD(a, b)));

		return result;
	}

	// НОД двух чисел по агротиму Евклида
	private static int getGCD(int firstNum, int secondNum) {

		while (firstNum != secondNum) {

			if (firstNum > secondNum) {
				firstNum -= secondNum;
			} else {
				secondNum -= firstNum;
			}
		}

		return firstNum;
	}

}
