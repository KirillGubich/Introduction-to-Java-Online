package by.jonline.line_program.main;

/*
   Для данной области составить линейную программу, которая печатает true, 
   если точка с координатами (х, у) 
   принадлежит закрашенной области, и false — в противном случае 
 */

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		int x;
		int y;

		// Ввод данных

		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();

		// Расчёты

		boolean isBelongs = false;
		if (y >= 0 && y <= 4 && Math.abs(x) <= 2)
			isBelongs = true;
		else if (y >= -3 && y <= 0 && Math.abs(x) <= 4)
			isBelongs = true;

		System.out.println(isBelongs);
	}
}
