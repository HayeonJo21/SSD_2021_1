<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>Phantom by HTML5 UP</title>
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
				<!-- <li><a href="index.html">Home</a></li>
				<li><a href="generic.html">Ipsum veroeros</a></li>
				<li><a href="generic.html">Tempus etiam</a></li>
				<li><a href="generic.html">Consequat dolor</a></li>
				<li><a href="elements.html">Elements</a></li> -->
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



				<h1>username님</h1>





				<!-- <header>
					<h1>
						This is Phantom, a free, fully responsive site<br /> template
						designed by <a href="http://html5up.net">HTML5 UP</a>.
					</h1>
					<p>Etiam quis viverra lorem, in semper lorem. Sed nisl arcu
						euismod sit amet nisi euismod sed cursus arcu elementum ipsum arcu
						vivamus quis venenatis orci lorem ipsum et magna feugiat veroeros
						aliquam. Lorem ipsum dolor sit amet nullam dolore.</p>
				</header> -->




				<div>
					<div>
						<h3>회원정보</h3>
						<div class="table-wrapper">
							<table class="alt">
								<thead>
									<tr>
										<th>Name</th>
										<th>Description</th>

									</tr>
								</thead>
								<tbody>
									<tr>
										<td>username</td>
										<td></td>

									</tr>
									<tr>
										<td>password</td>
										<td></td>

									</tr>
									<tr>
										<td>email</td>
										<td></td>

									</tr>
									<tr>
										<td>firstName</td>
										<td></td>

									</tr>
									<tr>
										<td>lastname</td>
										<td></td>

									</tr>
									<tr>
										<td>address</td>
										<td></td>

									</tr>
									<tr>
										<td>phone</td>
										<td></td>

									</tr>
									<tr>
										<td>languagePreference</td>
										<td></td>

									</tr>
									<tr>
										<td>status</td>
										<td></td>

									</tr>
									<tr>
										<td>favoriteMall</td>
										<td></td>

									</tr>
									<tr>
										<td>carInfo</td>
										<td></td>

									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<%-- <div position="absolute" style="float: right; width: 300px;">
						<jsp:include page="message.jsp" flush="true" />
					</div> --%>
				</div>

				<div>
					<h3>참여한 공동구매 내역</h3>
					<div class="table-wrapper">
						<table class="alt">
							<thead>
								<tr>
									<th>Name</th>
									<th>Description</th>

								</tr>
							</thead>
							<tbody>
								<tr>
									<td>username</td>
									<td></td>
							</tbody>
						</table>
					</div>
				</div>
				<div>
					<h3>회원간 거래 글</h3>
					<div class="table-wrapper">
						<table class="alt">
							<thead>
								<tr>
									<th>Name</th>
									<th>Description</th>

								</tr>
							</thead>
							<tbody>
								<tr>
									<td>username</td>
									<td></td>
							</tbody>
						</table>
					</div>
				</div>
				<div>
					<h3>참여한 경매 내역</h3>
					<div class="table-wrapper">
						<table class="alt">
							<thead>
								<tr>
									<th>Name</th>
									<th>Description</th>

								</tr>
							</thead>
							<tbody>
								<tr>
									<td>username</td>
									<td></td>
							</tbody>
						</table>
					</div>
				</div>








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
						<li><a href="#" class="icon brands style2 fa-twitter"><span
								class="label">Twitter</span></a></li>
						<li><a href="#" class="icon brands style2 fa-facebook-f"><span
								class="label">Facebook</span></a></li>
						<li><a href="#" class="icon brands style2 fa-instagram"><span
								class="label">Instagram</span></a></li>
						<li><a href="#" class="icon brands style2 fa-dribbble"><span
								class="label">Dribbble</span></a></li>
						<li><a href="#" class="icon brands style2 fa-github"><span
								class="label">GitHub</span></a></li>
						<li><a href="#" class="icon brands style2 fa-500px"><span
								class="label">500px</span></a></li>
						<li><a href="#" class="icon solid style2 fa-phone"><span
								class="label">Phone</span></a></li>
						<li><a href="#" class="icon solid style2 fa-envelope"><span
								class="label">Email</span></a></li>
					</ul>
				</section>
				<ul class="copyright">
					<li>&copy; Untitled. All rights reserved</li>
					<li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
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