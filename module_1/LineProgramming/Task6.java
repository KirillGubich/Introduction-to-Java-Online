// ��� ������ ������� ��������� �������� ���������, ������� �������� true, 
// ���� ����� � ������������ (�, �) ����������� ����������� �������, � false � � ��������� ������
package by.jonline.line_program.main;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// Data input
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();

		// Calculations
		boolean result = false;
		if (y >= 0 && y <= 4 && Math.abs(x) <= 2)
			result = true;
		else if (y >= -3 && y <= 0 && Math.abs(x) <= 4)
			result = true;

		System.out.println(result);
	}
}
