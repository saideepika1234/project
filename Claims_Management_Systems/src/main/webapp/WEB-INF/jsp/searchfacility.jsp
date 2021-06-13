<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1 {
	padding: 60px;
	text-align: center;
	background: #009999;
	border-radius: 5px;
	color: white;
	font-size: 30px;
}

.row {
	width: 70%;
	padding: 15px;
	text-align: center;
	margin: 0px auto;
	display: inline-block;
	line-height: 10px;
	text-decoration: none;
	background-color: #3b986d;
	border-radius: 5px;
	color: white;
	font-size: 20px;
}
.op {
	width: 20%;
	padding: 15px;
	text-align: center;
	margin: 0px auto;
	display: inline-block;
	line-height: 10px;
	text-decoration: none;
	background-color: #3b986d;
	border-radius: 5px;
	color: white;
	font-size: 20px;
}

table {
	margin: auto auto;
	padding: 40px;
	border-radius: 5px;
	box-shadow: 0 0 10px #000;
	position: absolute;
	top: 0;
	bottom: 0;
	left: 0;
	right: 0;
	width: 450px;
	height: 320px;
	background-color: rgba(21, 134, 119, 0.301);
	font-family: verdana;
	color: black;
	font-style: normal;
	font-size: 16px;
	font-weight: bold;
}
</style>
</head>
<body>

  <h1 style="text-align: center;">Search Facility Here</h1>
	<div style="padding-left: 50px;">
		<form action="bookappointment1" method="post"
			onsubmit="return validateForm()">
			<table style="margin-left: auto; margin-right: auto;">
                    <tr>
					<td><b><label for="Doctor">Facility:</label></b></td>
					<td><select name="Doctor" id="Doctor" required>
						<option>Please select</option>
						<option value ="Physician">Physician</option>
						<option value ="Dental Facility">Dental Facility</option>
						<option value ="Ward/Indoor Facility">Ward/Indoor Facility</option>
						<option value ="Minor OT">Minor OT/</option>
						<option value ="Surgeon">Surgeon</option>
						<option value ="Physiotherapy">Physiotherapy</option>
						<option value ="Laboratory Services">Laboratory Services</option>
						<option value ="ECG Services">ECG Services</optionG ser>
						<option value ="Pharmacy">Pharmacy</option>
						<option value ="X-Ray facility">X-Ray facility</option>
						<option value ="Ambulance Services">Ambulance Services</option>
					</select></td>
				</tr>
			
			<tr>
					<td><b><label for="Locality">Locality :</label></b></td>
					<td><textarea name="locality" id ="locality" cols="20" rows="3" placeholder="Enter Locality" required></textarea></td>
				</tr>
				   

				<tr>
					<td></td>
					<td><input type="submit" value="Search" class="row" required></td>
				
			</table>
		</form>
	</div>


				

	<script>
		function validateForm() {

			//alert("Inside validate");
			var speciality = document.getElementById("speciality").value;
			if (speciality == null || speciality == "Please select") {
				alert("Please update the highlighted mandatory fields!");
				document.getElementById('speciality').style.borderColor = "red";
				return false;
			}
			
			
		}
	</script>
</body>
</html>