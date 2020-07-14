package by.jonline.line_program.main;

// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
// Поменять местами дробную и целую части числа и вывести полученное значение числа. 

public class Task4 {

	public static void main(String[] args) {
		double r;

		r = 654.321;

		double intPart; 	// целая часть числа
		double fracPart;	// дробная часть числа
		
		intPart = (int) r;
		fracPart = r % 1;
		double result = intPart / 1000 + fracPart * 1000;
		System.out.printf("%.3f", result);
	}
}
