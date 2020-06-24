package by.jonline.cycle.main;

import java.util.Scanner;

public class Task5 {
	
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
