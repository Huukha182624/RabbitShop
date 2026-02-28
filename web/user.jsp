<%-- 
    Document   : user
    Created on : May 24, 2024, 1:13:24 PM
    Author     : DELL'
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
        <style>

            .animated-gradient-text {
                margin-top: 350px;
                margin-bottom: -300px;
                font-size: 30px;
                font-weight: 900;
                background: linear-gradient(270deg, #ff6ec4, #7873f5, #7bdff2, #f7f881);
                background-size: 800% 800%;
                -webkit-background-clip: text;
                -webkit-text-fill-color: transparent;
                animation: gradientAnimation 8s ease infinite;
                text-transform: capitalize;        
            }

            @keyframes gradientAnimation {
                0% {
                    background-position: 0% 50%;
                }
                50% {
                    background-position: 100% 50%;
                }
                100% {
                    background-position: 0% 50%;
                }
            }
            .navbar{
                background-color: blueviolet;
                width: 100%;
                background-color: #660066;
            }
            a{
                text-decoration: none;
                color: black;
                font-weight: 100;
            }
            a:hover {
                text-decoration: none;
                color: #dc3545;
            }
            ul{
                list-style: none;
            }
            ul.product{
                text-align: center;
                flex-wrap: wrap;
                justify-content: space-between;
            }
            header{
                background-color: #660066;;

            }
            .search-bar{
                text-align: center;
            }
            .search-bar {
                margin-top: 30px;
                padding: 15px;
            }

            .search-bar h3 {
                margin-bottom: 10px;
            }

            .search-bar input[type="number"] {
                width: 230px;
            }

            .search-bar input[type="submit"] {
                margin-top: 10px;
                padding: 5px 10px;
                background-color: #28a745;
                color: white;
                border: none;
                cursor: pointer;
            }

            .search-bar input[type="submit"]:hover {
                background-color: #218838;
            }
            .logo{
                width: 70px;
                height: 40px;
            }

            .img-banner{
                width: 100%;
                height: auto;
            }
            img.rabbitimg {
                width: 300px;
                height: 300px;
            }
            .span{
                margin-left: 100px;
            }
            img{
                width: 230px;
                height: 230px;
            }
            .cart-icon{
                display: flex;
                justify-content: center;
                align-content: center;
                font-size: 40px;
                color: #333;
                margin-top: 50px;
            }
            .your-cart{
                font-family: serif;
                font-size: 28px;
                color: #333;
                font-weight: bold;
            }
            .your-wishlist{
                font-family: serif;
                font-size: 28px;
                color: #333;
                font-weight: bold;
            }

            .section{
                border: 1px solid #ccc;
                background-color: #cccccc;
                max-width: 1200px;
                margin: auto;
                padding: 20px;
                margin-bottom: 20px;
                opacity: 0.9;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);

            }
            #quantity{
                display: inline;
                width: 25px;
                height: 30px;
                font-size: 16px;
                background-color: red;
                opacity: 0.9;
                border-radius: 15px;
                color: white;
            }
            .product {
                list-style: none;
                padding: 0;
            }

            .product li {
                display: inline-block;
                width: 23%;
                margin: 1%;
                border: 1px solid #ccc;
                padding: 10px;
                box-sizing: border-box;
            }

            .product-item {
                text-align: center;
                background: white;
            }

            .product-img img {
                width: 230px;
                height: 230px;
            }

            .product-name { 
                padding-top: 20px;
                font-weight: bold;
                width: 100%;
                font-size: 20px;
                text-align: center;
                color: #1a1c1b;
                font-family: monospace;
            }

            .product-price {
                color: #28a745;
                font-size: 14px;
                margin-bottom: 10px;
                font-size: x-large;
            }
            .addcart{
                text-decoration: none;
                color: white;
                display: inline-block;
                margin-top: 10px;
                padding: 8px 15px;
                border-radius: 40px;
                margin: 10px;
            }

            footer {
                background-color: #f1f1f1;
                padding: 10px 0;
                text-align: center;
            }

            .logout{
                padding: 8px 16px;
                border-radius: 40px;
                margin: 10px;                                                         
            }

            .form-container input[type="submit"] {
                padding: 5px 10px;
                background-color: #dc3545;
                color: white;
                border: none;
                cursor: pointer;
            }
            .social ul{
                margin-top: 20px;
                display: flex; 
                justify-content: space-around;
            }

            .sold-out{
                color: red;
                text-decoration: line-through;
            }
            .wish{
                width: 26px;
                height: 26px;
                margin-right: 30px;
            }
        </style>
    </head>
    <body  style="background-color: #fef4ec;" >
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

        <div>
            <img class="img-banner"  src="img/logo.png">

            <form>
                <div  style="margin-left: 89%; margin-top: 43px;">
                    <ul style="display: inline-flex">
                        <li><a href="viewcart.jsp"><img class="wish" src="img/bag.png"></a></li>
                        <li><a href="WistListController?uId=<%=user%>"><img class="wish" src="img/wish.png"></a></li>
                        <li><a href="search.jsp"><img style="width: auto; height: auto" src="img/search-icon.png"></a></li>
                    </ul>
                </div>
            </form> 
        </div>
        <div class="col-12">
            <h4> <p style= "text-align: center;
                    width: 100%;
                    float: left;
                    font-size: 44px;
                    color: #252525;
                    font-weight: bold;
                    text-transform: uppercase;"
                    > Welcome <%= user%> </p></h4> 
        </div>


        <div class="shop">
