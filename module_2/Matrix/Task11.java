package by.jonline.matrix.main;

/*
   Матрицу 10x20 заполнить случайными числами от 0 до 15. 
   Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз. 
*/

public class Task11 {

	public static void main(String[] args) {

		int line; // количество строк в матрице
		int col; // количетсво столбцов в матрице

		line = 10;
		col = 20;

		int[][] doubleArray = generateMatrix(line, col);
		System.out.println("Исходная матрица: ");
		System.out.println();
		printMatrix(doubleArray);
		System.out.println();

		// Вывести номеров строк, в которых число 5 встречается три и более раз

		for (int i = 0; i < line; i++) {
			int compriseCount = 0;

			for (int j = 0; j < col; j++) {
				if (doubleArray[i][j] == 5) {
					compriseCount++;
				}
			}

			if (compriseCount >= 3) {
				System.out.println("Строка № " + (i + 1));
			}
		}

	}

	// Генерирует матрицу со случаными значениями от 0 до 15
	private static int[][] generateMatrix(int m, int n) {
		int[][] matrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int) (Math.random() * 16);;
			}
		}

		return matrix;
	}

	// Вывод матрицы в консоль
	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
