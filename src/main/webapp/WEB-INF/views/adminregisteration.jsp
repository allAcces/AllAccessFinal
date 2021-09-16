<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Registeration</title>
<c:url value="/css/Styling.css" var="jstlCss" />
<c:url
	value="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	var="jstlBootstrapCss" />
<c:url value="bootstrap/css/bootstrap.min.css" var="jstlBootstrap"></c:url>
<c:url value="/javascript/loginvalidation.js" var="jstrlJs" />
<link rel="stylesheet" href="${jstlCss}" type="text/css" />
<link href="${jstlBootstrap}" rel="stylesheet" type="text/css" />
<link href="${jstlBootstrapCss}" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${jstrlJs}"></script>
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
		<form action="adminsaveurl" method="post" class="form-container">
			<h1 style="color: #D2691E">Admin Registeration</h1>
			<table border="0.5" align="center">
				<!-- <tr>
					<td>Id</td>
					<td><input type="number" name="adminId" /></td>
				</tr> -->
				<tr>
					<td><label style="color: black" for="emailAddress"><b>Email</b></label></td>
					<td><input type="text" name="emailAddress" /></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td><label style="color: black" for="password"><b>Password</b></label></td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr align="right">
					<td><a href="/adminlogin">Already Registered? Login Here</a></td>
				</tr>
				<tr>
					<td></td>
					<td><input class="btn" type="submit" name="Sign In"
						value="Register" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>