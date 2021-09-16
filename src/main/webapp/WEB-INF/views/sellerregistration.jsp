<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Seller Registeration</title>
<c:url value="/css/Styling.css" var="jstlCss" />
<c:url value="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	var="jstlBootstrapCss"/>
<c:url value="bootstrap/css/bootstrap.min.css" var="jstlBootstrap"/>
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
		<form action="sellersaveurl" method="post"class="form-container">
		<h1 style="color:#D2691E">Seller Registeration</h1>
			<table border="0.5" align="center">
				<tr>
					<td class="label" style="color:black">Shop Id</td>
					<td><input type="number" name="shopid" /></td>
				</tr> 
				<tr>
					<td class="label" style="color:black">Owner Name</td>
					<td><input type="text" name="shopowner_name" /></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				
				
				<tr>
					<td class="label" style="color:black">Email</td>
					<td><input type="text" name="shopowner_email" /></td>
				</tr>
				<tr>
					<td class="label" style="color:black">Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				
				<tr>
					<td class="label" style="color:black">Pin Code</td>
					<td><input type="number" name="shop_address_pincode" /></td>
				</tr> 
				
			<tr>
					<td></td>
				</tr>
				<tr>
					<td class="label" style="color:black">Contact Number</td>
					<td><input type="text" name="shop_address_contact_number" /></td>
				</tr>
				
				<tr>
					<td></td>
				</tr>
				<tr>
					<td class="label" style="color:black">Shop Email Address</td>
					<td><input type="text" name="shop_address_email" /></td>
				</tr>
				
				<tr>
					<td></td>
				</tr>
				<tr>
					<td class="label" style="color:black">Shop Name</td>
					<td><input type="text" name="shop_name" /></td>
				</tr>
				
				
				<tr>
					<td></td>
				</tr>
				<tr>
					<td class="label" style="color:black">Shop Timings</td>
					<td><input type="text" name="shop_timings" /></td>
				</tr>
			
				
				<tr>
					<td></td>
				</tr>
				<tr>
					<td class="label" style="color:black">Website</td>
					<td><input type="text" name="shop_website" /></td>
				</tr>
				
				
				<tr align="right">
					<td><a href="/sellerlogin">Already Registered? Login Here</a></td>
				</tr>
				<tr>
					<td></td>
					<td><input class="btn" type="submit" name="Sign In" value="Register" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>