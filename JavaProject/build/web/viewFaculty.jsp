<%-- 
    Document   : viewFaculty
    Created on : 25 Sep, 2024, 8:38:36 PM
    Author     : YUG
--%>

<%@page import="dto.FacultyDTO"%>
<%@page import="dao.FacultyDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Faculty</title>
    </head>
    <body>
        <a href="adminPage.jsp" style="padding-bottom: 25px;">Admin Panel</a>
        <h1>View Faculty Record</h1>
        <form action="viewFaculty.jsp" method="post">
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
                FacultyDAO fDAO = new FacultyDAO();
                FacultyDTO faculty = fDAO.getFacultyData(facultyId);
                if(faculty == null){
        %>
                <h2>No Records Found for ID: <%=facultyId %></h2>
        <%
                }
                else{

                
                %>
                <table style="padding-top: 25px;">
            <tr>
                <td><strong>Faculty ID: </strong></td>
                <td><%=facultyId%></td>
            </tr>
            <tr>
                <td><strong>Faculty Name: </strong></td>
                <td><%=faculty.getFacultyName()%></td>
            </tr>
            <tr>
                <td><strong>Faculty Address: </strong></td>
                <td><%=faculty.getFacultyAddress()%></td>
            </tr>
            <tr>
                <td><strong>Faculty Contact: </strong></td>
                <td><%=faculty.getFacultyContact()%></td>
            </tr>
            <tr>
                <td><strong>Faculty City: </strong></td>
                <td><%=faculty.getFacultyCity()%></td>
            </tr>
            <tr>
                <td><strong>Faculty Department: </strong></td>
                <td><%=faculty.getFacultyDepartment()%></td>
            </tr>           
        </table>
                <%
                }
            }
        %>
    </body>
</html>
