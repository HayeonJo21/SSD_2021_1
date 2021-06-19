<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="IncludeTop.jsp"%>
<!-- Main -->
<div id="main">
	<div class="inner">
		<h1>Auction 낙찰 성공⏳</h1>
		<h2>출발지: ${ac.address1}</h2>
		<h2>
			<a href="/user/view?username=${ac.username}">경매 등록자 :
				${ac.username}</a>
		</h2>

		<div class="table-wrapper">
			<table class="alt">
				<thead>
					<tr>
						<th>Item</th>
						<th>Description</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>서비스 제공자</td>
						<td>${ac.username}</td>

					</tr>
					<tr>
						<td>출발지</td>
						<td>${ac.address1 }</td>

					</tr>
					<tr>
						<td>도착지</td>
						<td>${ac.address2 }</td>

					</tr>
					<tr>
						<td>서비스 날짜</td>
						<td>${ac.serviceDate }</td>

					</tr>
					<tr>
						<td>낙찰 가격</td>
						<td>${ac.finalPrice }</td>

					</tr>
					<tr>
						<td>낙찰 회원</td>
						<td>${ac.successfulBidder }</td>

					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>

<%@ include file="IncludeBottom.jsp"%>