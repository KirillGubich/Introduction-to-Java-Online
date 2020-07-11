// Даны два угла треугольника (в градусах). 
// Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным. 
package by.jonline.branche.main;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Ввод данных
		Scanner in = new Scanner(System.in);
		int firstAngle = in.nextInt();
		int secondAngle = in.nextInt();

		// Расчёты
		int thirdAngle;
		thirdAngle = 180 - firstAngle - secondAngle;
		if (thirdAngle > 0) {
			System.out.print("Triangle exists. ");
			if (firstAngle == 90 || secondAngle == 90 || thirdAngle == 90)
				System.out.print("Rectangular");
			else
				System.out.print("Not rectangular");
		} else
			System.out.print("Triangle doesn't exists");
	}
}
