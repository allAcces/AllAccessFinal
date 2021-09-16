<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Seller List</title>
<c:url value="/css/businessuser.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" type="text/css" />
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
			<h1 class="text-center">Seller and Shop List</h1>
<table border="1">
<th>Shop Id</th>
<th>Owner Name</th>
<th>Owner Email Address</th>
<th>Shop Name</th>
<th>Shop Contact Number</th>
<th>Shop Address Pin Code</th>
<th>Shop Email</th>
<th>Shop Website</th>
<th>Shop Timings</th>
</tr>
<c:forEach items="${sellerListKey}" var="sellers" >
<tr>
<td>${sellers.shopid}</td>
<td>${sellers.shopowner_name }</td>
<td>${sellers.shopowner_email }</td>
<td>${sellers.shop_name}</td>
<td>${sellers.shop_address_contact_number}</td>
<td>${sellers.shop_address_pincode}</td>
<td>${sellers.shop_address_email}</td>
<td>${sellers.shop_website}</td>
<td>${sellers.shop_timings}</td>
</tr>
</c:forEach>

</table>
<td><a href="/admin">Back to Home</a></td>

<%@include file="admin/footer.jsp"%>
</div>
</body>
</html>