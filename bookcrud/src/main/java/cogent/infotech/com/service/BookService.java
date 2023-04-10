package cogent.infotech.com.service;

import java.util.List;
import java.util.Optional;

import cogent.infotech.com.entity.Book;

public interface BookService {
	public Book save (Book book);
	public Optional<Book> find (int bookId);
	public List<Book> listall();
	public void delete(Book book);
	public void deleteAll ();
}
