<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="IncludeTopAdmin.jsp"%>		
		<!-- Main -->
<div id="main">
	<div class="inner">
		<header>
			<h1>
				용달의 민족 <br /> Administrator Page <br />
			</h1>
			<p>관리자 페이지 입니다.</p>
		</header>
		<br />
		<div class="inner">
		<h3><a href="/delivery/adminUser.do" class="logo"> <span class="symbol"></span><span class="title">* 회원 관리</span></a></h3>
		</div>
		<br /> <br /> 
		
		<div class="inner">
		<h3><a href="/delivery/adminAuction.do" class="logo"> <span class="symbol"></span><span class="title">* 경매 관리</span></a></h3>
		</div>
		<br /> <br />

		<div class="inner">
		<h3><a href="/delivery/adminDelivery.do" class="logo"> <span class="symbol"></span><span class="title">* 회원간 용달 거래 관리</span></a></h3>
		</div>

		<br /> <br />
		<div class="inner">
		<h3><a href="/delivery/adminCoPurchasing.do" class="logo"> <span class="symbol"></span><span class="title">* 공동구매 관리</span></a></h3>
		</div>

		<br /> <br />
	</div>
</div>

<%@ include file="IncludeBottom.jsp"%>