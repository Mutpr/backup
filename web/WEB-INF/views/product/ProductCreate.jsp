<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <title>index</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Oswald:wght@200&display=swap');

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

        #footer {
            opacity: 75%;
            height: 80px;
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

        .outer-grid {
            display: grid;
            grid-template-rows: 1fr 1fr 1fr;
            grid-template-columns: 1fr;
        }

        .inner-grid {
            display: grid;
            grid-template-columns: 1fr 1fr 1fr 1fr;
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
            grid-template-rows: 1fr 0.2fr 1fr;
            grid-template-columns: 0.3fr 1fr;
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
        }

        #header-bar {
            font-size: 20px;
        }


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

        #header-div {
            display: grid;
        }

        #header-bar {
            clip-path: polygon(4% 0, 0% 45%, 0 100%, 96% 100%, 100% 58%, 100% 0%);
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
            width: 100%;
            height: 100%;
        }

        #category-drop {
            width: 100%;
            height: 100%;
        }

        #logo {
            filter: drop-shadow(2px 4px 6px orange);
        }

        #search-div {
            width: 100%;
        }

        .dropdown-toggle::after {
            margin: 0;
        !important;
        }

        #dropdown {
            font-size: 100%;
        }

        #navbar-main {
            color: antiquewhite;
        }


        #login-register-icon {
            color: white;
            opacity: 0.5;
            font-size: 100%;
        }

        #login-icon, #register-icon {
            font-size: 100%;
        }

        #category-bar {
            font-size: 30px;
            text-shadow: #0d6efd;
        }

        img {
            width: fit-content;
        }

        #product-detail {
            width: 100%;
            border: black dotted;
            border-radius: 30px;
            background-color: rgba(255, 255, 255, 0.2);
        }

        #product-detail a {
            text-decoration: none;
            color: inherit;
        }

        #detail-image {
            grid-row: span 3;
            width: 100%;
            height: 100%;
        }

        img {
            width: 75%;
            height: 75%;
        }

        #register {
            flex-wrap: wrap;
            font-size: 100%;
            border-radius: 30px;
            background-color: rgba(128, 128, 128, 0.3);
            height: 100%;
            width: 100%;
            display: flex;
        }

        #create-div {
            display: grid !important;
            place-self: center;
            width: 75%;
            text-align: center;
        }

        #description-bar {
            height: 150px !important;
        }

        #create-div input {
            height: 50px;
        }

        #create-div input::placeholder {
            font-size: 20px
        }

        #create-div button {
            font-size: 20px
        }

        #product-form {
            display: inline-table;
            width: 75%;
            justify-self: center;
        }
    </style>
</head>
<body style="width: 100%;">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
<script>
    function fileName() {
        let name = document.getElementById('file').files[0].name;
        console.log(name);
    }
</script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
<div class="wrapper rounded-5">
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
                        <i class="bi bi-person-fill m-2" id="login-icon"
                           onclick="location.href = '/user/login'"></i>
                        <i class="bi bi-list-check m-2" id="register-icon"
                           onclick="location.href = '/user/register'"></i>
                        <i class="bi bi-bag-fill" onclick="location.href='/basket/showBasket/'">
                        </i>
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
        <div class="d-flex justify-content-center text-light align-self-center m-5" id="register"
             style="font-family: NeoDunggeunmoPro-Regular, serif, white">
            <div class="grid-container align-content-center justify-items-center" id="create-div">
                <form class="m-3" id="product-form" action="/product/fileUpload" method="post"
                      enctype="multipart/form-data">
                    <h1 class="m-3 justify-content-center grid">상품 등록</h1>
                    <input class="form-control mb-3" name="productName" id="productName" type="search"
                           placeholder="이름을 입력해주세요"
                           aria-label="Search">
                    <input class="form-control mb-3" name="price" id="price" type="search" placeholder="가격을 입력해주세요"
                           aria-label="Search">
                    <input class="form-control mb-3" name="description" id="description" type="search"
                           placeholder="설명을 입력해주세요"
                           aria-label="Search">
                    <button type="button" class="btn btn-warning w-25 h-75 mb-3">
                        이미지 등록
                    </button>
                    <br>
                    파일 선택 : <input type="file" name="file">
                    <input type="submit" value="전송">
                </form>
            </div>
        </div>
    </section>
</div>
<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
     aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="staticBackdropLabel">Modal title</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                파일 선택 : <input type="file" multiple="multiple" name="file">
                <input type="submit" value="전송">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
            </div>
        </div>
    </div>

</div>

</body>
</html>

