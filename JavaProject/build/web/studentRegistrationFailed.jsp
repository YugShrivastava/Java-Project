<%-- 
    Document   : studentRegistrationFailed
    Created on : 24 Sep, 2024, 11:11:24 PM
    Author     : YUG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Student</title>
    </head>
    <body>
        <a href="adminPage.jsp" style="padding-bottom: 25px;">Admin Panel</a>
        <h1>Student Registration Failed</h1>
        <h2>Try Again</h2>
        <form action="AddStudent" method="post">
            <table>
                <tr>
                    <td>Student Name: </td>
                    <td><input type="text" name="studentname" placeholder="Enter Student Name" required/></td>
                </tr>
                <tr>
                    <td>Student Address: </td>
                    <td><input type="text" name="studentaddress" placeholder="Enter Student Address" required/></td>
                </tr>
                <tr>
                    <td>Student City: </td>
                    <td><input type="text" name="studentcity" placeholder="Enter Student City" required/></td>
                </tr>
                <tr>
                    <td>Student Contact: </td>
                    <td><input type="text" name="studentcontact" placeholder="Enter Student Contact" required/></td>
                </tr>
                <tr>
                    <td>Student Department: </td>
                    <td>
                        <SELECT name="studentdepartment">
                            <option><strong>CSE</strong></option>
                            <option><strong>IT</strong></option>
                            <option><strong>AIML</strong></option>
                            <option><strong>EC</strong></option>
                        </SELECT>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><input type="password" name="studentpassword" placeholder="Enter password" required/></td>
                </tr>
                
                <tr>
                    <td><input type="reset" /></td>
                    <td><input type="submit" value="Add" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
