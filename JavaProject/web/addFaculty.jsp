<%-- 
    Document   : addFaculty
    Created on : 24 Sep, 2024, 7:57:17 PM
    Author     : YUG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Faculty</title>
    </head>
    <body>
        <a href="adminPage.jsp" style="padding-bottom: 25px;">Admin Panel</a>
        <h1>Add a New Faculty</h1>
        <form action="AddFaculty" method="post">
            <table>
                <tr>
                    <td>Faculty Name: </td>
                    <td><input type="text" name="facultyname" placeholder="Enter Faculty Name" required/></td>
                </tr>
                <tr>
                    <td>Faculty Address: </td>
                    <td><input type="text" name="facultyaddress" placeholder="Enter Faculty Address" required/></td>
                </tr>
                <tr>
                    <td>Faculty City: </td>
                    <td><input type="text" name="facultycity" placeholder="Enter Faculty City" required/></td>
                </tr>
                <tr>
                    <td>Faculty Contact: </td>
                    <td><input type="text" name="facultycontact" placeholder="Enter Faculty Contact" required/></td>
                </tr>
                <tr>
                    <td>Faculty Department: </td>
                    <td>
                        <SELECT name="facultydepartment">
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
                    <td><input type="password" name="facultypassword" placeholder="Enter password" required/></td>
                </tr>
                
                <tr>
                    <td><input type="reset" /></td>
                    <td><input type="submit" value="Add" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
