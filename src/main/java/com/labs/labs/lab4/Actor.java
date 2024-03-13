package com.labs.labs.lab4;

import java.util.List;

public class Actor {
    private final String name;
    private final List<Movie> movies;

    public Actor(String name) {
        this.name = name;
        this.movies = new java.util.ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    @Override
    public String toString() {
        return "Actor{name='" + name + "'}";
    }
}