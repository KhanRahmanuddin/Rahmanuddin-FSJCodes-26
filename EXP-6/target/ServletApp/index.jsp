<%@ page language = "java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Page</title>
</head>
<body>
    <div>
        <form action="welcome.jsp" method="get">
            <div>
                <label for="username">Enter Your Name:</label>
                <input type="text" name="username" id="username">
            </div>

            <div>
                <label for="useremail">Enter Your Email ID:</label>
                <input type="email" name="useremail" id="useremail">
            </div>

            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>