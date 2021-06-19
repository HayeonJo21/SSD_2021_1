<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--
	Phantom by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<!DOCTYPE HTML>
<html>
<head>
<title>용달의 민족 - 관리자</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet" href="/assets/css/main.css" />
<noscript>
	<link rel="stylesheet" href="/assets/css/noscript.css" />
</noscript>
</head>
<body class="p-3 mb-2 bg-dark text-white">
	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header">
			<div class="inner">

				<!-- Logo -->
				<a href="/admin/main.do" class="logo"> <span class="symbol"><img
						src="/images/logoicon.svg" alt="" /></span><span class="title">용달의
						민족 관리자 페이지</span>
				</a>
			</div>
		</header>
		<!-- Main -->
		<div id="main">
			<div class="inner">
				<header>
					<h1>
						용달의 민족 <br /> Administrator Page <br />
					</h1>
					<p>관리자 경매 관리 페이지 입니다.</p>
				</header>
				<br />
				<div class="inner">
					<h3>* 경매 관리</h3>
				</div>
				<br />
				<div class="table-wrapper">
					<table class="alt">
						<thead>
							<tr>
								<th>Auction ID</th>
								<th>Delivery ID</th>
								<th>Service Provider</th>
								<th>Service Date</th>
								<th>Show Detail</th>
								<th>Remove</th>

							</tr>
						</thead>
						<tbody>
							<c:forEach var="ac" items="${ACList}">
								<tr>
									<td>
									<c:if test="${ac.successfulBidder ne null}">
									<b style="color:red">종료된 경매, <br/> 삭제 요망</b><br/>
									</c:if>
									${ac.auctionId}</td>
									<td>
									<c:if test="${ac.flag ne 1}">
									<b style="color:red">존재하지 않는 용달 서비스 이용, <br/> 삭제 요망</b><br/>
									</c:if>
									${ac.delivery }</td>
									<td>${ac.username }</td>
									<td>${ac.serviceDate}</td>
									<td><a
										href="<c:url value='/auction/view.do'>
						   <c:param name='acId' value='${ac.auctionId}'/>
				 		 </c:url>"
										class="button">&nbsp;&nbsp;&nbsp;&nbsp;Detail&nbsp;&nbsp;&nbsp;&nbsp;</a></td>
									<td><a
										href="<c:url value='/admin/auction/delete.do'>
						   <c:param name='auctionId' value='${ac.auctionId}'/>
				 		 </c:url>"
										class="button">&nbsp;&nbsp;&nbsp;&nbsp;Remove&nbsp;&nbsp;&nbsp;&nbsp;</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
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