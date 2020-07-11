// ��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, 
// ����� ������� � ������ �����. m � n �������� � ����������. 

package by.jonline.cycle.main;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		System.out.println();

		for (int i = m; i <= n; i++) {
			getDividers(i);
		}
	}

	// ����� ���� ��������� �����
	public static void getDividers(int num) {
		System.out.print(num + "  : ");
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

}
