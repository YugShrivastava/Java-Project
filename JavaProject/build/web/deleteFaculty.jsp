<%-- 
    Document   : deleteFaculty
    Created on : 25 Sep, 2024, 8:52:46 PM
    Author     : YUG
--%>

<%@page import="model.FacultyDeletion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Faculty</title>
    </head>
    <body>
        <a href="adminPage.jsp" style="padding-bottom: 25px;">Admin Panel</a>
        <h1>Delete Faculty Record</h1>
        <form action="deleteFaculty.jsp" method="post">
            <table>
                <tr>
                    <td>Enter Faculty ID: </td>
                    <td><input type="text" name="facultyid" required/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" /></td>
                </tr>
            </table>
        </form>
        
        <%
            String facultyId = request.getParameter("facultyid");
            
            if(facultyId != null && !facultyId.trim().equals("")){
                
                
                boolean deleted = FacultyDeletion.delete(facultyId);
                
                if(!deleted){
        %>
                <h2>No Records Found for ID: <%=facultyId %></h2>
        <%
                }
                else{
                %>
                <h2>Record Deleted for ID: <%=facultyId%></h2>
                <%
                }
            }
        %>
    </body>
</html>
