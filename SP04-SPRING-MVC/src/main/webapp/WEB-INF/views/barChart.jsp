
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" />

</head>
<body>

	<div class="container">
		<h2 align="center">Data Graph</h2>

		<div id="container"
			style="width: 550px; height: 400px; margin: 0 auto"></div>
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://code.highcharts.com/highcharts.js"></script>
	<script src="https://code.highcharts.com/modules/exporting.js"></script>
	<script>
	alert("in scriopt")
	
	var ages = [10, 5, 30, 45, 20];
  	var names = ['React', 'Angular', 'Vue', 'Hyperapp', 'Omi'];
  	
    $(function(){
    Highcharts.chart('container', {
        chart: {
            type: 'column'
        },
        title: {
            text: 'Organization'
        },
        subtitle: {
            text: 'Details'
        },
        xAxis: {
            categories: names,
            crosshair: true
        },
        yAxis: {
            min: 0,
            max:100,
            title: {
                text: 'Age'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
            '<td style="padding:0"><b>{point.y:.1f} K</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0
            }
        },
        series: [{
            name: 'Name',
            data: ages
        }]
      });
    });
</script>

</body>
</html>

