<%-- 
    Document   : login
    Created on : 27 Sep, 2024, 11:13:38 PM
    Author     : YUG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./styles/login.css">
        <script type="text/javascript">
            window.onunload = function () { null };  // Prevent back navigation caching
            window.history.forward(); // Automatically move forward if back button is pressed
            function preventBack() {
                window.history.forward();
            }
        </script>
    </head>
    <body onload="preventBack()">
        <div class="container">
            <h1>Welcome User</h1>
            <form action="LoginChecker" method="post">
                <div class="input-group">
                    <label for="username">Username:</label>
                    <input type="text" id="username" name="username" placeholder="Enter Username" required>
                </div>
                <div class="input-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" placeholder="Enter Password" required>
                </div>
                <div class="actions">
                    <input type="submit" value="Login" class="btn">
                </div>
            </form>
        </div>
    </body>
</html>
