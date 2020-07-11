// Составить программу нахождения произведения квадратов первых двухсот чисел
package by.jonline.cycle.main;

import java.math.BigInteger;

public class Task4 {
	
	public static void main(String[] args) {
		BigInteger mult = BigInteger.valueOf(1);
		for (int i = 2; i <= 200 ; i++) {
			BigInteger num = BigInteger.valueOf(i*i);
			mult = mult.multiply(num);		
		}
		System.out.println(mult);
	}
}
