package com.vinicius.movielist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.movielist.entities.Movie;
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
