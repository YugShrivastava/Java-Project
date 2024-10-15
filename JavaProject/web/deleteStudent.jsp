<%-- 
    Document   : deleteStudent
    Created on : 25 Sep, 2024, 9:18:35 PM
    Author     : YUG
--%>

<%@page import="model.StudentDeletion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Student</title>
    </head>
    <body>
        <a href="adminPage.jsp" style="padding-bottom: 25px;">Admin Panel</a>
        <h1>Delete Student Record</h1>
        <form action="deleteStudent.jsp" method="post">
            <table>
                <tr>
                    <td>Enter Student ID: </td>
                    <td><input type="text" name="studentid" required/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" /></td>
                </tr>
            </table>
        </form>
        
        <%
            String studentID = request.getParameter("studentid");
            
            if(studentID != null && !studentID.trim().equals("")){
                
                
                boolean deleted = StudentDeletion.delete(studentID);
                
                if(!deleted){
        %>
                <h2>No Records Found for ID: <%=studentID %></h2>
        <%
                }
                else{
                %>
                <h2>Record Deleted for ID: <%=studentID%></h2>
                <%
                }
            }
        %>
    </body>
</html>
