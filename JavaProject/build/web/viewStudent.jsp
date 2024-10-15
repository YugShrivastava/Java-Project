<%-- 
    Document   : viewStudent
    Created on : 25 Sep, 2024, 9:12:48 PM
    Author     : YUG
--%>

<%@page import="dto.StudentDTO"%>
<%@page import="dao.StudentDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Student</title>
    </head>
    <body>
        <a href="adminPage.jsp" style="padding-bottom: 25px;">Admin Panel</a>
        <h1>Update Student Record</h1>
        <form action="viewStudent.jsp" method="post">
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
                StudentDAO sDAO = new StudentDAO();
                StudentDTO student = sDAO.getStudentData(studentID);
                if(student == null){
        %>
                <h2>No Records Found for ID: <%=studentID %></h2>
        <%
                }
                else{
                %>
        <table style="padding-top: 25px;">
            <tr>
                <td><strong>Student ID: </strong></td>
                <td><%=studentID%></td>
            </tr>
            <tr>
                <td><strong>Student Name: </strong></td>
                <td><%=student.getStudentName()%></td>
            </tr>
            <tr>
                <td><strong>Student Address: </strong></td>
                <td><%=student.getStudentAddress()%></td>
            </tr>
            <tr>
                <td><strong>Student Contact: </strong></td>
                <td><%=student.getStudentContact()%></td>
            </tr>
            <tr>
                <td><strong>Student City: </strong></td>
                <td><%=student.getStudentCity()%></td>
            </tr>
            <tr>
                <td><strong>Student Department: </strong></td>
                <td><%=student.getStudentDepartment()%></td>
            </tr>            
        </table>
                <%
                }
            }
        %>
    </body>
</html>
