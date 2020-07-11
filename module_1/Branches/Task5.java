// Вычислить значение функции
package by.jonline.branche.main;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();

		double result;
		result = x <= 3 ? x * x - 3 * x + 9 : 1 / (Math.pow(x, 3) + 6);
		System.out.println(result);
	}
}
