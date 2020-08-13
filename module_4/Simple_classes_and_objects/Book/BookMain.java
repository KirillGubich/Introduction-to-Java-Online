package by.jonline.simple_class.book;

import java.util.List;

/*
   Создать класс Book, спецификация которого приведена ниже. 
   Определить конструкторы, set- и get- методы и метод  toString(). 
   Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
   Задать критерии выбора данных и вывести эти данные на консоль. 
*/

public class BookMain {

	public static void main(String[] args) {
		
		Bookshelf bookshelf = new Bookshelf();
		bookshelf.addBook(new Book("Code complete", "Macconnell", "Microsoft press", 1993, 914, 50.0, "Hard"));
		bookshelf.addBook(new Book("Java Head first", "Sierra, Bates", "Piter", 2003, 718, 45.0, "Hard"));
		bookshelf.addBook(new Book("Fairytails", "Pushkin", "Microsoft Press", 1967, 366, 20.4, "Soft"));
		bookshelf.addBook(new Book("Stihi", "Lermontov", "Moscow", 2005, 257, 15.5, "Hard"));
		bookshelf.addBook(new Book("Novaya zemlya", "Kolos", "Kolos", 1923, 200, 10.2, "Soft"));
		
		BookView bookView = new BookView();
		BookLogic bookLogic = new BookLogic();
		
		bookView.viewBookList(bookshelf);
		
		List<Book> authorBooks;
		authorBooks = bookLogic.getAuthorBooks(bookshelf, "Pushkin");
		bookView.viewBookList(authorBooks);
		
		List<Book> publisherBooks;
		publisherBooks = bookLogic.getPublisherBooks(bookshelf, "Microsoft press");
		bookView.viewBookList(publisherBooks);
		
		List<Book> afterYearBooks;
		afterYearBooks = bookLogic.getBooksAfterYear(bookshelf, 1973);
		bookView.viewBookList(afterYearBooks);
	
	}

}
