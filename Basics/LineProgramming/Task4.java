//  ƒано действительное число R вида nnn.ddd
//  (три цифровых разр€да в дробной и целой част€х).
//  ѕомен€ть местами дробную и целую части числа и вывести полученное значение числа
package by.jonline.lineprogram.main;

public class Task4 {
	
	public static void main(String[] args) {
        double r = 123.456;
        double intPart;
        double fracPart;
        intPart = Math.floor(r) / 1000;
        fracPart = r % 1 * 1000;
        double result = intPart + fracPart;
        System.out.printf("%.3f", result);
    }
}
