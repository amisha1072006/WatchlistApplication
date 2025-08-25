package com.example.WatchlistApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.WatchlistApplication.entity.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer>{

}
