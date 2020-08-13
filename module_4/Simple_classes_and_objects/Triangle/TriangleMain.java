package by.jonline.simple_class.triangle;

/*
  Описать класс, представляющий треугольник. 
  Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.   
*/

public class TriangleMain {

	public static void main(String[] args) {

		Triangle triangle = new Triangle(new Point(1, -2), new Point(3, -1), new Point(6, 4));

		TriangleLogic triangleLogic = new TriangleLogic();

		double perimeter;
		double area;
		Point medianInt;

		perimeter = triangleLogic.getPerimeter(triangle);
		area = triangleLogic.getArea(triangle);
		medianInt = triangleLogic.getMedianIntersectionPoint(triangle);

		System.out.println("Площадь треугольника: " + area);
		System.out.println("Периметр треугольника: " + perimeter);
		System.out.println("Точка пересечения медиан: X = " + medianInt.getX() + " Y = " + medianInt.getY());

	}

}
