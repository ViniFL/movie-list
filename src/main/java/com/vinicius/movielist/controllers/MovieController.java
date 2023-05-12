package com.vinicius.movielist.controllers;

import com.vinicius.movielist.entities.Movie;
import com.vinicius.movielist.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> findAll() {
        List<Movie> result = movieService.findAll();
        return result;
    }
}
