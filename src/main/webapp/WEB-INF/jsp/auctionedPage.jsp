<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="IncludeTop.jsp"%>
<!-- Main -->
<div id="main">
	<div class="inner">
		<h1>Auction ๋์ฐฐ ์ฑ๊ณต ๐</h1>
		<h2>์ถ๋ฐ์ง: ${ac.address1}</h2>
		<h2>
			<a href="/user/view?username=${ac.username}">๊ฒฝ๋งค ๋ฑ๋ก์ :
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
						<td>์๋น์ค ์ ๊ณต์</td>
						<td>${ac.username}</td>

					</tr>
					<tr>
						<td>์ถ๋ฐ์ง</td>
						<td>${ac.address1 }</td>

					</tr>
					<tr>
						<td>๋์ฐฉ์ง</td>
						<td>${ac.address2 }</td>

					</tr>
					<tr>
						<td>์๋น์ค ๋ ์ง</td>
						<td>${ac.serviceDate }</td>

					</tr>
					<tr>
						<td>๋์ฐฐ ๊ฐ๊ฒฉ</td>
						<td>${ac.finalPrice }</td>

					</tr>
					<tr>
						<td>๋์ฐฐ ํ์</td>
						<td>${ac.successfulBidder }</td>

					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>

<%@ include file="IncludeBottom.jsp"%>