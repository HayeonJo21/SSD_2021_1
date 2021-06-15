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
<title>용달의 민족</title>
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
<body class="is-preload">
	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header">
			<div class="inner">

				<!-- Logo -->
				<a href="/" class="logo"> <span class="symbol"><img
						src="/images/logoicon.svg" alt="" /></span><span class="title">용달의
						민족</span>
				</a>
				<!-- Nav -->
				<nav>
					<ul>
						<li><a href="#menu">Menu</a></li>
					</ul>
				</nav>

			</div>
			<script>
	$(function() {
		$("#datepicker1").datepicker(
				{
					dateFormat : 'yy/mm/dd',
					prevText : '이전 달',
					nextText : '다음 달',
					monthNames : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월',
							'8월', '9월', '10월', '11월', '12월' ],
					monthNamesShort : [ '1월', '2월', '3월', '4월', '5월', '6월',
							'7월', '8월', '9월', '10월', '11월', '12월' ],
					dayNames : [ '일', '월', '화', '수', '목', '금', '토' ],
					dayNamesShort : [ '일', '월', '화', '수', '목', '금', '토' ],
					dayNamesMin : [ '일', '월', '화', '수', '목', '금', '토' ],
					showMonthAfterYear : true,
					changeMonth : true,
					changeYear : true,
					yearSuffix : '년'
				});
	});
</script>
		</header>

		<!-- Menu -->
		<nav id="menu">
			<h2>Menu</h2>
			<ul>
				<li><a href="/">메인</a></li>
				<c:choose>
					<c:when test="${userSession.username ne null}">
						<li><a href="/delivery/signoff.do">${userSession.username} 로그아웃
						</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="/delivery/signon.do">로그인</a></li>
						<li><a href="/delivery/insertAccount.do">회원가입</a></li>
					</c:otherwise>
				</c:choose>
				
				<li><a href="/delivery/auctionView.do">경매 </a></li>
				<li><a href="/delivery/copurchasingView.do">공동구매</a></li>
				<li><a href="/delivery/fleamarketView.do">중고거래</a></li>
				<li><a href="/delivery/list/view.do">용달서비스 거래</a></li>
				<c:if test="${userSession.username ne null}">

					<li class="nav-item"><li><a href="/user/mypage.do">마이페이지</a></li>
					<li><a href="/user/message.do">DM</a></li>
					
				</c:if>
				
			</ul>
		</nav>