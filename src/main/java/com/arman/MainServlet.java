package com.arman;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class MainServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // 1. Name and Email
        String name = request.getParameter("name");
        if (name != null) {
            out.println("<h2>GET Method Output</h2>");
            out.println("Name: " + name + "<br>");
            out.println("Email: " + request.getParameter("email") + "<br>");
            out.println("HTTP Method Used: " + request.getMethod() + "<br><hr>");
        }

        // 2. Addition using GET
        String add1 = request.getParameter("add1");
        if (add1 != null) {
            int n1 = Integer.parseInt(add1);
            int n2 = Integer.parseInt(request.getParameter("add2"));
            out.println("Sum: " + (n1 + n2) + "<br><hr>");
        }

        // 3. Celsius to Fahrenheit
        String c = request.getParameter("celsius");
        if (c != null) {
            double cel = Double.parseDouble(c);
            double fah = (cel * 9/5) + 32;
            out.println("Fahrenheit: " + fah + "<br><hr>");
        }

        // 4. Student Details
        String sname = request.getParameter("sname");
        if (sname != null) {
            out.println("Name: " + sname + "<br>");
            out.println("Roll: " + request.getParameter("roll") + "<br>");
            out.println("Course: " + request.getParameter("course") + "<br><hr>");
        }

        // 5. Greater Number
        String g1 = request.getParameter("g1");
        if (g1 != null) {
            int n1 = Integer.parseInt(g1);
            int n2 = Integer.parseInt(request.getParameter("g2"));
            int max = (n1 > n2) ? n1 : n2;
            out.println("Greater Number: " + max + "<br><hr>");
        }

        // 6. Simple Interest
        String p = request.getParameter("p");
        if (p != null) {
            double si = (Double.parseDouble(p) *
                    Double.parseDouble(request.getParameter("r")) *
                    Double.parseDouble(request.getParameter("t"))) / 100;
            out.println("Simple Interest: " + si + "<br><hr>");
        }

        // 7. Hidden Field
        String uid = request.getParameter("userId");
        if (uid != null) {
            out.println("User ID: " + uid + "<br><hr>");
        }

        // 8. Dropdown Selection
        String cs = request.getParameter("courseSelect");
        if (cs != null) {
            out.println("Selected Course: " + cs + "<br><hr>");
        }

        // 9. Checkbox Multiple Values
        String[] skills = request.getParameterValues("skills");
        if (skills != null) {
            for (String s : skills) {
                out.println("Skill: " + s + "<br>");
            }
            out.println("<hr>");
        }
    }


    // =========================
    // SECTION B - doPost()
    // =========================

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // 1. Login Form
        String username = request.getParameter("username");
        if (username != null) {
            String password = request.getParameter("password");
            out.println("<h2>Login Details</h2>");
            out.println("Username: " + username + "<br>");
            out.println("Password: " + password + "<br><hr>");
        }

        // 2. Student Registration
        String regName = request.getParameter("regName");
        if (regName != null) {
            out.println("<h2>Student Registration</h2>");
            out.println("Name: " + regName + "<br>");
            out.println("Age: " + request.getParameter("age") + "<br>");
            out.println("Course: " + request.getParameter("regCourse") + "<br>");
            out.println("Gender: " + request.getParameter("gender") + "<br><hr>");
        }

        // 3. Multiplication
        String mul1 = request.getParameter("mul1");
        if (mul1 != null) {
            int m1 = Integer.parseInt(mul1);
            int m2 = Integer.parseInt(request.getParameter("mul2"));
            out.println("Multiplication Result: " + (m1 * m2) + "<br><hr>");
        }

        // 4. Feedback
        String fbName = request.getParameter("fbName");
        if (fbName != null) {
            out.println("Thank you " + fbName + " for your feedback!<br>");
            out.println("Comments: " + request.getParameter("comments") + "<br><hr>");
        }

        // 5. Employee Registration (Table Format)
        String empName = request.getParameter("empName");
        if (empName != null) {
            out.println("<table border='1'>");
            out.println("<tr><th>Name</th><th>Salary</th><th>Department</th></tr>");
            out.println("<tr><td>" + empName + "</td>");
            out.println("<td>" + request.getParameter("salary") + "</td>");
            out.println("<td>" + request.getParameter("department") + "</td></tr>");
            out.println("</table><hr>");
        }

        // 6. Hobbies Checkbox
        String[] hobbies = request.getParameterValues("hobbies");
        if (hobbies != null) {
            out.println("Selected Hobbies:<br>");
            for (String h : hobbies) {
                out.println(h + "<br>");
            }
            out.println("<hr>");
        }

        // 7. Validation (Empty Field Check)
        String valName = request.getParameter("valName");
        if (valName != null) {
            String valEmail = request.getParameter("valEmail");
            if (valName.isEmpty() || valEmail.isEmpty()) {
                out.println("<font color='red'>All fields are required!</font><hr>");
            } else {
                out.println("Validated Successfully<br><hr>");
            }
        }

        // 8. Redirect Example
        String redirectName = request.getParameter("redirectName");
        if (redirectName != null) {
            response.sendRedirect("success.html");
        }

        // 9. Area of Rectangle
        String length = request.getParameter("length");
        if (length != null) {
            double l = Double.parseDouble(length);
            double b = Double.parseDouble(request.getParameter("breadth"));
            out.println("Area: " + (l * b) + "<br><hr>");
        }

        // 10. Common processRequest()
        String commonMsg = request.getParameter("commonMsg");
        if (commonMsg != null) {
            out.println("Common Message: " + commonMsg + "<br><hr>");
        }
    }
}