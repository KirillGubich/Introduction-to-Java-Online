// ���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������.
// ������� ������ �������� ������������ � �����, ������� � �������� � ��������� �����: ��� ����� SSc
package by.jonline.lineprogram.main;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
        // Data input
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        // Calculations
        int hours = t / 3600;
        t %= 3600;
        int minutes = t / 60;
        int seconds = t %= 60;

        System.out.println(hours + "� " + minutes + "��� " + seconds + "� ");
    }
}
