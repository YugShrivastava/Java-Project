package controller;

import dto.StudentDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.StudentUpdate;

/**
 *
 * @author YUG
 */
public class UpdateStudent extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("updateStudent.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentID = request.getParameter("studentid");
        String studentName = request.getParameter("studentname");
        String studentAddress = request.getParameter("studentadd");
        String studentContact = request.getParameter("studentcontact");
        String studentCity = request.getParameter("studentcity");
        String studentDept = request.getParameter("studentdepartment");
        
        StudentDTO student = new StudentDTO();
        student.setStudentID(studentID);
        student.setStudentName(studentName);
        student.setStudentAddress(studentAddress);
        student.setStudentCity(studentCity);
        student.setStudentContact(studentContact);
        student.setStudentDepartment(studentDept);
        
        StudentUpdate update = new StudentUpdate();
        
        if(update.updated(student)){
            response.sendRedirect("studentUpdationSuccess.jsp");
        }
        else{
            response.sendRedirect("studentUpdationFailed.jsp");
        }
    }
    
    
}
