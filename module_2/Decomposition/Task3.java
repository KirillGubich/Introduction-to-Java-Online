package by.jonline.decomposition.main;

// Вычислить площадь правильного шестиугольника со стороной а, 
// используя метод вычисления площади треугольника. 

public class Task3 {

	public static void main(String[] args) {

		System.out.println(getHexagonalArea(5));

	}

	// Площадь шестиугольника
	private static double getHexagonalArea(int a) {

		double area;

		final int SIDES_NUM = 6;
		area = SIDES_NUM * getTriangleArea(a, a, a);

		return area;
	}

	// Площадь треугольника по формуле Герона
	private static double getTriangleArea(int a, int b, int c) {
		double area;
		double semiPer;

		semiPer = (a + b + c) / 2.0;
		area = Math.sqrt(semiPer * (semiPer - a) * (semiPer - b) * (semiPer - c));

		return area;
	}
}
