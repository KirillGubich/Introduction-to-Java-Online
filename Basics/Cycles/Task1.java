// Write a program where the user enters any positive integer.
// And the program sums all numbers from 1 to the number entered by the user
package by.jonline.cycle.main;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
        // Data input
        Scanner numInput = new Scanner(System.in);
        int num = numInput.nextInt();

        // Calculations
        int sum = 0;
        for (int i = 1; i <= num; i++)
            sum += i;

        System.out.println(sum);
    }
}
