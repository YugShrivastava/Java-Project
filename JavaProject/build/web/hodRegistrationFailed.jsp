<%-- 
    Document   : hodRegistrationFailed
    Created on : 25 Sep, 2024, 11:16:16 PM
    Author     : YUG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add HOD</title>
    </head>
    <body>
        <a href="adminPage.jsp" style="padding-bottom: 25px;">Admin Panel</a>
        <h1>Hod Registration Failed</h1>
        <h2>Try Again</h2>
        <form action="AddHOD" method="post">
            <table>
                <tr>
                    <td>HOD Name: </td>
                    <td><input type="text" name="hodname" placeholder="Enter HOD Name" required/></td>
                </tr>
                <tr>
                    <td>HOD Address: </td>
                    <td><input type="text" name="hodaddress" placeholder="Enter HOD Address" required/></td>
                </tr>
                <tr>
                    <td>HOD City: </td>
                    <td><input type="text" name="hodcity" placeholder="Enter HOD City" required/></td>
                </tr>
                <tr>
                    <td>HOD Contact: </td>
                    <td><input type="text" name="hodcontact" placeholder="Enter HOD Contact" required/></td>
                </tr>
                <tr>
                    <td>HOD Department: </td>
                    <td>
                        <SELECT name="hoddepartment">
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
                    <td><input type="password" name="hodpassword" placeholder="Enter password" required/></td>
                </tr>
                
                <tr>
                    <td><input type="reset" /></td>
                    <td><input type="submit" value="Add" /></td>
                </tr>
            </table>
        </form>
</html>
