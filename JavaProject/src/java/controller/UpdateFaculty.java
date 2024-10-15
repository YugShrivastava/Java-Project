package controller;

import dto.FacultyDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.FacultyUpdate;

/**
 *
 * @author YUG
 */
public class UpdateFaculty extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("updateFaculty.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String facultyID = request.getParameter("facultyid");
        String facultyName = request.getParameter("facultyname");
        String facultyAddress = request.getParameter("facultyadd");
        String facultyContact = request.getParameter("facultycontact");
        String facultyCity = request.getParameter("facultycity");
        String facultyDept = request.getParameter("facultydepartment");
        
        FacultyDTO faculty = new FacultyDTO();
        faculty.setFacultyID(facultyID);
        faculty.setFacultyName(facultyName);
        faculty.setFacultyAddress(facultyAddress);
        faculty.setFacultyCity(facultyCity);
        faculty.setFacultyContact(facultyContact);
        faculty.setFacultyDepartment(facultyDept);
        
        FacultyUpdate update = new FacultyUpdate();
        
        if(update.updated(faculty)){
            response.sendRedirect("facultyUpdationSuccess.jsp");
        }
        else{
            response.sendRedirect("facultyUpdationFailed.jsp");
        }
    }
    
    
}
