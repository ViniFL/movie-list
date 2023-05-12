package com.vinicius.movielist.dto;

import com.vinicius.movielist.entities.Movie;

public class MovieMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String shortResume;

    public MovieMinDTO() {
    }

    public MovieMinDTO(Movie entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        shortResume = entity.getShortResume();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getShortResume() {
        return shortResume;
    }
}
