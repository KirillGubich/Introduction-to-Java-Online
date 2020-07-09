// Given two angles of the triangle (in degrees).
// Determine if such a triangle exists, and if so, will it be rectangular.
package by.jonline.branche.main;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		
        // Ввод данных
        Scanner firstInp = new Scanner(System.in);
        Scanner secondInp = new Scanner(System.in);
         int firstAngle = firstInp.nextInt();
         int secondAngle = secondInp.nextInt();

         // Расчёты
         int thirdAngle;
         thirdAngle = 180 - firstAngle - secondAngle;
         if (thirdAngle>0){
             System.out.print("Triangle exists. ");
             if (firstAngle == 90 || secondAngle == 90 || thirdAngle == 90)
                 System.out.print("Rectangular");
             else
                 System.out.print("Not rectangular");
         } else
             System.out.print("Triangle doesn't exists");
    }
}
