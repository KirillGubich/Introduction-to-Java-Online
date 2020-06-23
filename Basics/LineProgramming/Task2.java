// Вычислить значение выражения по формуле (все переменные принимают действительные значения)
package by.jonline.lineprogram.main;

public class Task2 {
	
	public static void main(String[] args) {
        double a = 2.5;
        double b = 3;
        double c = 2.56;
        double res;

        res = (b + Math.sqrt(Math.pow(b,2)+ 4 * a * c))/ 2*a - Math.pow(a,3)*c + Math.pow(b, -2);
        System.out.println(res);
    }
}
