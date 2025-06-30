<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <
  title>test</title>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.5.1/chart.min.js"></script>  
  <script type="text/javascript">    
  
  	//var age = [10, 5, 30, 45, 20];
  	//var names = ['React', 'Angular', 'Vue', 'Hyperapp', 'Omi'];
  
  	var ages = ${age};	
	var names = [];

   	<%
   		List<String> n=(List<String>)request.getAttribute("name");   
		
      	for (String value : n) {
   	%>
    
   		names.push('<%= value %>'); // Add each value to the JavaScript array
   
   	<%
      	}
   	%>
  	console.log(names);
  	console.log(ages);
 
  	function drawChart() {      
      new Chart('myChart', {
        type: 'bar',
        data: {
          labels: namess,
          datasets: [{
            label: 'Github Stars',
            data: ages
          }]
        },
      });
    }
  </script>
</head>

<body onload="drawChart()">	
    
	<div style="width: 30%; height: 30%; margin: 0 auto" >
  		<canvas id="myChart" width="20" height="20"></canvas>
  	</div>
</body>

</html>