<%-- 
    Document   : updateHOD
    Created on : 25 Sep, 2024, 11:17:43 PM
    Author     : YUG
--%>

<%@page import="dto.HODDTO"%>
<%@page import="dao.HODDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update HOD</title>
    </head>
    <body>
        <a href="adminPage.jsp" style="padding-bottom: 25px;">Admin Panel</a>
        <h1>Update Head Of Department Record</h1>
        <form action="updateHOD.jsp" method="post">
            <table>
                <tr>
                    <td>Enter Hod ID: </td>
                    <td><input type="text" name="hodid" required/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" /></td>
                </tr>
            </table>
        </form>
        
        <%
            String hodId = request.getParameter("hodid");
            
            if(hodId != null && !hodId.trim().equals("")){
                HODDAO hDAO = new HODDAO();
                HODDTO hod = hDAO.getHodData(hodId);
                if(hod == null){
        %>
                <h2>No Records Found for ID: <%=hodId %></h2>
        <%
                }
                else{
                %>
                    
                <form action="UpdateHod" method="post" style="padding-top: 25px;">
        <table>
            <tr>
                <td><strong>Hod ID: </strong></td>
                <td>
                    <input type="text" name="hodid" disabled="disabled" value="<%=hodId%>" />
                    <input type="hidden" name="hodid" value="<%=hodId%>" />
                </td>
            </tr>
            <tr>
                <td><strong>Hod Name: </strong></td>
                <td><input type="text" name="hodname" value="<%=hod.getHodName()%>" /></td>
            </tr>
            <tr>
                <td><strong>Hod Address: </strong></td>
                <td><input type="text" name="hodadd" value="<%=hod.getHodAddress()%>" /></td>
            </tr>
            <tr>
                <td><strong>Hod Contact: </strong></td>
                <td><input type="text" name="hodcontact" value="<%=hod.getHodContact()%>" /></td>
            </tr>
            <tr>
                <td><strong>Hod City: </strong></td>
                <td><input type="text" name="hodcity" value="<%=hod.getHodCity()%>" /></td>
            </tr>
            <tr>
                <td><strong>Hod Department: </strong></td>
                <td>
                <SELECT name="hoddepartment">
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
