package by.jonline.decomposition.main;

/*
   Написать метод(методы) для нахождения наибольшего общего делителя 
   и наименьшего общего кратного двух натуральных чисел
*/

public class Task1 {

	public static void main(String[] args) {

		System.out.println(getGCD(14, 77));
		System.out.println(getLCM(18, 16));

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

	// НОК двух чисел
	private static int getLCM(int firstNum, int secondNum) {

		int lcm;
		lcm = firstNum * secondNum / getGCD(firstNum, secondNum);

		return lcm;
	}

}
