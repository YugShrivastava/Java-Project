package controller;

import dto.FacultyDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.FacultyRegistration;
import model.SetNewID;

/**
 *
 * @author YUG
 */
public class AddFaculty extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("addFaculty.jsp");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String facultyID = SetNewID.newID("faculty");
        String facultyName = req.getParameter("facultyname");
        String facultyAddress = req.getParameter("facultyaddress");
        String facultyContact = req.getParameter("facultycity");
        String facultyCity = req.getParameter("facultycontact");
        String facultyDepartment = req.getParameter("facultydepartment");
        String facultyPassword = req.getParameter("facultypassword");
        
        FacultyDTO dto = new FacultyDTO();
        dto.setFacultyID(facultyID);
        dto.setFacultyName(facultyName);
        dto.setFacultyAddress(facultyAddress);
        dto.setFacultyContact(facultyContact);
        dto.setFacultyDepartment(facultyDepartment);
        dto.setFacultyCity(facultyCity);
        dto.setFacultyPassword(facultyPassword);
        
        FacultyRegistration fr = new FacultyRegistration();
        boolean register = fr.isRegister(dto);
        
        if(register)
        {
            resp.sendRedirect("facultyRegistrationSuccess.jsp");
        }
        else
        {
            resp.sendRedirect("facultyRegistrationFailed.jsp");
        }
    }
}
