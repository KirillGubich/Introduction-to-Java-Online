package by.jonline.loop.main;

/*
   Даны числовой ряд и некоторое число е. 
   Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
*/

public class Task5 {

	public static void main(String[] args) {

		double e;
		e = 0.0002;

		double rowSum = 0;

		double rowEl;
		rowEl = 1 / 2d + 1 / 3d; // Значение первого элемента посследовательности

		int n = 2;

		while (rowEl > e) {
			rowSum += rowEl;
			rowEl = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
			n++;
		}
		System.out.println("Результат: " + rowSum);
	}

}