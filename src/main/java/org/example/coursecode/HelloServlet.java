package org.example.coursecode;

import java.io.*;
import java.util.ArrayList;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.coursecode.entity.Course;
import org.example.coursecode.utility.courseList;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    courseList courseList;
    ArrayList<Course> courses;
    private String message;

    public void init() {
        message = "Course Mangment System!";
        courseList = new courseList();
        courses = courseList.getCourseList();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<table border='3' bordercolor='brown' cellspacing='5'>");
        for (int i = 0; i < courses.size(); i++) {
            Course employee = courses.get(i);
            out.println("<tr>");
            out.println("<td style='background-color:yellow'>" + employee.getCourseId() + "</td>");
            out.println("<td style='background-color:red'>" + employee.getCourseCode() + "</td>");
            out.println("<td style='background-color:blue'>" + employee.getCourseName() + "</td>");
            out.println("<td style='background-color:blue'>" + employee.getDescription() + "</td>");
            out.println("</tr>");
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}