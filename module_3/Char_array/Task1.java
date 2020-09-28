package by.jonline.char_array.main;

import java.util.Arrays;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.  

public class Task1 {

	public static void main(String[] args) {

		String[] varNames = { "numArray", "maxValue", "newSize", "minValue", "personIndexTest" };

		for (int i = 0; i < varNames.length; i++) {
			varNames[i] = camelToSnake(varNames[i]);
		}

		System.out.println("Result: " + Arrays.toString(varNames));

	}

	// Преобразование camelCase в snake_case
	private static String camelToSnake(String word) {

		char[] charArr = word.toCharArray();

		for (int j = 0; j < charArr.length; j++) {

			if (charArr[j] <= 'Z') {
				charArr[j] += 'a' - 'A';

				charArr = shiftRight(charArr, j);
				charArr[j] = '_';
			}

		}

		return new String(charArr);
	}

	// Сдвиг массива символов вправо,
	// начиная с определенного элемента
	private static char[] shiftRight(char[] array, int index) {

		char[] newArray = new char[array.length + 1];

		int i = 0;
		int j = 0;

		while (i < newArray.length) {
			if (i != index) {
				newArray[i] = array[j];
				j++;
			}

			i++;
		}

		return newArray;

	}
}
