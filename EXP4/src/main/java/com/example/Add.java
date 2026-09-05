package com.example;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/add")
public class Add extends GenericServlet {

    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        int sum = n1 + n2;

        out.println("<h1>Sum : " + sum + "</h1>");
    }
}