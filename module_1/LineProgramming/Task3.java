package by.jonline.line_program.main;

public class Task3 {

	public static void main(String[] args) {
		double x;
		double y;

		x = 1.57;
		y = 0.7535;

		double res;

		res = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		System.out.println(res);
	}
}
