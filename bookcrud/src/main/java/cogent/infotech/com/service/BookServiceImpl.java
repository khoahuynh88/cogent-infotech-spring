package cogent.infotech.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.infotech.com.entity.Book;
import cogent.infotech.com.respository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository repo;
	
	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return repo.save(book);
	}

	@Override
	public Optional<Book> find(int bookId) {
		// TODO Auto-generated method stub
		return repo.findById(bookId);
	}

	@Override
	public List<Book> listall() {
		// TODO Auto-generated method stub
		return (List<Book>) repo.findAll();
	}

	@Override
	public void delete(Book book) {
		// TODO Auto-generated method stub
		repo.delete(book);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repo.deleteAll();
	}

}
