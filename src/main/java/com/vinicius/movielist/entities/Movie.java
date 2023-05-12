package com.vinicius.movielist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "movie_year")
    private Integer year;
    private String genre;
    private Double score;
    @Column(columnDefinition = "TEXT")
    private String shortResume;
    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Movie() {
    }

    public Movie(Long id, String title, Integer year, String genre, Double score, String shortResume, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.score = score;

        this.shortResume = shortResume;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getShortResume() {
        return shortResume;
    }

    public void setShortResume(String resume) {
        this.shortResume = resume;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String description) {
        this.longDescription = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(id, movie.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
