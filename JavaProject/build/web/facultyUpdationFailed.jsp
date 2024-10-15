<%-- 
    Document   : facultyUpdationFailed
    Created on : 25 Sep, 2024, 12:42:43 AM
    Author     : YUG
--%>

<%@page import="dto.FacultyDTO"%>
<%@page import="dao.FacultyDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Page</title>
    </head>
    <body>
        <a href="adminPage.jsp" style="padding-bottom: 25px;">Admin Panel</a>
        <h1>Update Faculty Record Failed</h1>
        <h2>Try Again</h2>
        <form action="updateFaculty.jsp" method="post">
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
                    
                <form action="UpdateFaculty" method="post" style="padding-top: 25px;">
        <table>
            <tr>
                <td><strong>Faculty ID: </strong></td>
                <td>
                    <input type="text" name="facultyid" disabled="disabled" value="<%=facultyId%>" />
                    <input type="hidden" name="facultyid" value="<%=facultyId%>" />
                </td>
            </tr>
            <tr>
                <td><strong>Faculty Name: </strong></td>
                <td><input type="text" name="facultyname" value="<%=faculty.getFacultyName()%>" /></td>
            </tr>
            <tr>
                <td><strong>Faculty Address: </strong></td>
                <td><input type="text" name="facultyadd" value="<%=faculty.getFacultyAddress()%>" /></td>
            </tr>
            <tr>
                <td><strong>Faculty Contact: </strong></td>
                <td><input type="text" name="facultycontact" value="<%=faculty.getFacultyContact()%>" /></td>
            </tr>
            <tr>
                <td><strong>Faculty City: </strong></td>
                <td><input type="text" name="facultycity" value="<%=faculty.getFacultyCity()%>" /></td>
            </tr>
            <tr>
                <td><strong>Faculty Department: </strong></td>
                <td>
                <SELECT name="facultydepartment">
                    <option><strong>CSE</strong></option>
                    <option><strong>IT</strong></option>
                    <option><strong>AIML</strong></option>
                    <option><strong>EC</strong></option>
                </SELECT>
                </td>
            </tr>
            <tr>
                <td><input type="reset" /></td>
                <td><input type="submit" value="Update" /></td>
            </tr>            
        </table>
        </form>
                
                <%
                }
            }
        %>
    </body>
</html>
