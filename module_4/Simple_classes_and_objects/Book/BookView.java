package by.jonline.simple_class.book;

import java.util.List;

public class BookView {
	
	// Вывод списка всех книг
	public void viewBookList(Bookshelf bookshelf) {
		System.out.println("Book list:");
		
		for (Book book : bookshelf.getBookList()) {
			System.out.println(book.toString());
		}
		
		System.out.println();
	}
	
	// Вывод списка всех книг
	public void viewBookList(List<Book> books) {
		System.out.println("Book list:");
		
		for (Book book : books) {
			System.out.println(book.toString());
		}
		
		System.out.println();
	}

}
