package com.apap.tu03.service;
import java.util.List;
import java.util.Optional;

import com.apap.tu03.model.MovieModel;
public interface MovieService {
	void addMovie (MovieModel movie);
	List<MovieModel> getMovieList();
	MovieModel getMovieDetail(String id);
	MovieModel getMovieDetai(Optional<String> id);
	void upMovie(String id,Integer Duration);
	void delMovie (String id);
}
