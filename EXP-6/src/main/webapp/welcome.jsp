<%@ page language = "java" %>
<%@ page import = "java.util.Date" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Page</title>
</head>
<body>
    <h1>Welcome to RCOE</h1>
    <h2>Username : <%= request.getParameter("username") %></h2>
    <h2>User Email ID : <%= request.getParameter("useremail") %></h2>
    <h2>Date & Time : <%= new Date() %></h2>
</body>
</html>