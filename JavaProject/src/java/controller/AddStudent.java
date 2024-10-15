package controller;

import dto.StudentDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.SetNewID;
import model.StudentRegistration;

/**
 *
 * @author YUG
 */
public class AddStudent extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("addStudent.jsp");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String studentID = SetNewID.newID("student");
        String studentName = req.getParameter("studentname");
        String studentAddress = req.getParameter("studentaddress");
        String studentContact = req.getParameter("studentcity");
        String studentCity = req.getParameter("studentcontact");
        String studentDepartment = req.getParameter("studentdepartment");
        String studentPassword = req.getParameter("studentpassword");
        
        StudentDTO dto = new StudentDTO();
        dto.setStudentID(studentID);
        dto.setStudentName(studentName);
        dto.setStudentAddress(studentAddress);
        dto.setStudentContact(studentContact);
        dto.setStudentDepartment(studentDepartment);
        dto.setStudentCity(studentCity);
        dto.setStudentPassword(studentPassword);
        
        StudentRegistration sr = new StudentRegistration();
        boolean register = sr.isRegister(dto);
        
        if(register)
        {
            resp.sendRedirect("studentRegistrationSuccess.jsp");
        }
        else
        {
            resp.sendRedirect("studentRegistrationFailed.jsp");
        }
    }
}
