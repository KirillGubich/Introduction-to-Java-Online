// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
// Определить, будут ли они расположены на одной прямой. 
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
