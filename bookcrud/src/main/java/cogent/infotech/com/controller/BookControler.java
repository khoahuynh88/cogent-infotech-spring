package cogent.infotech.com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.entity.Book;
import cogent.infotech.com.service.BookService;

@RestController
@RequestMapping("/api")
public class BookControler {

	@Autowired
	BookService sv;
	
	//Add book
	@PostMapping("/book")
	public Book add (@RequestBody Book book) {
		return sv.save(book);
	}
	
	//List all book
	@GetMapping("/book")
	public List<Book> listAll(){
		return sv.listall();
	}
	
	//List one book by id
	@GetMapping("/book/{bookId}")
	public Book get(@PathVariable("bookId") Integer id) {
		Optional<Book> b = sv.find(id);
		return b.get();
	}
	
	@PutMapping("/book")
	public Book update(@RequestBody Book book) {
		return sv.save(book);
	}
	
	@DeleteMapping("/book")
	public String delete (@RequestParam (value="id") Integer id) {
		Optional<Book> b = sv.find(id);
		sv.delete(b.get());
		return "Book delete";
	}
}
