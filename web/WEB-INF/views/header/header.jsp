<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../../../resources/css/PageCSS.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <title>index</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
                            <i class="bi bi-person-fill m-2" id="login-icon"></i>
                            <i class="bi bi-list-check m-2" id="register-icon"
                               onclick="location.href = 'user/login'"></i>
                            <sec:authorize access="hasRole('market')">
                                <i class="bi bi-plus-square-fill m-2" id="plus-icon"
                                   onclick="location.href = 'product/create'"></i>
                            </sec:authorize>
                        </div>
                    </div>
                </div>
                <div>
                </div>
            </header>
        </div>
    </div>
</div>
</body>
</html>