<!--        <h1 style="color: green"> Welcome user <%= user%> </h1> <br>-->

            <br>


            <div class="col-md-12">
                <ul class="product">
                    <%
                        List<RabbitDTO> list2 = null;
                        if (request.getAttribute("data") != null) {
                            list2 = (List<RabbitDTO>) request.getAttribute("data");
                            for (RabbitDTO i : list2) {
                    %>
                    <li>
                        <div class="product-item ">
                            <div class="product-name">
                                <%=i.getRabbitName()%> 
                            </div>
                            <div class="product-img">
                                <img class="product-img-src" src="img/<%=i.getImg()%>">
                            </div>

                            <div class="product-price">
                                <%=i.getPrice()%>$
                            </div>
                            <div class="product-name">
                                Stock: <%=i.getQuantity()%>
                            </div>
                            <%
                                if (i.getQuantity() > 0 && i.isNotSale()) {
                            %>
                            <div style="display: inline-flex;
                                 margin-bottom: 20px;
                                 margin-top: 10px;">
                                <div class="addcart" style="background-color: black;">
                                    <a style=" color: white" href="AddToCartController?rabbitId=<%=i.getRabbitId()%>" > Add to cart </a>
                                </div>
                                <div class="addcart" style="background-color: #ffb1ca78;">
                                    <a href="AddToWishlistController?rabbitId=<%=i.getRabbitId()%>&userId=<%=user%>" > Add to wishlist </a> &nbsp; <i class="fa-brands fa-gratipay"></i>
                                </div>
                            </div>
                            <%
                            } else {
                            %>
                            <h4 class="sold-out"> Sold Out !! </h4>
                            <%
                                }
                            %>
                        </div>        
                        <form>
                    </li>
                    <%
                            }
                        }
                    %>
                </ul>
            </div>

        </div>
    </div>
    <div style="text-align: center;">
        <form action="MainController" method="get">
            <input class="logout" type="submit" value="Logout" > &nbsp; <i class="fa-solid fa-right-from-bracket"></i>
        </form>
    </div>
    <br>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div  class="social">
                    <ul>
                        <li> <a href="#"><i class="fa-brands fa-facebook"></i> &nbsp; Facebook </a> </li>
                        <li> <a href="#"><i class="fa-brands fa-square-instagram"></i> &nbsp; Instagram </a> </li>
                        <li> <a href="#"><i class="fa-brands fa-square-x-twitter"></i> &nbsp; X(Twitter) </a> </li>
                        <li> <a href="#"><i class="fa-brands fa-square-threads"></i> &nbsp; Thread </a> </li>
                        <li> <a href="#"><i class="fa-brands fa-tiktok"></i> &nbsp; Tiktok </a> </li>
                        <li> <a href="#"><i class="fa-brands fa-square-threads"></i> &nbsp; Thread </a> </li>
                    </ul> 
                </div>   
            </div>
        </div>
    </div>
</body>
</html>
