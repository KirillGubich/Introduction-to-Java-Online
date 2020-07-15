package by.jonline.linear.main;

/*
   Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
   Вывести данное значение длительности в часах, 
   минутах и секундах в следующей форме: ННч ММмин SSc. 
*/

public class Task5 {

	public static void main(String[] args) {

		int t = 45070;

		// Расчёты

		int hours = t / 3600;
		t %= 3600;
		int minutes = t / 60;
		int seconds = t %= 60;

		System.out.println(hours + " h " + minutes + " min " + seconds + " sec ");
	}

}