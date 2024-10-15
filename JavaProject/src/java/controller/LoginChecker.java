/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UserDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginAuthenticator;

/**
 *
 * @author YUG
 */
public class LoginChecker extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("login.jsp");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        UserDTO dto = new UserDTO();
        dto.setUsername(username);
        dto.setPassword(password);
        
        LoginAuthenticator auth = new LoginAuthenticator();
        boolean logged = auth.isLogin(dto);
        
        if(logged){
            HttpSession session = req.getSession(true);
            session.setAttribute("username", dto.getUsername());
            if(dto.getRole().equals("Admin"))
                resp.sendRedirect("adminPage.jsp");
            else if(dto.getRole().equals("Hod"))
                resp.sendRedirect("hodPage.jsp");
            else if(dto.getRole().equals("Faculty"))
                resp.sendRedirect("facultyPage.jsp");
            else if(dto.getRole().equals("Student"))
                resp.sendRedirect("studentPage.jsp");
            else{
                System.out.println("Role assigned to " + dto.getUsername() + " = None");
                resp.sendRedirect("logout.jsp");
            }
        }
        else{
            resp.sendRedirect("logout.jsp");
        }
    }  
}
