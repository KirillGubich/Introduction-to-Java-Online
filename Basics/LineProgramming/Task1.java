//  Find the value of the function: z = ( (a � 3 ) * b / 2) + c.
package by.jonline.line_program.main;

public class Task1 {
	
	public static void main(String[] args) {
        double a;
        double b;
        double c;
        
        a = 1.3;
        b = 27.6;
        c = 333.245;

        double z;
        z = ((a-3) * b/2) + c;
        System.out.println("Result: " + z);
    }
}
