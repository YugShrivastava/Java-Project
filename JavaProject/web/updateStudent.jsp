<%-- 
    Document   : updateStudent
    Created on : 25 Sep, 2024, 6:59:59 PM
    Author     : YUG
--%>

<%@page import="dao.StudentDAO"%>
<%@page import="dto.StudentDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Student</title>
    </head>
    <body>
        <a href="adminPage.jsp" style="padding-bottom: 25px;">Admin Panel</a>
        <h1>Update Student Record</h1>
        <form action="updateStudent.jsp" method="post">
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
                    
                <form action="UpdateStudent" method="post" style="padding-top: 25px;">
        <table>
            <tr>
                <td><strong>Student ID: </strong></td>
                <td>
                    <input type="text" name="studentid" disabled="disabled" value="<%=studentID%>" />
                    <input type="hidden" name="studentid" value="<%=studentID%>" />
                </td>
            </tr>
            <tr>
                <td><strong>Student Name: </strong></td>
                <td><input type="text" name="studentname" value="<%=student.getStudentName()%>" /></td>
            </tr>
            <tr>
                <td><strong>Student Address: </strong></td>
                <td><input type="text" name="studentadd" value="<%=student.getStudentAddress()%>" /></td>
            </tr>
            <tr>
                <td><strong>Student Contact: </strong></td>
                <td><input type="text" name="studentcontact" value="<%=student.getStudentContact()%>" /></td>
            </tr>
            <tr>
                <td><strong>Student City: </strong></td>
                <td><input type="text" name="studentcity" value="<%=student.getStudentCity()%>" /></td>
            </tr>
            <tr>
                <td><strong>Student Department: </strong></td>
                <td>
                <SELECT name="studentdepartment">
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
