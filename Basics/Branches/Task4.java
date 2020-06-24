// The sizes A, B of the rectangular hole and the dimensions x, y, z of the brick are given.
// Determine if the brick will go through the hole.
package by.jonline.branche.main;

public class Task4 {
	
	public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int x = 2;
        int y = 3;
        int z = 6;
        boolean isCrawl = false;

        if (x<=a && y<= b || y<=a && x<= b)
            isCrawl = true;
        if (x<=a && z<= b || z<=a && x<= b)
            isCrawl = true;
        if (z<=a && y<= b || y<=a && z<= b)
            isCrawl = true;

        if (isCrawl)
            System.out.println("Will go through the hole");
        else
            System.out.println("Will not go through the hole");
    }
}
