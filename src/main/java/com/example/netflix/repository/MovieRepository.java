package com.example.netflix.repository;

import com.example.netflix.dto.MovieDto;

import java.util.List;

public interface MovieRepository {
    List<MovieDto> getMovie();
}
