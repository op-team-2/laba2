<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Laba 2</title>
    </head>
    <body>
        <a href="../../../index.jsp">Home Page</a>
        <form action="/labs_war_exploded/servlet" method="post" onsubmit="return validationForm()">
            <div style="display: flex; flex-direction: column; gap: 10px; max-width: 300px">
                <label for="a">A:</label>
                <input type="text" id="a" name="a" required>

                <label for="b">B:</label>
                <input type="text" id="b" name="b" required>

                <label for="c">C:</label>
                <input type="text" id="c" name="c" required>

                <label for="d">D:</label>
                <input type="text" id="d" name="d" required>

                <input type="submit" value="Calc">
            </div>
        </form>
        <script src="../../js/script.js"></script>
    </body>
</html>