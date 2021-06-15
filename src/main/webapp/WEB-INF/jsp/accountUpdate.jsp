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
<title>용달의 민족 - 경매상세</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet" href="assets/css/main.css" />
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
				<a href="mainpage.jsp" class="logo"> <span class="symbol"><img
						src="images/logoicon.svg" alt="" /></span><span class="title">용달의
						민족</span>
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
				<li><a href="index2.jsp">홈</a></li>
				<li><a href="generic.html">로그인 / 마이페이지</a></li>
				<li><a href="ticketshop.jsp">중고 거래</a></li>
				<li><a href="generic.html">용달 서비스 경매</a></li>
				<li><a href="elements.html">용달 공동 이용</a></li>
			</ul>
		</nav>
		
		<!-- Main -->
		<div id="main">
			<div class="inner">
				<h1>Update Info</h1> 
				<div class="col-sm-6 col-md-offset-3">
					<form action="/user/mypage.do" method="post"> 
						<div class="form-group">
							<label for="account.username" style="font-size: 24px">Username</label>
							<input
								type="text" style="width: 800px" class="form-control" name="username" value="${userSession.username}">
						</div>
						<div class="form-group row">
							<label for="firstName" class="col-lg-2 col-form-label"
								style="font-size: 24px">FirstName</label>
							<div class="col-lg-10">
								&nbsp;<input type="text" name="firstName" value="${userSession.firstName}" class="form-control"
									placeholder="길동">
							</div>
							<label for="lastName" class="col-lg-2 col-form-label"
								style="font-size: 24px">LastName</label>
							<div class="col-lg-10">
								&nbsp;<input type="text" name="lastName" value="${userSession.lastName}" class="form-control"
									placeholder="홍">
							</div>
						</div>
						<div class="form-group">
							<label for="email" style="font-size: 24px">Email</label>
							<input
								type="text" style="width: 800px" class="form-control" name="email" value="${userSession.email}" 
								placeholder="kildongHong@naver.com">
						</div>
						<div class="form-group">
							<label for="address" style="font-size: 24px">Address</label>
							<input type="text" style="width: 800px" class="form-control" name="address" value="${userSession.address}" >
		
							<!-- 도로명주소 api 활용 -->
							<input type="text" id="sample2_postcode" placeholder="우편번호">
							<input type="button" class="button small"
								onclick="sample2_execDaumPostcode()" value="우편번호 찾기"> <br>
							<input type="text" id="sample2_address" placeholder="주소"> <br>
							<input type="text" id="sample2_detailAddress" placeholder="상세주소">
							<input type="text" id="sample2_extraAddress" placeholder="참고항목">
		
							<!-- iOS에서는 position:fixed 버그가 있음, 적용하는 사이트에 맞게 position:absolute 등을 이용하여 top,left값 조정 필요 -->
							<div id="layer"
								style="display: none; position: fixed; overflow: hidden; z-index: 1; -webkit-overflow-scrolling: touch;">
								<img src="//t1.daumcdn.net/postcode/resource/images/close.png"
									id="btnCloseLayer"
									style="cursor: pointer; position: absolute; right: -3px; top: -3px; z-index: 1"
									onclick="closeDaumPostcode()" alt="닫기 버튼">
							</div>
						</div>
						<div class="form-group">
							<label for="phone" style="font-size: 24px">Phone Number</label> <input
								type="text" style="width: 800px" class="form-control" name="phone" value="${userSession.phone}" 
								placeholder="010-0000-0000">
						</div>
						<div class="form-group">
							<label for="favoriteUser" style="font-size: 24px">Favorite
								User</label> <input type="text" style="width: 800px" class="form-control"
								name="favoriteUser" value="${userSession.favoriteUser}" placeholder="선호하는 매장을 입력하세요.">
						</div>
						<div class="form-group">
							<label for="languagePrefernce" style="font-size: 24px">Language
								Setting</label> <input type="text" style="width: 800px"
								class="form-control" name="languagePreference" value="${userSession.languagePreference}" 
								placeholder="Korean">
						</div>
						<div class="form-group">
							<label for="carInfo" style="font-size: 24px">Car
								Information</label> <input type="text" style="width: 800px"
								class="form-control" name="carInfo" value="${userSession.carInfo}" 
								placeholder="소유한 차량의 정보를 입력하세요."> <br> <br>
						</div>
						<div class="form-group" style="text-align:center">
							<button type="submit" id="join-submit" class="button primary">
								정보수정<i class="fa fa-check spaceLeft"></i>
							</button>
							<a class="button" href="/user/mypage.do">수정취소<i class="fa fa-times spaceLeft"></i></a>
								
						</div>
					</form>
				</div>
			</div>
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