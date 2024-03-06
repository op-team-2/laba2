<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.text.DecimalFormat" %>
<html>
    <head>
        <title>Лаба 3</title>
    </head>
    <body>
        <a href="../../../index.jsp">Home Page</a>
        <h1>Laba 3</h1>

        <form action="" method="post" onsubmit="return validationForm()">
            <div style="display: flex; flex-direction: column; gap: 10px; max-width: 300px">
                <label for="a">Param (a):</label>
                <input
                        type="text"
                        name="a"
                        value="<%= (request.getParameter("a") != null) ? request.getParameter("a") : "0" %>">
                <label for="b">Param (b):</label>
                <input
                        type="text"
                        name="b"
                        value="<%= (request.getParameter("b") != null) ? request.getParameter("b") : "100" %>">
                <label for="c">Step (c):</label>
                <input
                        type="text"
                        name="с"
                        value="<%= (request.getParameter("с") != null) ? request.getParameter("с") : "0.1" %>">
                <input type="submit" value="Calc">
            </div>
        </form>

        <%
            ArrayList<Double> results = new ArrayList<>();
            DecimalFormat df = new DecimalFormat("#.##");

            String strStart = request.getParameter("a");
            String strEnd = request.getParameter("b");
            String strStep = request.getParameter("с");

            if (strStart != null &&
                    strEnd != null &&
                    strStep != null &&
                    !strStart.isEmpty() &&
                    !strEnd.isEmpty() &&
                    !strStep.isEmpty()) {
                double start = Double.parseDouble(strStart);
                double end = Double.parseDouble(strEnd);
                double step = Double.parseDouble(strStep);

                for (double i = start; i <= end; i += step) {
                    double result = (5 * i / Math.sin(i) + (Math.sqrt(Math.tanh(Math.abs(i) * step) / Math.log10(end))));
                    results.add(result);
                }
            }

            if (!results.isEmpty()) {
        %>
        <table border="1" style="width: 300px">
            <tr>
                <th>Param "a"</th>
                <th>Param "b"</th>
                <th>Result</th>
            </tr>
            <%
                double a = Double.parseDouble(strStart);
                double step = Double.parseDouble(strStep);
                for (double result : results) {
            %>
            <tr>
                <td><%= df.format(a) %></td>
                <td><%= df.format(a) %></td>
                <td><%= df.format(result) %></td>
            </tr>
            <%
                    a += step;
                }
            %>
        </table>
        <%
            }
        %>
        <script src="../../js/script.js"></script>
    </body>
</html>
