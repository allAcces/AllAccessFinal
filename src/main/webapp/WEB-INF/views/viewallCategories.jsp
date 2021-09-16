<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category List</title>
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
			<%@include file="selleruser/header.jsp"%>
			<div class="col-lg-9 col-md-9 col-sm-9 top3">
				<div class="categorieslist">
					<h1 class="text-center">Category List</h1>
					<table border="1">
						<th>Category Name</th>
						</tr>
						<c:forEach items="${categoryListKey}" var="category">
							<tr>
								<td>${category.categoryName}</td>
							</tr>
						</c:forEach>

					</table>
				</div>
			</div>
			<%@include file="selleruser/footer.jsp"%>
		</div>
	</div>
	<td><a href="/admin">Back to Home</a></td>
</body>
</html>