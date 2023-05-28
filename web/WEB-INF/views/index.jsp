<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <title>index</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>
    <script>
    </script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
    <style>
        @font-face {
            font-family: 'NeoDunggeunmoPro-Regular';
            src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2302@1.0/NeoDunggeunmoPro-Regular.woff2') format('woff2');
            font-weight: normal;
            font-style: normal;
        }

        @font-face {
            font-family: 'DOSPilgiMedium';
            src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2304-2@1.0/DOSPilgiMedium.woff2') format('woff2');
            font-weight: normal;
            font-style: normal;
        }

        .wrapper {
            display: flex;
            flex-direction: column;
            height: 100%;
            grid-template-columns: 1fr 1fr 1fr 1fr;
        }

        .card {
            display: inline-block;
        }

        section {
            flex: 1;
            display: flex;
        }

        main {
            flex: 1;
            margin-top: 15px;
            margin-left: 20px;
            margin-right: 20px;
        }

        header {
            height: 100px;
        }

        main {
            border: 4px solid;
            text-align: center;
        }

        header {
            border: 2px lightgrey dashed;
            border-radius: 25px;
        }

        #menu-bar {
            background-color: rgba(128, 128, 128, 0.3);
            width: 300px;
        }

        body {
            padding: 0;
        }

        html, body {
            height: 100%;
        }

        * {
            box-sizing: border-box;
        }

        ul {
            list-style: none;
            padding: 0;
            width: auto;
        }

        ul > li {
            text-align: center;
            width: 100%;
        }

        i {
            font-size: 50px;
        }

        div {
            display: flex;
        }


        #search-bar {
            display: grid;
            grid-template-columns: 1fr;
            flex-direction: column;
            flex-wrap: nowrap;
        }

        .main-inner-grid {
            display: grid;
            grid-template-rows: 6fr 1fr 1fr;
            grid-template-columns: 1fr 4fr 1fr;
            grid-auto-rows: minmax(50px, auto);
            grid-auto-columns: minmax(50px, auto);
            justify-content: center;
            align-items: center;
            justify-items: center;
        }

        .main-outer-grid {
            display: grid;
            grid-auto-rows: minmax(50px, auto);
            grid-auto-columns: minmax(50px, auto);
            grid-template-rows: 1fr 1fr;
            grid-template-columns: 1fr 1fr 1fr 1fr;
        }

        .h1, .h2, .h3, .h4, .h5, .h6, h1, h2, h3, h4, h5, h6 {
            margin-top: 0;
            margin-bottom: 0;
            font-weight: 500;
            line-height: 1.2;
        }

        .card {
            display: grid;
        }

        .card-text {
            margin-bottom: 0;
        }

        #logo {
            width: 200px;
            height: 80px;
            object-fit: cover;
            filter: drop-shadow(2px 4px 6px orange);
        }

        #header-bar {
            clip-path: polygon(4% 0, 0% 45%, 0 100%, 96% 100%, 100% 58%, 100% 0%);
            font-size: 20px;
        }

        #header-div {
            display: grid;
        }

        #navbarScroll {
            display: grid;
            justify-items: center;
            grid-template-columns: 0.8fr 0.3fr 1fr 0.5fr;
        }

        #header-form {
            grid-column: span 2;
        }

        #search-bar {
            width: 380px;
            height: 50px;
        }

        #category-drop {
            width: 100%;
            height: 100%;
        }

        #search-div {
            width: 100%;
        }

        .dropdown-toggle::after {
            margin: 0;
        !important;
        }

        #dropdown {
            font-size: 30px;
        }

        #navbar-main {
            color: antiquewhite;
        }


        #login-register-icon {
            color: white;
            opacity: 0.5;
            font-size: 30px;
        }

        #login-icon, #register-icon, #plus-icon {
            font-size: 40px;
        }

        #category-bar {
            font-size: 30px;
            text-shadow: #0d6efd;
        }

        img {
            width: fit-content;
        }

        #product-detail {
            width: 18rem;
            border: black dotted;
            border-radius: 30px;
            background-color: rgba(255, 255, 255, 0.2);
        }

        #product-detail a {
            text-decoration: none;
            color: inherit;
        }

    </style>
</head>
<body>
<div class="wrapper rounded-5" id="header">
    <div id="header-div">
        <div class="navbar navbar-dark bg-dark">
            <header class="container-fluid m-2" id="header-bar">
                <div class="collapse navbar-collapse" id="navbarScroll"
                     style="font-family: 'NeoDunggeunmoPro-Regular', sans-serif;">
                    <div class="justify-content-end" id="category-drop">
                        <ul class="navbar-nav justify-content-center align-content-center" id="dropdown">
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                                   aria-expanded="false" id="navbar-main">
                                    Category
                                </a>
                            </li>
                        </ul>
                    </div>
                    <div class="m-0" id="logo-div">
                        <a href="<c:url value = "/"/>">
                            <img src="https://i.ibb.co/LRPSb4K/removebg-preview.png" id="logo" alt="logo"></a>
                    </div>
                    <div class="align-items-center" id="search-div">
                        <form class="d-flex m-0 align-content-center" id="header-form">
                            <input class="form-control me-2" id="search-bar" type="search" placeholder="Search"
                                   aria-label="Search">
                            <button class="btn btn-outline-success" type="submit">Search</button>
                        </form>
                        <div class="justify-content-center align-content-center" id="login-register-icon">
                            <i class="bi bi-person-fill m-2" id="login-icon"
                               onclick="location.href = '/user/login'"></i>
                            <i class="bi bi-list-check m-2" id="register-icon"
                               onclick="location.href = '/user/register'"></i>
                            <i class = "bi bi-bag-fill" onclick="location.href='/basket/showBasket/'">
                            </i>
                            <c:if test="${userRole eq 'market'}">
                                <i class="bi bi-plus-square-fill m-2" id="plus-icon"
                                   onclick="location.href = 'product/create'"></i>
                            </c:if>
                        </div>
                    </div>
                </div>
                <div>

                </div>
            </header>
        </div>
    </div>
    <section class="bg-dark">
        <nav class="mb-4 ms-4 rounded-5 d-flex justify-content-center" id="menu-bar">
            <ul class="d-flex justify-content-center text-light" id="category-bar"
                style="font-family: DOSPilgiMedium, serif, white">category
            </ul>
        </nav>
        <main class="main-outer-grid">
            <c:forEach var="goods" items="${product}">
                <div class="m-3 justify-content-center">
                    <div class="card border-4"
                         style="width: fit-content; height: fit-content; font-family: NeoDunggeunmoPro-Regular,serif"
                         id="product-detail">
                        <div class="main-inner-grid">
                            <div></div>
                            <a href="/product/item/${goods.productId}">
                                <img src="${pageContext.request.contextPath}/resources/img/2.png" alt="2"
                                ></a>
                            <div></div>
                            <div></div>
                            <h2><a href="/product/item/${goods.productId}">${goods.productName}</a>
                            </h2>
                            <div></div>
                            <div></div>
                            <p class="card-text">${goods.price}</p>
                            <div></div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </main>
    </section>
</div>
</body>
</html>
