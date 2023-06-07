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

        .chart-wrap canvas {
            width: 100px;
        !important;
            height: 100px;
        !important;
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
                            <i class="bi bi-bag-fill" onclick="location.href='/basket/showBasket/'">
                            </i>
                            <c:if test="${userRole eq 'market'}">
                                <i class="bi bi-plus-square-fill m-2" id="plus-icon"
                                   onclick="location.href = 'product/create'"></i>
                            </c:if> <i class="bi bi-file-break" onclick="location.href='product/showIndex/1'"
                                       style="color: whitesmoke"></i>

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
            <%@ page contentType="text/html;charset=UTF-8" language="java" %>
            <html>
            <head>
                <title>Title</title>
            </head>
            <body>
            <div class="d-grid chart-wrap">
                <canvas id="myChart"></canvas>
            </div>
            <div class="d-grid chart-wrap">
                <canvas id="myChart1"></canvas>
            </div>
            <div class="d-grid chart-wrap">
                <canvas id="myChart2" style="width: 500px"></canvas>
            </div>
            <div class="d-grid chart-wrap">
                <canvas id="myChart3"></canvas>
            </div>
            <div class="d-grid chart-wrap" style="width: 1000px; height: 1000px">
                <canvas id="myChart4"></canvas>
            </div>
            <div class="d-grid chart-wrap">
                <canvas id="myChart5"></canvas>
            </div>
            <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
            <script>

                $(document).ready(function () {
                    pieDoughnutChart();
                    bubbleChart();
                });

                const ctx = document.getElementById('myChart');
                const ctx1 = document.getElementById('myChart1');
                const ctx2 = document.getElementById("myChart2");
                const ctx3 = document.getElementById("myChart3");
                const ctx4 = document.getElementById("myChart4");
                const ctx5 = document.getElementById("myChart5");

                function pieDoughnutChart() {
                    $.ajax({
                        url: '/chart/categoryCountDoughnut',
                        success: function (data) {
                            let x = [];
                            let y1 = []; let y2 = []; let y3 = []; let y4 = []; let y5 = []; let y6 = []; let y7 = [];
                            for (let i in data) {
                                x.push(data[i].count)
                                switch (data[i].category){
                                    case 1:y1.push(data[i].result)
                                        break;
                                    case 2:y2.push(data[i].result)
                                        break;
                                    case 3:y3.push(data[i].result)
                                        break;
                                    case 4:y4.push(data[i].result)
                                        break;
                                    case 5:y5.push(data[i].result)
                                        break;
                                    case 6:y6.push(data[i].result)
                                        break;
                                    case 7:y7.push(data[i].result)
                                        break;

                                }
                            }
                            new Chart(ctx, {
                                type: 'doughnut',
                                data: {
                                    borderWidth: 10,
                                    hoverBorderWidth: 0,
                                    labels: [y1, y2, y3, y4, y5, y6, y7],
                                    datasets: [{
                                        data: x,
                                        borderWidth: 1
                                    }]
                                },
                                options: {
                                    scales: {
                                        y: {
                                            beginAtZero: true
                                        }
                                    },
                                    responsive: true,
                                    cutoutPercentage: 65
                                }
                            });
                            new Chart(ctx1, {
                                type: 'pie',
                                data: {
                                    labels: y,
                                    datasets: [{
                                        data: x,
                                        borderWidth: 1
                                    }]
                                },
                                options: {
                                    hoverBackgroundColor: [
                                        "#5c0afc",
                                    ],

                                }
                            });
                        }
                    })
                }

                function bubbleChart() {
                    let start = [0, 5000, 10000, 15000, 20000]
                    let limit = [5000, 10000, 15000, 20000]
                    let category = [1, 2, 3, 4, 5, 6, 7];
                    let startI = [];
                    let limitJ = [];
                    let categoryK = [];
                    for (let i in start) {
                        startI.push(start[i]);
                    }
                    for (let j in limit) {
                        limitJ.push(limit[j])
                    }
                    for (let k in category) {
                        categoryK.push(category[k]);
                    }
                    let objectParam = {
                        "start": startI,
                        "limit": limitJ,
                        "category": categoryK,
                    }

                    $.ajax({
                        url: '/chart/countByPrice',
                        data: objectParam,
                        success: function (data) {
                            let x = [];
                            let y = [];
                            for(let i in data){
                                x.push(data[i].result);
                                y.push(data[i].category);
                            }
                            const ctx = document.getElementById('myChart2');
                            new Chart(ctx2, {
                                type: 'bubble',
                                data: {
                                    labels: y,
                                    datasets: [{
                                        label: '# of Votes',
                                        data: x,
                                        borderWidth: 1
                                    }]
                                },
                                options: {
                                    scales: {
                                        y: {
                                            beginAtZero: true
                                        }
                                    }
                                }
                            });

                        const ctx4 = document.getElementById('myChart4');
                        new Chart(ctx4, {
                            type: 'bar',
                            data: {
                                labels: y,
                                datasets: [{
                                    label: '# of Votes',
                                    data: x,
                                    borderWidth: 1
                                }]
                            },
                            options: {
                                scales: {
                                    x:{
                                        stacked:true,
                                    }
                                }
                            }
                        });
                    }
                    })
                }

            </script>
            </body>
            </html>
        </main>
    </section>
</div>
</body>
</html>
