package com.vinicius.movielist.services;

import com.vinicius.movielist.entities.Movie;
import com.vinicius.movielist.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAll() {
        List<Movie> result = movieRepository.findAll();
        return result;
    }

}
