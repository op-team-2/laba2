package com.labs.labs;

import com.labs.labs.lab4.Actor;
import com.labs.labs.lab4.Database;
import com.labs.labs.lab4.Movie;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/main")
public class ActorController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Database database = new Database();
        List<Actor> actors = database.getActors();

        Actor actor1 = new Actor("Том Круз");
        Actor actor2 = new Actor("Бред Піт");
        Actor actor3 = new Actor("Кіану Рівз");
        Actor actor4 = new Actor("Джоні Депп");
        Movie movie1 = new Movie("Тітанік");
        Movie movie2 = new Movie("Аватар");

        actor1.addMovie(movie1);
        actor1.addMovie(movie2);
        actor2.addMovie(movie1);
        actor3.addMovie(movie1);
        actor3.addMovie(movie2);
        actor4.addMovie(movie2);

        movie1.addActor(actor1);
        movie1.addActor(actor2);
        movie2.addActor(actor1);
        movie1.addActor(actor3);
        movie2.addActor(actor3);
        movie2.addActor(actor4);

        database.addActor(actor1);
        database.addActor(actor2);
        database.addActor(actor3);
        database.addActor(actor4);
        database.addMovie(movie1);
        database.addMovie(movie2);



        // Завдання 1: чи є актор, який не зіграв в жодному фільмі (типізований ітератор)


        for (Actor actor : database.getActors()) {
            if (actor.getMovies().isEmpty()) {
                System.out.println("Актор " + actor.getName() + " не зіграв у жодному фільмі.");
            }
        }



        // Завдання 2: список акторів з якими коли-небудь в одному фільмі грав заданий актор (нетипізований ітератор)

        List<String> coActorNames = new ArrayList<>();
        for (Movie movie : actor1.getMovies()) {
            for (Actor coActor : movie.getActors()) {
                if (!coActorNames.contains(coActor.getName()) && !coActor.equals(actor1)) {
                    coActorNames.add(coActor.getName());
                }
            }
        }
        System.out.print("Актори, які грали з актором " + actor1.getName() + ": ");
        for (String coActorName : coActorNames) {
            System.out.print(coActorName + ", ");
        }
        System.out.println();



        // Завдання 3: фільм з найбільшою кількістю акторів (типізований цикл «for-each»)



        Movie maxActorsMovie = null;
        int maxActorsCount = 0;

        for (Movie movie : database.getMovies()) {
            if (movie.getActors().size() > maxActorsCount) {
                maxActorsCount = movie.getActors().size();
                maxActorsMovie = movie;
            }
        }

        request.setAttribute("actors", actors);
        RequestDispatcher view = request.getRequestDispatcher("static/labs/laba4/index.jsp");
        view.forward(request, response);
    }
}
