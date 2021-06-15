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
				<h1>출발지: 광명 이케아(IKEA)</h1>
				<h2>게시자: username</h2>
				<h2>남은시간: (endDate - 현재 시간) <a href="index.jsp" class="button primary">낙찰</a></h2>
				<span class="image main"><img src="images/pic1.png" alt="" /></span>
				<h3>시작가: 20,000 (KRW)</h3>
				<h3>입찰단위: 500 (KRW)</h3>
				<br />
				<h3>입찰 현황</h3>
				<div class="table-wrapper">
					<table class="alt">
						<thead>
							<tr>
								<th>번호</th>
								<th>Username</th>
								<th>입찰일시</th>
								<th>입찰금액</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1</td>
								<td>somsom</td>
								<td>2021-03-20</td>
								<td>21,000원</td>
							</tr>
							<tr>
								<td>2</td>
								<td>test1</td>
								<td>2021-03-20</td>
								<td>21,500원</td>
							</tr>
							<tr>
								<td>3</td>
								<td>imuser</td>
								<td>2021-03-21</td>
								<td>22,500원</td>
							</tr>
							<tr>
								<td>4</td>
								<td>imcustomer</td>
								<td>2021-03-21</td>
								<td>23,500원</td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="col-6 col-12-medium">
					<h3>경매 정보</h3>
					<ul>
						<li>출발지: 광명 이케아(IKEA)</li>
						<li>도착지: 경기도 의정부시 민락2지구 00플라자 1층</li>
						<li>규격: 1.4 x 1.0 x 0.89m, 약 9kg</li>
					</ul>
				</div>
			</div>
		</div>
		
<%@ include file="IncludeBottom.jsp"%>