package by.jonline.simple_class.book;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {

	// Список книг заданного автора
	public List<Book> getAuthorBooks(Bookshelf bookshelf, String author) {
		List<Book> authorBooks = new ArrayList<Book>();

		for (int i = 0; i < bookshelf.getBookList().size(); i++) {
			Book currentBook;
			currentBook = bookshelf.getBookList().get(i);

			if (currentBook.getAuthor() == author) {
				authorBooks.add(currentBook);
			}
		}

		return authorBooks;
	}

	// Список книг, выпущенных заданным издательством
	public List<Book> getPublisherBooks(Bookshelf bookshelf, String publisher) {
		List<Book> publisherBooks = new ArrayList<Book>();

		for (int i = 0; i < bookshelf.getBookList().size(); i++) {
			Book currentBook;
			currentBook = bookshelf.getBookList().get(i);

			if (currentBook.getPublisher() == publisher) {
				publisherBooks.add(currentBook);
			}
		}

		return publisherBooks;
	}

	// Список книг, выпущенных после заданного года
	public List<Book> getBooksAfterYear(Bookshelf bookshelf, int year) {
		List<Book> afterYearBooks = new ArrayList<Book>();

		for (int i = 0; i < bookshelf.getBookList().size(); i++) {
			Book currentBook;
			currentBook = bookshelf.getBookList().get(i);

			if (currentBook.getPublicationYear() > year) {
				afterYearBooks.add(currentBook);
			}
		}

		return afterYearBooks;
	}

}
