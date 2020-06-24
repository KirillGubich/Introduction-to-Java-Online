// Found max{min(a, b), min(c, d)}.
package by.jonline.branche.main;

public class Task2 {
	
	public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int result;
        result = Math.max(Math.min(a,b),Math.min(c,d));
        System.out.println(result);
    }
}
