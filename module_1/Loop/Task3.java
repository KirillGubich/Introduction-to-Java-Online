 package by.jonline.loop.main;
 
// Найти сумму квадратов первых ста чисел. 

public class Task3 {

	public static void main(String[] args) {
		
		int sqrSum = 0;
		for (int i = 1; i <= 100; i++)
			sqrSum += i * i;

		System.out.println(sqrSum);
	}
}
