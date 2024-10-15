<%-- 
    Document   : deleteHOD
    Created on : 25 Sep, 2024, 11:46:18 PM
    Author     : YUG
--%>

<%@page import="model.HodDeletion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete HOD</title>
    </head>
    <body>
        <a href="adminPage.jsp" style="padding-bottom: 25px;">Admin Panel</a>
        <h1>Delete Hod Record</h1>
        <form action="deleteHOD.jsp" method="post">
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
                boolean deleted = HodDeletion.delete(hodId);
                if(!deleted){
        %>
                <h2>No Records Found for ID: <%=hodId %></h2>
        <%
                }
                else{
                %>
                <h2>Record Deleted for ID: <%=hodId%></h2>
                <%
                }
            }
        %>
    </body>
</html>
