package com.example.netflix.repository;

import com.example.netflix.dto.MovieDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

    ArrayList<MovieDto> listMovie = new ArrayList<>();

    public MovieRepositoryImpl(){
            listMovie.add(new MovieDto.Builder().movieId(1).title("Piraci z krzemowej doliny").year(1999).image("https://fwcdn.pl/fpo/30/02/33002/6988507.6.jpg").build());
            listMovie.add(new MovieDto.Builder().movieId(2).title("Ja, robot").year(2004).image("https://fwcdn.pl/fpo/54/92/95492/7521206.6.jpg").build());
            listMovie.add(new MovieDto.Builder().movieId(3).title("Kod nieśmiertelności").year(2011).image("https://fwcdn.pl/fpo/89/67/418967/7370853.6.jpg").build());
            listMovie.add(new MovieDto.Builder().movieId(4).title("Ex Machina").year(2015).image("https://fwcdn.pl/fpo/64/19/686419/7688121.6.jpg").build());

    }
    @Override
    public List<MovieDto> getMovie() {
        return listMovie;
    }
}
