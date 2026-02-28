<%-- 
    Document   : createuser
    Created on : Jun 26, 2024, 7:05:34 PM
    Author     : Mai Truc Phuong
--%>

<%@page import="user_rabbit.UserError"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create User Account</title>
        <link rel="icon" type="image/x-icon" href="img/logo.png">
        <script src="https://kit.fontawesome.com/853d2cd4f0.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <style>
        .c {
            padding: 7px;
            padding-right: 80px;
            border-radius: 40px;
            margin: 10px;
        }
    </style>
    <body style="background-color: #fef4ec;">
        <jsp:include page="headershop.jsp"/>
        <%
            UserError userError = (UserError) request.getAttribute("USER_ERROR");
            if (userError == null) {
                userError = new UserError();
            }
        %>
        <div>
            <h1>Input your information</h1>
            <form action="MainController" method="POST"  style="text-align: center">
                <input class="c" type="text" name="userID" required="" placeholder="User"/></br>
                <input class="c" type="text" name="fullName" required="" placeholder="Full Name"/></br>
                <input class="c" type="text" name="roleID" value="0" readonly="" placeholder="Role ID"/></br>
                <input class="c" type="password" name="password" required="" placeholder="Password"/></br>
                <input class="c" type="password" name="confirm" required="" placeholder="Confirm"/></br>
                <div style="padding-top: 10px;">
                    <input class="c" type="submit" name="action" value="Create" style="background-color: brown"/>
                </div>
            </form>
        </div>
        <div class="footer"> <jsp:include page="footer.html"/> </div>
    </body>
</html>
