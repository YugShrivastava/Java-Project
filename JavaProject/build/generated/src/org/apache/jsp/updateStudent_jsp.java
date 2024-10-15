package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.StudentDAO;
import dto.StudentDTO;

public final class updateStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update Student</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Update Student Record</h1>\n");
      out.write("        <form action=\"updateStudent.jsp\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Enter Student ID: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"studentid\" required/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        ");

            String studentID = request.getParameter("studentid");
            
            if(studentID != null && !studentID.trim().equals("")){
                StudentDAO sDAO = new StudentDAO();
                StudentDTO student = sDAO.getStudentData(studentID);
                if(student == null){
        
      out.write("\n");
      out.write("                <h2>No Records Found for ID: ");
      out.print(studentID );
      out.write("</h2>\n");
      out.write("        ");

                }
                else{
                
      out.write("\n");
      out.write("                    \n");
      out.write("                <form action=\"UpdateStudent\" method=\"post\" style=\"padding-top: 25px;\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td><strong>Student ID: </strong></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"studentid\" disabled=\"disabled\" value=\"");
      out.print(studentID);
      out.write("\" />\n");
      out.write("                    <input type=\"hidden\" name=\"studentid\" value=\"");
      out.print(studentID);
      out.write("\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><strong>Student Name: </strong></td>\n");
      out.write("                <td><input type=\"text\" name=\"studentname\" value=\"");
      out.print(student.getStudentName());
      out.write("\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><strong>Student Address: </strong></td>\n");
      out.write("                <td><input type=\"text\" name=\"studentadd\" value=\"");
      out.print(student.getStudentAddress());
      out.write("\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><strong>Student Contact: </strong></td>\n");
      out.write("                <td><input type=\"text\" name=\"studentcontact\" value=\"");
      out.print(student.getStudentContact());
      out.write("\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><strong>Student City: </strong></td>\n");
      out.write("                <td><input type=\"text\" name=\"studentcity\" value=\"");
      out.print(student.getStudentCity());
      out.write("\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><strong>Student Department: </strong></td>\n");
      out.write("                <td>\n");
      out.write("                <SELECT name=\"studentdepartment\">\n");
      out.write("                    <option><strong>CSE</strong></option>\n");
      out.write("                    <option><strong>IT</strong></option>\n");
      out.write("                    <option><strong>AIML</strong></option>\n");
      out.write("                    <option><strong>EC</strong></option>\n");
      out.write("                </SELECT>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"reset\" /></td>\n");
      out.write("                <td><input type=\"submit\" value=\"Update\" /></td>\n");
      out.write("            </tr>            \n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("                \n");
      out.write("                ");

                }
            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
