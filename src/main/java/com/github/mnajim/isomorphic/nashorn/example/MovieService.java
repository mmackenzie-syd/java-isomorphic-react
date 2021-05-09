package com.github.mnajim.isomorphic.nashorn.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    public MovieService() {
        movies.add(new Movie(686613));
        movies.add(new Movie(695370));
        movies.add(new Movie(658405));
        movies.add(new Movie(655422));
        movies.add(new Movie(711443));
        movies.add(new Movie(687956));
        movies.add(new Movie(703291));
        movies.add(new Movie(694262));
        movies.add(new Movie(702151));
        movies.add(new Movie(658400));
        movies.add(new Movie(668252));
    }

    public List<Movie> getMovies() {
        return movies;
    }

}
