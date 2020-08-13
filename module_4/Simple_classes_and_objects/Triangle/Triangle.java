package by.jonline.simple_class.triangle;

public class Triangle {

	private Point a;
	private Point b;
	private Point c;

	public Triangle() {
		a = new Point(0, 0);
		b = new Point(1, 1);
		c = new Point(-1, 1);
	}

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

}
