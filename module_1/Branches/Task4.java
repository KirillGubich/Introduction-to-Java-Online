// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
// Определить, пройдет ли кирпич через отверстие.
package by.jonline.branche.main;

public class Task4 {

	public static void main(String[] args) {
		int a;
		int b;
		int x;
		int y;
		int z;

		a = 5;
		b = 3;
		x = 2;
		y = 3;
		z = 6;

		boolean isCrawl = false;

		if (x <= a && y <= b || y <= a && x <= b)
			isCrawl = true;
		if (x <= a && z <= b || z <= a && x <= b)
			isCrawl = true;
		if (z <= a && y <= b || y <= a && z <= b)
			isCrawl = true;

		if (isCrawl)
			System.out.println("Will go through the hole");
		else
			System.out.println("Will not go through the hole");
	}
}
