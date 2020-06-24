// Calculate the value of the function
package by.jonline.branche.main;

import java.util.Scanner;

public class Task5 {
	
	public static void main(String[] args) {
        // Input x
        Scanner xInput = new Scanner(System.in);
        double x = xInput.nextDouble();

        double result;
        result = x <= 3 ? x*x - 3*x + 9 : 1/(Math.pow(x,3) + 6);
        System.out.println(result);
    }
}
