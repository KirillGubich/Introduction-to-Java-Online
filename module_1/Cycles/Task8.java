//  Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. 
package by.jonline.cycle.main;

import java.util.HashSet;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int firstNum = in.nextInt();
		int secondNum = in.nextInt();
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

}
