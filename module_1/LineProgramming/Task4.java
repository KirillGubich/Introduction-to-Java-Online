// Given a real number R of the form nnn.ddd
// (three digital digits in fractional and integer parts).
// Swap the fractional and integer parts of the number 
// and print the resulting value of the number
package by.jonline.line_program.main;

public class Task4 {

	public static void main(String[] args) {
		double r;

		r = 123.456;

		double intPart;
		double fracPart;
		intPart = Math.floor(r) / 1000;
		fracPart = r % 1 * 1000;
		double result = intPart + fracPart;
		System.out.printf("%.3f", result);
	}
}
