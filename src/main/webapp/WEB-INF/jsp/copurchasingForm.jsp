<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>공동구매 등록</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<noscript>
	<link rel="stylesheet" href="assets/css/noscript.css" />
</noscript>
</head>
<body class="is-preload">
	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header">
			<div class="inner">

				<!-- Logo -->
				<a href="index.html" class="logo"> <span class="symbol"><img
						src="images/logo.svg" alt="" /></span><span class="title">Phantom</span>
				</a>

				<!-- Nav -->
				<nav>
					<ul>
						<li><a href="#menu">Menu</a></li>
					</ul>
				</nav>

			</div>
		</header>

		<!-- Menu -->
		<nav id="menu">
			<h2>Menu</h2>
			<ul>
				<li><a href="mypage.jsp">마이페이지</a></li>
				<li><a href="message.jsp">DM</a></li>
				<li><a href="auction_form.jsp">경매 </a></li>
				<li><a href="copurchasing_form.jsp">공동구매</a></li>
				<li><a href="p2p_form.jsp">회원간 거래</a></li>
			</ul>
		</nav>

		<!-- Main -->
		<div id="main">
			<div class="inner">

				<h2>공동구매 글 작성</h2>
				<form method="post" action="#">
					<div class="row gtr-uniform">
						<div class="col-12">
							<label for="demo-name">공동구매 모집자 이름</label> <input type="text"
								name="demo-name" id="demo-name" value="" placeholder="username"
								disabled />
						</div>
						<div class="col-12">
							<input type="text" name="unitCost" id="unitCost" value=""
								placeholder="unitCost" />
						</div>
						<div class="col-12">
							<input type="text" name="price" id="price" value=""
								placeholder="price" />
						</div>
						<div class="col-12">
							<input type="text" name="maxNumberOfPurchaser" id="maxNumberOfPurchaser" value=""
								placeholder="maxNumberOfPurchaser" />
						</div>

						<div class="col-12">
							<ul class="actions">
								<li><input type="submit" value="Submit"
									class="primary" /></li>
								<li><input type="reset" value="Reset" /></li>
							</ul>
						</div>
					</div>
				</form>

			</div>

		</div>

		<!-- Scripts -->
		<script src="assets/js/jquery.min.js"></script>
		<script src="assets/js/browser.min.js"></script>
		<script src="assets/js/breakpoints.min.js"></script>
		<script src="assets/js/util.js"></script>
		<script src="assets/js/main.js"></script>

		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
			integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
			crossorigin="anonymous"></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
			integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
			crossorigin="anonymous"></script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
			integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
			crossorigin="anonymous"></script>
</body>
</html>