package com.example.netflix.dto;

import java.util.List;

public class Movie {
    List<MovieDto> movies;

    public Movie(List<MovieDto> movies){
        this.movies=movies;
    }

    public List<MovieDto> getMovie(){return movies;}
}
