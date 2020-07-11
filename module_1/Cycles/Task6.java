// Вывести на экран соответствий между символами 
// и их численными обозначениями в памяти компьютера
package by.jonline.cycle.main;

public class Task6 {

	public static void main(String[] args) {

		for (int i = 0; i < 256; i++) {
			char symbal = (char) i;
			System.out.println(i + "  " + symbal);
		}

	}

}
