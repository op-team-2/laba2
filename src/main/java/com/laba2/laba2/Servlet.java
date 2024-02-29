package com.laba2.laba2;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            double a = Double.parseDouble(request.getParameter("a"));
            double b = Double.parseDouble(request.getParameter("b"));
            double c = Double.parseDouble(request.getParameter("c"));
            double d = Double.parseDouble(request.getParameter("d"));

            Cookie cookieA = new Cookie("a", String.valueOf(a));
            Cookie cookieB = new Cookie("b", String.valueOf(b));
            Cookie cookieC = new Cookie("c", String.valueOf(c));
            Cookie cookieD = new Cookie("d", String.valueOf(d));

            cookieA.setMaxAge(24 * 2 * 60 * 60);
            cookieB.setMaxAge(24 * 2 * 60 * 60);
            cookieC.setMaxAge(24 * 2 * 60 * 60);
            cookieD.setMaxAge(24 * 2 * 60 * 60);

            response.addCookie(cookieA);
            response.addCookie(cookieB);
            response.addCookie(cookieC);
            response.addCookie(cookieD);

            String firstRes = firstCalcFunc(a, b, c, d);
            String secondRes = secondCalcFunc(a, b, c, d);
            String thirdRes = thirdCalcFunc(a, b, c, d);

            out.println("<html>");
            out.println("<head><title>Servlet</title></head>");
            out.println("<body>");
            out.println("<p>First func res: " + firstRes + "</p>");
            out.println("<p>Second func res: " + secondRes + "</p>");
            out.println("<p>Third func res: " + thirdRes + "</p>");
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<html>");
            out.println("<head><title>Error</title></head>");
            out.println("<body>");
            out.println("<p>ERROR: not all fields are filled in</p>");
            out.println("</body></html>");
        }
    }

    private String firstCalcFunc(double a, double b, double c, double d) {
        double result = Math.pow((4 * Math.cosh(Math.sqrt(Math.abs(a / b)) + 3 * Math.acos(d))), c);
        if (Double.isNaN(result)) {
            return "Error in calculations";
        }
        return String.valueOf(result);
    }
    private String secondCalcFunc(double a, double b, double c, double d) {
        double result = (5 * a / Math.sin(a) + (Math.sqrt(Math.tanh(Math.abs(b) * c) / Math.log10(d))));
        if (Double.isNaN(result)) {
            return "Error in calculations";
        }
        return String.valueOf(result);
    }

    private String thirdCalcFunc(double a, double b, double c, double d) {
        double result = ((Math.sin(Math.abs(a) + Math.cos(Math.sqrt(b)))) / (2 * Math.tan(c) + Math.exp(d)));
        if (Double.isNaN(result)) {
            return "Error in calculations";
        }
        return String.valueOf(result);
    }
}