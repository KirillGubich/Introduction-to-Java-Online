package by.jonline.loop.main;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. 

import java.util.HashSet;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		int firstNum;
		int secondNum;
		
		firstNum = Math.abs(getIntFromConsole());
		secondNum = Math.abs(getIntFromConsole());
		
		HashSet<Integer> intSet = new HashSet<>();
		HashSet<Integer> resSet = new HashSet<>();

		while (firstNum != 0) {
			intSet.add(firstNum % 10);
			firstNum /= 10;
		}

		while (secondNum != 0) {
			if (intSet.contains(secondNum % 10)) {
				resSet.add(secondNum % 10);
			}
			secondNum /= 10;
		}
		System.out.println(resSet);

	}

	// Ввод с консоли целого числа
	private static int getIntFromConsole() {

		int num;
		Scanner in = new Scanner(System.in);

		System.out.print(">> ");
		while (!in.hasNextInt()) {
			in.next();
			System.out.print(">> ");
		}
		num = in.nextInt();

		return num;
	}
}
