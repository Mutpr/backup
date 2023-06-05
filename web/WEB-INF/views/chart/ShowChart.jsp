<%--
  Created by IntelliJ IDEA.
  User: HYEN
  Date: 2023-06-06
  Time: 오전 2:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <canvas id="myChart"></canvas>
</div>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

<script>
    const ctx = document.getElementById('myChart');
    $.ajax({
        url:'/chart/categoryCountDoughnut',
        success:function(data){
            let x =[];
            for(let i in data){
                console.log(data[i].count);
                x.push(data[i].count)
            }
            new Chart(ctx, {
                type: 'doughnut',
                data: {
                    labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
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
        }
    })

</script>
</body>
</html>
