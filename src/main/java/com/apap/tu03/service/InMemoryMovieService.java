package com.apap.tu03.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.apap.tu03.model.MovieModel;
@Service
public class InMemoryMovieService implements MovieService {
	private List <MovieModel> archiveMovie;
	public InMemoryMovieService() {
		archiveMovie=new ArrayList<>();}
	
	@Override
	public void addMovie(MovieModel movie) {
		archiveMovie.add(movie);}

	@Override
	public List<MovieModel> getMovieList() {
		return archiveMovie;}

	@Override
	public MovieModel getMovieDetail(String id) {
		for (int i = 0; i < archiveMovie.size(); i++) {
			if(archiveMovie.get(i).getId().equals(id)) {return archiveMovie.get(i);}}
		return null;}
	
	@Override
	public MovieModel getMovieDetai(Optional<String> id) {
		for (int i = 0; i < archiveMovie.size(); i++) {
			if(archiveMovie.get(i).getId().equals(id)) {return archiveMovie.get(i);}
		}
		return null;}
	
	@Override
	public void upMovie(String id, Integer Duration) {
		// TODO Auto-generated method stub
		for (int i = 0; i < archiveMovie.size(); i++) {
			if(archiveMovie.get(i).getId().equals(id)) {archiveMovie.get(i).setDuration(Duration);}}}
	
	@Override
	public void delMovie(String id) {
		for (int i = 0; i < archiveMovie.size(); i++) {
			if(archiveMovie.get(i).getId().equals(id)) {
				archiveMovie.remove(archiveMovie.get(i));}
			else {continue;}}}}
