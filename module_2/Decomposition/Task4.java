package by.jonline.decomposition.main;

/*
   На плоскости заданы своими координатами n точек. 
   Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
   Указание. Координаты точек занести в массив. 
*/

public class Task4 {

	public static void main(String[] args) {

		final int POINTS_COUNT = 10;
		int[][] points = generateMatrix(POINTS_COUNT, 2);

		System.out.println("Координаты точек: ");
		System.out.println();
		printMatrix(points);
		System.out.println();

		getMostDistantPoints(points);
	}

	// Расстояние между двумя точками
	private static double getDistance(int x1, int y1, int x2, int y2) {
		double distance;
		distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		return distance;
	}

	// Поиск самых удаленных друг от друга точек
	private static void getMostDistantPoints(int[][] coordinates) {
		double maxDist = 0;
		int firstPoint = 0;
		int secondPoint = 0;

		for (int i = 0; i < coordinates.length; i++) {
			for (int j = 0; j < coordinates.length; j++) {

				double dist;
				dist = getDistance(coordinates[i][0], coordinates[i][1], coordinates[j][0], coordinates[j][1]);

				if (dist > maxDist) {
					maxDist = dist;
					firstPoint = i;
					secondPoint = j;
				}
			}
		}

		System.out.println("Самое большое расстояние между точками " + (firstPoint + 1) + " и " + (secondPoint + 1));
	}

	// Генерирует координаты точек со значениями от -10 до 10
	private static int[][] generateMatrix(int m, int n) {
		int[][] matrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int) (Math.random() * 21 - 10);
			}
		}

		return matrix;
	}

	// Вывод матрицы в консоль
	private static void printMatrix(int[][] matrix) {
		System.out.println("    x" + "\t" + " y");
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			System.out.print((i + 1) + ")  ");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}