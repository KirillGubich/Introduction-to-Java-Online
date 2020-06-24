// Found max{min(a, b), min(c, d)}.
package by.jonline.branche.main;

public class Task2 {
	
	public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        
        int result;
        result = Math.max(Math.min(a,b),Math.min(c,d));
        System.out.println(result);
    }
}
