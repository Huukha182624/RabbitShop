<%-- 
    Document   : search jsp
    Created on : Jun 22, 2024, 2:05:14 PM
    Author     : Mai Truc Phuong
--%>


<%@page import="user_rabbit.RabbitDTO"%>
<%@page import="user_rabbit.DAO"%>
<%@page import="wishlist.WishList"%>
<%@page import="product.CartDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Page</title>
        <link rel="icon" type="image/x-icon" href="img/logo.png">
        <script src="https://kit.fontawesome.com/853d2cd4f0.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <style>
        .welcom{
            width: 100%;
            float: left;
            font-size: 44px;
            color: #252525;
            font-weight: bold;
            text-transform: uppercase;
            text-align: center;
            margin-top: 20px;
        }
        .c{
            padding: 7px;
            padding-right: 20px;
            border-radius: 40px;
            margin: 10px;
        }
        .c2{
            background-color: #6a0a0a;
            color: white;
            padding: 7px 16px;
            border-radius: 40px;
            margin: 10px;
        }
    </style>
    <body style="background-color: #fef4ec;">
        <%
            String user = (String) session.getAttribute("user");
            DAO dao = new DAO();
            CartDTO cart = (CartDTO) session.getAttribute("CART");
            List<WishList> wishlist = dao.showWishList(user);
            String min = "0";
            String max = "0";
            if (session.getAttribute("min") != null) {
                min = (String) session.getAttribute("min");
            }
            if (session.getAttribute("max") != null) {
                max = (String) session.getAttribute("max");
            }
        %>

        <img class="img-banner"  src="img/logo.png">


        <div>
            <h4> <p class="welcom"> Welcome <%= user%>  </p></h4> 
        </div>



        <div style="text-align: center">
            <h3> Search Price </h3>
            <form action="MainController" method="post">
                From <input class="c" type="number" name="min" value="<%= min%>"> <br>
                To &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="c" type="number" name="max" value="<%= max%>"> <br>
                <input class="c2" type="submit" name="action" value="Search price"> &nbsp; <i class="fa-solid fa-magnifying-glass"></i> <br> <br><br>
            </form>
        </div>
    </body>
</html>
