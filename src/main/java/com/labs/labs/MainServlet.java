package com.labs.labs;

import com.labs.labs.lab4.Actor;
import com.labs.labs.lab4.Database;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Database database = new Database();

        Actor actor1 = new Actor("Том Круз");

        database.addActor(actor1);

        request.setAttribute("actors", database.getActors());
        request.setAttribute("movies", database.getMovies());

        request.getRequestDispatcher("/actors.jsp").forward(request, response);
    }
}
