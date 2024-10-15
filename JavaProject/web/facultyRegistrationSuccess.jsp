<%-- 
    Document   : facultyRegistrationSuccess
    Created on : 24 Sep, 2024, 9:06:02 PM
    Author     : YUG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
        <script type="text/javascript">
            window.onunload = function () { null };  // Prevent back navigation caching
            window.history.forward(); // Automatically move forward if back button is pressed
            function preventBack() {
                window.history.forward();
            }
        </script>
    </head>
    <body>
        <a href="logout.jsp">Sign Out</a>
        <h1>Admin Panel</h1>
        <h2>Faculty Registration SuccessFul</h2>
        <table height="200" width="800">
            <tr colspan="4">
                <td><strong>Head Of Department</strong></td>
            </tr>
            <tr>
                <td><a href="addHOD.jsp">Add HOD</a></td>
                <td><a href="updateHOD.jsp">Update HOD Record</a></td>
                <td><a href="viewHOD.jsp">View HOD Record</a></td>
                <td><a href="deleteHOD.jsp">Delete HOD</a></td>
            </tr>
                
            <tr colspan="4">
                <td><strong>Faculty</strong></td>
            </tr>
            <tr>
                <td><a href="addFaculty.jsp">Add Faculty</a></td>
                <td><a href="updateFaculty.jsp">Update Faculty Record</a></td>
                <td><a href="viewFaculty.jsp">View Faculty Record</a></td>
                <td><a href="deleteFaculty.jsp">Delete Faculty</a></td>
            </tr>
                
            <tr colspan="4">
               <td><strong>Student</strong></td>
            </tr>
            <tr>
                <td><a href="addStudent.jsp">Add Student</a></td>
                <td><a href="updateStudent.jsp">Update Student Record</a></td>
                <td><a href="viewStudent.jsp">View Student Record</a></td>
                <td><a href="deleteStudent.jsp">Delete Student</a></td>
            </tr>
        </table>
    </body>
</html>
