package com.jspbd.jsp_db_1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hola Wilmer!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1 class=\"text-center\">" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }

    public int m(){
        return 1;
    }
}