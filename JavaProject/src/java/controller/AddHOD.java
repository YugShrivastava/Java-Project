package controller;

import dto.HODDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HODRegistration;
import model.SetNewID;

/**
 *
 * @author YUG
 */
public class AddHOD extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("addHOD.jsp");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String hodID = SetNewID.newID("hod");
        String hodName = req.getParameter("hodname");
        String hodAddress = req.getParameter("hodaddress");
        String hodContact = req.getParameter("hodcity");
        String hodCity = req.getParameter("hodcontact");
        String hodDepartment = req.getParameter("hoddepartment");
        String hodPassword = req.getParameter("hodpassword");
        
        HODDTO dto = new HODDTO();
        dto.setHodID(hodID);
        dto.setHodName(hodName);
        dto.setHodAddress(hodAddress);
        dto.setHodContact(hodContact);
        dto.setHodDepartment(hodDepartment);
        dto.setHodCity(hodCity);
        dto.setHodPassword(hodPassword);
        
        HODRegistration hr = new HODRegistration();
        boolean register = hr.isRegister(dto);
        
        if(register)
        {
            resp.sendRedirect("hodRegistrationSuccess.jsp");
        }
        else
        {
            resp.sendRedirect("hodRegistrationFailed.jsp");
        }
    }
}
