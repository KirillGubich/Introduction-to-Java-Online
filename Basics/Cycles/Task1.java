// �������� ������� ������������
package by.jonline.cycle.main;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		// ���� ������
        Scanner numInput = new Scanner(System.in);
        int num = numInput.nextInt();

        // �������
        int sum = 0;
        for (int i = 1; i <= num; i++)
            sum += i;

        System.out.println(sum);
	}
}