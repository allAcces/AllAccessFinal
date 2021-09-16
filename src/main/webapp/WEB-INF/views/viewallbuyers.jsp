<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buyers List</title>
<link href="css/businessuser.css" rel="stylesheet" type="text/css" />
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script src="js/jquery-1.12.0.min.js" type="text/javascript"></script>
<script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/libs/jquery-cycle/jquery.cycle.all.js"
	type="text/javascript"></script>
<script src="js/libs/jquery-easing/jquery.easing.min.js"
	type="text/javascript"></script>
<script src="js/jquery.scrollbox.js" type="text/javascript"></script>
<link href="css/index.css" rel="stylesheet" type="text/css" />
<link href="font-awesome-icons/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<link href="css/admin.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="container">
		<div class="row">
			<%@include file="admin/modifiedheader.jsp"%>
			<div class="col-lg-9 col-md-9 col-sm-9 top3">
			<h1 class="text-center">Buyers List</h1>
<table border="1">
<th>Name</th>
<th>UserName</th>
<th>Gender</th>
<th>Email Address</th>
<th>Contact Number</th>
</tr>
<c:forEach items="${buyerListKey}" var="buyers" >
<tr>
<td>${buyers.userFullName}</td>
<td>${buyers.usersName }</td>
<td>${buyers.userGender }</td>
<td>${buyers.usersEmailAddress}</td>
<td>${buyers.userContactNumber}</td>
</tr>
</c:forEach>

</table>
<td><a href="/admin">Back to Home</a></td>

<%@include file="admin/footer.jsp"%>
</body>
</html>