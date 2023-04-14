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

import cogent.infotech.com.entity.Movie;
import cogent.infotech.com.service.MovieService;



@RestController
@RequestMapping("/api")
public class AdminController {
	@Autowired
	MovieService sv;
	
	
	
	@PostMapping("/movie")
	public Movie add (@RequestBody Movie movie) {
		return sv.save(movie);
	}
	
	
	@GetMapping("/movie")
	public List<Movie> listAll(){
		return sv.listall();
	}
	
	
	@GetMapping("/movie/{movieId}")
	public Movie get(@PathVariable("movieId") Integer id) {
		Optional<Movie> b = sv.find(id);
		return b.get();
	}
	
	@PutMapping("/movie")
	public Movie update(@RequestBody Movie movie) {
		return sv.save(movie);
	}
	
	@DeleteMapping("/movie")
	public String delete (@RequestParam (value="id") Integer id) {
		Optional<Movie> b = sv.find(id);
		sv.delete(b.get());
		return "Movie delete";
	}
	
}
