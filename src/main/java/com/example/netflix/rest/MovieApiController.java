package com.example.netflix.rest;

import com.example.netflix.dto.Movie;
import com.example.netflix.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class MovieApiController {

    private final MovieService movieService;
    private Movie movies;

    @Autowired
    public MovieApiController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<Movie> getMovies(){
        movies = new Movie(movieService.getMovie());
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }
}
