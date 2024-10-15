<%-- 
    Document   : hodPage
    Created on : 27 Sep, 2024, 11:02:26 PM
    Author     : YUG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hod Page</title>
        <script type="text/javascript">
            window.onunload = function () { null };  // Prevent back navigation caching
            window.history.forward(); // Automatically move forward if back button is pressed
            function preventBack() {
                window.history.forward();
            }
        </script>
    </head>
    <body>
        <h1>Hello Hod!</h1>
        <a href="logout.jsp">Sign Out</a>
    </body>
</html>
