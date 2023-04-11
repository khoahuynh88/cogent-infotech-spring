package cogent.infotech.crudexe.dao;

import java.util.List;

import cogent.infotech.crudexe.dto.Book;

public interface BookDao {
	
	int create (Book book);
	int update (Book book);
	int delete (int id);
	List<Book> readid (int id);
	List <Book> read();
}
