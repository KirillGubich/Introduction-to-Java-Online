package by.jonline.simple_class.book;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {

	private List<Book> bookList;

	public void addBook(Book book) {
		bookList.add(book);
	}

	public Bookshelf(List<Book> bookList) {
		this.bookList = bookList;
	}

	public Bookshelf() {
		bookList = new ArrayList<Book>();
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

}
