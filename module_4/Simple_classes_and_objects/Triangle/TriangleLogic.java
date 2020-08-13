package by.jonline.simple_class.triangle;

public class TriangleLogic {

	public double getArea(Triangle triangle) {
		double area;
		double semiPer;

		double[] sides;
		sides = getTriangleSides(triangle);

		semiPer = (sides[0] + sides[1] + sides[2]) / 2.0;
		area = Math.sqrt(semiPer * (semiPer - sides[0]) * (semiPer - sides[1]) * (semiPer - sides[2]));

		return area;
	}

	public double getPerimeter(Triangle triangle) {
		double perimeter;

		double[] sides;
		sides = getTriangleSides(triangle);

		perimeter = sides[0] + sides[1] + sides[2];

		return perimeter;

	}

	 public Point getMedianIntersectionPoint(Triangle triangle) {
		 
		 double x;
		 double y;
		 
		 x = (triangle.getA().getX() + triangle.getB().getX() + triangle.getC().getX()) / 3;
		 y = (triangle.getA().getY() + triangle.getB().getY() + triangle.getC().getY()) / 3;
		 
		 Point medianIntersection = new Point(x, y);

		 return medianIntersection;
	}

	private static double getDistance(Point a, Point b) {
		double distance;
		distance = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));

		return distance;
	}

	private static double[] getTriangleSides(Triangle triangle) {

		double a;
		double b;
		double c;

		a = getDistance(triangle.getA(), triangle.getB());
		b = getDistance(triangle.getB(), triangle.getC());
		c = getDistance(triangle.getA(), triangle.getC());

		final int SIDE_COUNT = 3;
		double[] TriangleSides = new double[SIDE_COUNT];

		TriangleSides[0] = a;
		TriangleSides[1] = b;
		TriangleSides[2] = c;

		return TriangleSides;
	}
}
