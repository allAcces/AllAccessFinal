<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products List</title>
<c:url value="/css/businessuser.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" type="text/css" />
<c:url value="/css/admin.css" var="jstlAdminCss" />
<link href="${jstlAdminCss}" rel="stylesheet" type="text/css" />
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
</head>
<body>
<div class="container">
		<div class="row">
			<%@include file="buyeruser/header.jsp"%>
			<div class="col-lg-9 col-md-9 col-sm-9 top3">
			<h1 class="text-center">Products List</h1>
<table border="1">
<th>Product Id</th>
<th>Product Title</th>
<th>Price</th>
<th>Product Manufacturing Date</th>
<th>VAT</th>
<th>Discount</th>
<th>Stock</th>
</tr>
<c:forEach items="${productsListKey}" var="products" >
<tr>
<td>${products.productId}</td>
<td>${products.productTitle }</td>
<td>${products.price}</td>
<td>${products.productManufacturingDate}</td>
<td>${products.vat}</td>
<td>${products.discount}</td>
<td>${products.stock}</td>
</tr>
</c:forEach>

</table>
<td><a href="/admin">Back to Home</a></td>

<%@include file="buyeruser/footer.jsp"%>
</div>
</body>
</html>