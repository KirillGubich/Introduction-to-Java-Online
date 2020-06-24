// Напишите программу, где пользователь вводит любое целое положительное число. 
// А программа суммирует все числа от 1 до введенного пользователем числа. 
 
package by.jonline.cycle.main;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		// ¬вод данных
        Scanner numInput = new Scanner(System.in);
        int num = numInput.nextInt();

        // –асчЄты
        int sum = 0;
        for (int i = 1; i <= num; i++)
            sum += i;

        System.out.println(sum);
	}
}