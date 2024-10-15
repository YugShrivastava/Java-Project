<%-- 
    Document   : logout.jsp
    Created on : 27 Sep, 2024, 11:11:04 PM
    Author     : YUG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout Page</title>
    </head>
    <body>
        <%
        session.invalidate();
        
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate, max-age=0");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", -1);
        
        response.sendRedirect("login.jsp");
        %>
    </body>
</html>
