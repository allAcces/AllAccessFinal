<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Enquiry Form</title>
<c:url value="/css/Styling.css" var="jstlCss" />
<c:url
	value="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	var="jstlBootstrapCss" />
<c:url value="bootstrap/css/bootstrap.min.css" var="jstlBootstrap" />
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
		<form action="enquirysaveurl" method="post" class="form-container">
			<h1>Enquiry Form</h1>
			<table border="0.5" align="center">
				<tr>
					<td class="label" style="color: black">Name:</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td class="label" style="color: black">Email:</td>
					<td><input type="text" name="emailAddress" /></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td class="label" style="color: black">Enquiry Type:</td>
					<td><select id="pickup_place" name="enquiryType">
							<option value="" selected="selected">Select Enquiry type</option>
							<option value="website">Our Website</option>
							<option value="product">Product</option>
					</select></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td class="label" style="color: black">Enquiry Message:</td>
					<td><input type="text" name="enquiryMsg" /></td>
				</tr>
				<tr>
					<td></td>
				<tr>
					<td class="label" style="color: black">Enquiry Date:</td>
					<td><input type="date" name="enquiryMsgDate" /></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td><input type="submit" name="Submit" value="Submit" /></td>
				</tr>
			</table>
			<h1>${EnquiryInsertSuccessMsg}</h1>
		</form>
	</div>
</body>
</html>