package cogent.infotech.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.infotech.com.entity.Movie;
import cogent.infotech.com.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieRepository repo;
	
	@Override
	public Movie save(Movie movie) {
		// TODO Auto-generated method stub
		return repo.save(movie);
	}

	@Override
	public Optional<Movie> find(int movieId) {
		// TODO Auto-generated method stub
		return repo.findById(movieId);
	}

	@Override
	public List<Movie> listall() {
		// TODO Auto-generated method stub
		return (List<Movie>) repo.findAll();
	}

	@Override
	public void delete(Movie movie) {
		// TODO Auto-generated method stub
		repo.delete(movie);
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repo.deleteAll();
	}

}
