<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--
	Phantom by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<!DOCTYPE HTML>
<html>
	<head>
		<title>Generic - Phantom by HTML5 UP</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" href="assets/css/main.css" />
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
	</head>
	<body class="is-preload">
		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header">
						<div class="inner">

							<!-- Logo -->
								<a href="index.html" class="logo">
									<span class="symbol"><img src="images/logo.svg" alt="" /></span><span class="title">Phantom</span>
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
							<li><a href="coPurchasing.jsp">CoPurchasing</a></li>
							<li><a href="login.jsp">Login</a></li>
							<li><a href="register.jsp">Register</a></li>
						</ul>
					</nav>

				<!-- Main -->
					<div id="main">
						<div class="inner">
							<h1>CoPurchasing</h1>
							<span class="image main"><img src="images/ikea.jpg" alt="" /></span>
							<section>
								<h1 style="font-size: 40px">공동구매 상세내역</h1>
								<!--  <h2>공동구매 ID : ${coPurchasingLineItem.coPurchasingId}</h2> -->
								<h1 style="font-size: 30px">공동구매 ID : IK330</h1>
								<div class="table-wrapper">
									<table>
										<thead>
											<tr>
												<th>Item</th>
												<th>Description</th>
												<th>note</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>ServiceDate</td>
												<td>21.04.16</td>
												<td></td>
											</tr>
											<tr>
												<td>Poster</td>
												<td>광명Love</td>
												<td></td>
											</tr>
											<tr>
												<td>Destination</td>
												<td>광명동</td>
												<td>수궁동 부근까지 가능</td>
											</tr>
											<tr>
												<td>Price</td>
												<td>56000원</td>
												<td>인당 14000원</td>
											</tr>
											<tr>
												<td>MaxNumberOfPurchaser</td>
												<td>4명</td>
												<td></td>
											</tr>
											<tr>
												<td>Width</td>
												<td>2m</td>
												<td></td>
											</tr>
											<tr>
												<td>Height</td>
												<td>1.2m</td>
												<td></td>
											</tr>
											<tr>
												<td>Weight</td>
												<td>50kg</td>
												<td></td>
											</tr>
											<tr>
												<td>Loadage</td>
												<td>10개</td>
												<td>인당 3개 이하</td>
											</tr>
										</tbody>
									</table>
								</div>
								<br>
								<!-- percentage bar -->
								<h1 style="font-size:30px">Progress of CoPurchasing</h1>
								<p>공동구매 진행상황을 보여줍니다.</p>
								<div class="progress">
									<div class="progress-bar progress-bar-warning progress-bar-striped active" role="progressbar" 
									aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width:75%">
								      75%
								    </div>
								</div>
								<br><br>
								<!-- 참여자 정보 -->
								<h1 style="font-size: 30px">참여자 정보</h1>
									<div class="table-wrapper">
										<table class="alt">
											<thead>
												<tr>
													<th>UserName</th>
													<th>Address</th>
													<th>Loadage</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>choi03</td>
													<td>수궁동</td>
													<td>2개</td>
												</tr>
												<tr>
													<td>skyPark</td>
													<td>광명1동</td>
													<td>1개</td>
												</tr>
												<tr>
													<td>rud99</td>
													<td> 광명7동</td>
													<td>3개</td>
												</tr>
											</tbody>
										</table>
									</div>
							</section>
						</div>
					</div>
				<!-- Footer -->
					<footer id="footer">
						<div class="inner">
							<section>
								<h2>Get in touch</h2>
								<form method="post" action="#">
									<div class="fields">
										<div class="field half">
											<input type="text" name="name" id="name" placeholder="Name" />
										</div>
										<div class="field half">
											<input type="email" name="email" id="email" placeholder="Email" />
										</div>
										<div class="field">
											<textarea name="message" id="message" placeholder="Message"></textarea>
										</div>
									</div>
									<ul class="actions">
										<li><input type="submit" value="Send" class="primary" /></li>
									</ul>
								</form>
							</section>
							<section>
								<h2>Follow</h2>
								<ul class="icons">
									<li><a href="#" class="icon brands style2 fa-twitter"><span class="label">Twitter</span></a></li>
									<li><a href="#" class="icon brands style2 fa-facebook-f"><span class="label">Facebook</span></a></li>
									<li><a href="#" class="icon brands style2 fa-instagram"><span class="label">Instagram</span></a></li>
									<li><a href="#" class="icon brands style2 fa-dribbble"><span class="label">Dribbble</span></a></li>
									<li><a href="#" class="icon brands style2 fa-github"><span class="label">GitHub</span></a></li>
									<li><a href="#" class="icon brands style2 fa-500px"><span class="label">500px</span></a></li>
									<li><a href="#" class="icon solid style2 fa-phone"><span class="label">Phone</span></a></li>
									<li><a href="#" class="icon solid style2 fa-envelope"><span class="label">Email</span></a></li>
								</ul>
							</section>
							<ul class="copyright">
								<li>&copy; Untitled. All rights reserved</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
							</ul>
						</div>
					</footer>

			</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>