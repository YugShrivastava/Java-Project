package controller;

import dto.HODDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HodUpdate;

/**
 *
 * @author YUG
 */
public class UpdateHod extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("updateHOD.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String hodID = request.getParameter("hodid");
        String hodName = request.getParameter("hodname");
        String hodAddress = request.getParameter("hodadd");
        String hodContact = request.getParameter("hodcontact");
        String hodCity = request.getParameter("hodcity");
        String hodDept = request.getParameter("hoddepartment");
        
        HODDTO hod = new HODDTO();
        hod.setHodID(hodID);
        hod.setHodName(hodName);
        hod.setHodAddress(hodAddress);
        hod.setHodCity(hodCity);
        hod.setHodContact(hodContact);
        hod.setHodDepartment(hodDept);
        
        HodUpdate update = new HodUpdate();
        
        if(update.updated(hod)){
            response.sendRedirect("hodUpdationSuccess.jsp");
        }
        else{
            response.sendRedirect("hodUpdationFailed.jsp");
        }
    }
    
    
}
