package by.jonline.oopbasic.file.main;

import by.jonline.oopbasic.file.entity.*;

// Создать объект класса Текстовый файл, используя классы Файл, Директория. 
// Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить. 

public class Main {

	public static void main(String[] args) {
		
		Directory dir = new Directory();
		TextFile textFile = new TextFile("Test", dir, "I learn Java. ");
		
		textFile.addContent("And I like it.");
		
		textFile.viewContent();
		
	}
}
