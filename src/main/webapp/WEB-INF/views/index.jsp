<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Welcome Page</title>
<head>

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
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 top-menu">

				<ul class="pull-right">

					<li><a href="${contextPath}/adminlogin"><i
							class="fa fa-sign-in fa-lg"></i>Admin Login</a></li>
					<li><a href="${contextPath}/buyerregistration"><i
							class="fa fa-sign-in fa-lg"></i> Buyer Registration</a></li>
					<li><a href="${contextPath}/sellerregistration"><i
							class="fa fa-sign-in fa-lg"></i>Seller Registration</a></li>
				</ul>
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 top-menu">
				<h3>
					<img src="images/logo2.png" alt="" img-responsive /> All Access
				</h3>

			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 top-menu1">

				<h4 align="center">Welcome To All Access....</h4>

			</div>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-12 col-md--12 col-sm-12 top-menu2">
					<ul>
						<li><a href="#">Home</a></li>
					</ul>
					<ul>
						<li><a href="# ">About US</a></li>
					</ul>
					<ul>
						<li><a href="# ">Live Enquiry</a></li>
					</ul>
					<ul>
						<li><a href="# ">Contact US</a></li>
					</ul>
					<ul>
						<li><a href="# ">Help</a></li>
					</ul>
					<ul>
						<li><a href="#" data-toggle="modal" data-target="#myModal11">Feedback</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-9 col-md-9 col-sm-9 top3" id="slider">
					<img src="images/a.jpg" alt="" class="img-responsive" /> <img
						src="images/b.jpg" alt="" class="img-responsive" /> <img
						src="images/c.jpg" alt="" class="img-responsive" /><img
						src="images/pic5.jpg" alt="" class="img-responsive" />
				</div>
				<script>
					$(document).ready(function() {
						$("#slider").cycle();
					});
				</script>
			</div>
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 top-menu5">
					<h3>© Copyright 2021. All Rights Reserved. Created By Kirti ,
						Akansha , Shubhi And Utsav</h3>
					<h5></h5>
				</div>
			</div>
		</div>
</body>
</html>