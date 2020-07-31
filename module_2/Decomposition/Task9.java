package by.jonline.decomposition.main;

/*
  Даны числа X, Y, Z, Т — длины сторон четырехугольника. 
  Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y — прямой.
*/

public class Task9 {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = 5.0;
		double t = 6.0;

		System.out.println(getQuadrangleArea(x, y, z, t));
	}

	// Площад четырехугольника, где угол между сторонами длиной X и Y — прямой
	private static double getQuadrangleArea(double x, double y, double z, double t) {
		double area = 0;

		double diagonal;
		diagonal = Math.sqrt(x * x + y * y);

		area = getTriangleArea(x, y, diagonal) + getTriangleArea(diagonal, t, z);

		return area;
	}

	// Площадь треугольника по формуле Герона
	private static double getTriangleArea(double a, double b, double c) {
		double area;
		double semiPer;

		semiPer = (a + b + c) / 2.0;
		area = Math.sqrt(semiPer * (semiPer - a) * (semiPer - b) * (semiPer - c));

		return area;
	}

}
