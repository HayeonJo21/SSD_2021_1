<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Generic - Phantom by HTML5 UP</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<script>
function userCreate() {
	if (form.username.value == "") {
		alert("����� �̸��� �Է��Ͻʽÿ�.");
		form.username.focus();
		return false;
	} 
	if (form.password1.value == "") {
		alert("��й�ȣ�� �Է��Ͻʽÿ�.");
		form.user_password.focus();
		return false;
	}
	if (form.password1.value != form.password2.value) {
		alert("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		form.password2.focus();
		return false;
	}
	if (form.fistName.value == "") {
		alert("�̸��� �Է��Ͻʽÿ�.");
		form.firstName.focus();
		return false;
	}
	if (form.lastName.value == "") {
		alert("�̸��� �Է��Ͻʽÿ�.");
		form.lastName.focus();
		return false;
	}
	if (form.address.value == "") {
		alert("�ּҸ� �Է��Ͻʽÿ�.");
		form.address.focus();
		return false;
	}
	if (form.phone.value == "") {
		alert("��ȭ��ȣ�� �Է��Ͻʽÿ�.");
		form.phone.focus();
		return false;
	}
	var emailExp = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/;
	if(emailExp.test(form.email.value)==false) {
		alert("�̸��� ������ �ùٸ��� �ʽ��ϴ�.");
		form.email.focus();
		return false;
	}
	var phoneExp = /^\d{2,3}-\d{3,4}-\d{4}$/;
	if(phoneExp.test(form.phone.value)==false) {
		alert("��ȭ��ȣ ������ �ùٸ��� �ʽ��ϴ�.");
		form.phone.focus();
		return false;
	}
	
	form.submit();
}
	</script>
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
				<li><a href="coPurchasing.jsp">CoPurchasing</a></li>
				<li><a href="login.jsp">Login</a></li>
				<li><a href="register.jsp">Register</a></li>
			</ul>
		</nav>

		<!-- Main -->
		<div id="main">
			<div class="inner">
				<h1>Register Page</h1>
				<div class="col-sm-6 col-md-offset-3">
					<form role="form">
						<div class="form-group">
							<label for="username" style="font-size: 24px">UserName</label>
							<input type="text" style="width: 800px" class="form-control"
								name="username" placeholder="�̸��� �Է��� �ּ���.">
						</div>
						<div class="form-group">
							<label for="password1" style="font-size: 24px">Password</label>
							<input type="password" style="width: 800px" class="form-control"
								name="password1" placeholder="��й�ȣ�� �Է��� �ּ���.">
						</div>
						<div class="form-group">
							<label for="password2" style="font-size: 24px">Password Check</label>
							<input type="password" style="width: 800px" class="form-control"
								name="password2" placeholder="��й�ȣ�� �Է��� �ּ���.">
						</div>
						<div class="form-group row">
							<label for="fistName" class="col-lg-2 col-form-label" style="font-size: 24px">FirstName</label>
							<div class="col-lg-10">
								<input type="text" name="firstname" class="form-control"
									placeholder="�浿">
							</div>
							<label for="lastName" class="col-lg-2 col-form-label" style="font-size: 24px">LastName</label>
							<div class="col-lg-10">
								<input type="text" name="lastName" class="form-control"
									placeholder="ȫ">
							</div>
						</div>
						<div class="form-group">
							<label for="email" style="font-size: 24px">Email</label>
							<input type="text" style="width: 800px" class="form-control"
								name="email" placeholder="kildongHong@naver.com">
						</div>
						<div class="form-group">
							<label for="address" style="font-size: 24px">Address</label>
							<input type="text" style="width: 800px" class="form-control"
								name="address" placeholder="�ּҸ� �Է��� �ּ���.">
						</div>
						<div class="form-group">
							<label for="phone" style="font-size: 24px">PhoneNumber</label> <input
								type="text" style="width: 800px" class="form-control"
								name="phone" placeholder="010-0000-0000">
						</div>
						<div class="form-group">
							<label for="favoriteMall" style="font-size: 24px">FavoriteMall</label>
							<input type="text" style="width: 800px" class="form-control"
								name="favoriteMall" placeholder="��ȣ�ϴ� ������ �Է��ϼ���.">
						</div>
						<div class="form-group">
							<label for="languagePrefernce" style="font-size: 24px">LanguagePreference</label>
							<input type="text" style="width: 800px" class="form-control"
								name="languagePrefernce" placeholder="Korean">
						</div>
						<div class="form-group">
							<label for="carInfo" style="font-size: 24px">CarInfo</label>
							<input type="text" style="width: 800px" class="form-control"
								name="carInfo" placeholder="������ ������ ������ �Է��ϼ���.">
								<p><p><p><p>
						</div>
						<div class="col-6 col-12-small">
							<label style="font-size: 24px">Agree to Terms</label>
							<input type="checkbox" id="demo-human" name="demo-human">
							<label for="demo-human">����� ���� �մϴ�.</label>
							<p><p><p><p>
							
						</div>
						<div class="form-group text-center">
							<button type="submit" id="join-submit" class="button primary" onClick="userCreate();return false;">
								ȸ������<i class="fa fa-check spaceLeft"></i>
							</button>
							<button type="submit" class="btn btn-warning">
								�������<i class="fa fa-times spaceLeft"></i>
							</button>
						</div>
					</form>
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

</body>
</html>