package com.example.WatchlistApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WatchlistApplication.entity.Movie;
import com.example.WatchlistApplication.repository.MovieRepo;

@Service
public class DatabaseService {

@Autowired
    MovieRepo movieRepo;

    public void create(Movie movie){
    movieRepo.save(movie);
        
    }

    public List<Movie> getAllMovies() {

        return movieRepo.findAll();
    }

    public Movie getMovieById(Integer id) {
        return movieRepo.findById(id).get();
    }

    public void update(Movie movie,Integer id) {
        Movie toBeUpdated = getMovieById(id);
        toBeUpdated.setTitle(movie.getTitle());
        toBeUpdated.setRating(movie.getRating());
        toBeUpdated.setComment(movie.getComment());
        toBeUpdated.setPriority(movie.getPriority());

        movieRepo.save(toBeUpdated);
    }
}
