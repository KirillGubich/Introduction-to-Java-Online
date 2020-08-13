package by.jonline.simple_class.train;

import java.util.Scanner;

public class UserDataInput {

	// Получение номера поезда
	public int getTrainNumber() {

		int trainNumber;
		boolean incorrectInput;

		do {
			trainNumber = getIntFromConsole("Train number = ");
			incorrectInput = trainNumber <= 0;
			if (incorrectInput) {
				System.out.println("Incorrect input.");
			}
		} while (incorrectInput);

		return trainNumber;
	}

	// Ввод с консоли целого числа
	private static int getIntFromConsole(String message) {
		int num;

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.print(">> " + message);
		while (!in.hasNextInt()) {
			in.next();
			System.out.print("Incorrect input. >> ");
		}
		num = in.nextInt();

		return num;
	}

}
