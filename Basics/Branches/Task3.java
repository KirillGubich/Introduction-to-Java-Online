// Three points A (x1, y1), B (x2, y2) and C (x3, y3) are given.
// Determine whether they will be located on one straight line
package by.jonline.branche.main;

public class Task3 {
	
	public static void main(String[] args) {
	    double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		
		x1 = 1;
		y1 = 1;
		x2 = 2;
		y2 = 2;
		x3 = 3;
		y3 = 3;

	    if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))
			System.out.println("Yes");
		else
			System.out.println("No");
    }
}
