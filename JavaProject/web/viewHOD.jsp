<%-- 
    Document   : viewHOD
    Created on : 25 Sep, 2024, 11:40:22 PM
    Author     : YUG
--%>

<%@page import="dao.HODDAO"%>
<%@page import="dto.HODDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View HOD</title>
    </head>
    <body>
        <a href="adminPage.jsp" style="padding-bottom: 25px;">Admin Panel</a>
        <h1>View Hod Record</h1>
        <form action="viewHOD.jsp" method="post">
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
        <table>
            <tr>
                <td><strong>Hod ID: </strong></td>
                <td><%=hodId%></td>
            </tr>
            <tr>
                <td><strong>Hod Name: </strong></td>
                <td><%=hod.getHodName()%></td>
            </tr>
            <tr>
                <td><strong>Hod Address: </strong></td>
                <td><%=hod.getHodAddress()%></td>
            </tr>
            <tr>
                <td><strong>Hod Contact: </strong></td>
                <td><%=hod.getHodContact()%></td>
            </tr>
            <tr>
                <td><strong>Hod City: </strong></td>
                <td><%=hod.getHodCity()%></td>
            </tr>
            <tr>
                <td><strong>Hod Department: </strong></td>
                <td><%=hod.getHodDepartment()%></td>
            </tr>           
        </table>  
                <%
                }
            }
        %>
    </body>
</html>
