package cogent.infotech.com.service;

import java.util.List;
import java.util.Optional;

import cogent.infotech.com.entity.Movie;



public interface MovieService {
	public Movie save (Movie movie);
	public Optional<Movie> find (int movieId);
	public List<Movie> listall();
	public void delete(Movie movie);
	public void deleteAll ();
}
