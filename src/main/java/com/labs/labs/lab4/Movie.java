package com.labs.labs.lab4;

import java.util.List;

public class Movie {
    private final String title;
    private final List<Actor> actors;

    public Movie(String title) {
        this.title = title;
        this.actors = new java.util.ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                '}';
    }
}