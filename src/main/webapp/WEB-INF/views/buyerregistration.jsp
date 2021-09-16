<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buyer Registration Form</title>
<c:url value="/css/Styling.css" var="jstlCss" />
<c:url value="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	var="jstlBootstrapCss"/>
<c:url value="/javascript/userregisterationformvalidation.js" var="jstlformvalidation"/>
<c:url value="bootstrap/css/bootstrap.min.css" var="jstlBootstrap"/>
<link rel="stylesheet" href="${jstlCss}" type="text/css" />
<link href="${jstlBootstrap}" rel="stylesheet" type="text/css" />
<link href="${jstlBootstrapCss}" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${jstlformvalidation}"></script>
</head>
<body>
	<div class="bg-img">
		<div class="menu-bar">
			<ul>
				<li class="active"><a href='#'><i class="fa fa-home"></i>Home</a></li>
				<li><a href='#'><i class="fa fa-user"></i>About</a>
					<div class="sub-menu-about">
						<ul>
							<li><a href='#'><i class="fas fa-browser"></i> About
									Website</a></li>
							<li><a href='#'><i class="fas fa-user-friends"></i>About
									Team</a></li>
						</ul>
					</div></li>
				<li><a href='#'><i class="bi bi-info-circle"></i>Help</a></li>
				<li><a href='#'><i class="fa fa-phone"></i>Contact Us</a></li>
			</ul>
		</div>
		<h2>All Access</h2>
		<form action="usersaveurl" method="post"class="form-container">
		<h1 style="color:#D2691E">Buyer Registration Form</h1>
			<table border="0.5" align="center">
				<tr>
					<td><label style="color:black" for="userFullName"><b>Full Name</b></label></td>
					<td><input type="text" name="userFullName"
						placeholder="Enter your full name" title="Enter full name"
						required /></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td><label style="color:black" for="usersName"><b>UserName</b></label></td>
					<td><input type="text" name="usersName"
						placeholder="Enter your user name" title="Enter user name"
						required /></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="radio" name="userGender" value="Male" required><label style="color:black"><b>Male</b></label></td><br>
					<td><input type="radio" name="userGender" value="Female" required><label style="color:black"><b>Female</b></label></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td><label style="color:black" for="userContactNumber"><b>MobileNo</b></label></td>
					<td><input type="text" name="userContactNumber"
						placeholder="Enter your Contact Number"
						title="Enter Contact Number" required /></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td><label style="color:black" for="usersEmailAddress"><b>EmailId</b></label></td>
					<td><input type="text" name="usersEmailAddress"
						placeholder="Enter your Email Address" title="Enter Email Address"
						required /></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td><label style="color:black" for="usersPassword"><b>Password</b></label></td>
					<td><input type="password" name="usersPassword"
						placeholder="Enter your Password" title="Enter password" required /></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td><input class="btn" type="submit" name="Submit" value="Submit" /> <input
						type="submit" name="Reset" value="Reset" /></td>
				</tr>
			</table>
			<a href="/buyerlogin">Already Registered? Login Here</a>
		</form>
	</div>
</body>
</html>