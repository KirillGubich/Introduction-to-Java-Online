package by.jonline.matrix.main;

//  Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task12 {

	public static void main(String[] args) {

		int line; // количество строк в матрице
		int col; // количетсво столбцов в матрице

		line = 4;
		col = 5;

		int[][] doubleArray = generateMatrix(line, col);
		System.out.println("Исходная матрица: ");
		System.out.println();
		printMatrix(doubleArray);
		System.out.println();

		// Сортировка строк матрицы по возрастанию
		for (int i = 0; i < doubleArray.length; i++) {
			ascendingSort(doubleArray[i]);
		}

		System.out.println("По возрастанию: ");
		System.out.println();
		printMatrix(doubleArray);
		System.out.println();

		// Сортировка строк матрицы по убыванию
		for (int i = 0; i < doubleArray.length; i++) {
			descendingSort(doubleArray[i]);
		}

		System.out.println("По убыванию: ");
		System.out.println();
		printMatrix(doubleArray);

	}

	// Генерирует матрицу со случаными значениями от 0 до 100
	private static int[][] generateMatrix(int m, int n) {
		int[][] matrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int) (Math.random() * 101);
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

	// Сортирует массив по возрастанию
	private static int[] ascendingSort(int[] numArray) {

		for (int i = numArray.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (numArray[j] > numArray[j + 1]) {
					int tempEl = numArray[j];
					numArray[j] = numArray[j + 1];
					numArray[j + 1] = tempEl;
				}
			}
		}

		return numArray;
	}

	// Сортирует массив по убыванию
	private static int[] descendingSort(int[] numArray) {

		for (int i = numArray.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (numArray[j] < numArray[j + 1]) {
					int tempEl = numArray[j];
					numArray[j] = numArray[j + 1];
					numArray[j + 1] = tempEl;
				}
			}
		}

		return numArray;
	}

}
