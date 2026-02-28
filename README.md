# 🚀 Servlet Practical Assignment

## 📌 Topic
HTML Forms using **doGet() (GET Method)** and **doPost() (POST Method)** in Jakarta Servlet

---

## 🛠️ Technologies Used
- Java
- Jakarta Servlet API
- Apache Tomcat 10
- IntelliJ IDEA
- HTML

---

## 📂 Project Overview

This project demonstrates how to handle HTML form data using:

- GET Method → `doGet()`
- POST Method → `doPost()`
- Form validation
- Page redirection
- Handling multiple checkbox values
- Dynamic HTML generation

All tasks are implemented inside a single servlet:

`MainServlet.java`

---

# ✅ SECTION A — GET Method (doGet)

Handled inside:

protected void doGet(HttpServletRequest request, HttpServletResponse response)

### Implemented GET Tasks:

1. Name & Email Form  
2. Addition of Two Numbers (GET)  
3. Celsius to Fahrenheit Conversion  
4. Student Details Form  
5. Greater Number Between Two Values  
6. Simple Interest Calculation  
7. Hidden Field Example  
8. Dropdown Selection (Course)  
9. Checkbox Multiple Selection (Skills)  

✔ All Section A tasks use **method="get"**

---

# ✅ SECTION B — POST Method (doPost)

Handled inside:

protected void doPost(HttpServletRequest request, HttpServletResponse response)

### Implemented POST Tasks:

1. Login Form  
2. Student Registration (Gender Radio Button)  
3. Multiplication of Two Numbers  
4. Feedback Form  
5. Employee Registration (Displayed in Table Format)  
6. Hobbies Selection (Multiple Checkbox Values)  
7. Empty Field Validation  
8. Redirect to Success Page (success.html)  
9. Area of Rectangle Calculation  
10. Common Processing Example  

✔ All Section B tasks use **method="post"**

---

## 🔁 Redirect Feature

In Section B Task 8:

response.sendRedirect("success.html");

After submission, the user is redirected to a success page.

---

# 📂 Project Structure

ServletAssignment/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/anurag/
│       │       └── MainServlet.java
│       │
│       └── webapp/
│           ├── index.html
│           ├── success.html
│           └── WEB-INF/
│               └── web.xml
│
├── pom.xml
└── README.md

---

# ▶️ How to Run

1. Open project in IntelliJ IDEA  
2. Configure Apache Tomcat 10  
3. Add Artifact → Web Application: Exploded  
4. Start Server  
5. Open in browser:

http://localhost:8080/ServletAssignment/

---

# 🎯 Learning Outcomes

- Difference between GET and POST
- Handling request parameters
- Working with forms (text, radio, checkbox, dropdown)
- Validation and redirection
- Dynamic web development using Servlets

---

👨‍💻 Author  
Anurag Singh  
CSE Student
