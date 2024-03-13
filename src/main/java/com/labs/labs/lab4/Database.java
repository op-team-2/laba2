package com.labs.labs.lab4;

import java.util.List;

public class Database {
    private final List<Movie> movies;
    private final List<Actor> actors;

    public Database() {
        this.movies = new java.util.ArrayList<>();
        this.actors = new java.util.ArrayList<>();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }
}