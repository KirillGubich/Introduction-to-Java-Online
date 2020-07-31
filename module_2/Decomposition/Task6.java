package by.jonline.decomposition.main;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми

public class Task6 {

	public static void main(String[] args) {

		System.out.println(areCoprimeNumbers(2, 4, 8));

	}

	// проверка, являются ли данные три числа взаимно простыми
	private static boolean areCoprimeNumbers(int a, int b, int c) {

		return getGcdOfThree(a, b, c) == 1;
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

	// НОД трех чисел
	private static int getGcdOfThree(int a, int b, int c) {

		int result;
		result = getGCD(c, getGCD(a, b));

		return result;
	}

}
