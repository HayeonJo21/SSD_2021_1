<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="IncludeTop.jsp"%>

		<!-- Main -->
		<div id="main">
			<div class="inner">
				<h1>출발지: 광명 이케아(IKEA)</h1>
				
				<h2>판매자 : ${auction.username} </h2>
				
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
						<td>${delivery.username}</td>

					</tr>
					<tr>
						<td>출발지</td>
						<td>${delivery.address1 }</td>

					</tr>
					<tr>
						<td>도착지</td>
						<td>${delivery.address2 }</td>

					</tr>
					<tr>
						<td>서비스 날짜</td>
						<td>${delivery.serviceDate }</td>

					</tr>
					<tr>
						<td>가격</td>
						<td>${delivery.price }</td>

					</tr>
				</tbody>
			</table>
		</div>
				
				
				
				<h2>남은시간: (endDate - 현재 시간) <a href="index.jsp" class="button primary">낙찰</a></h2>
				<span class="image main"><img src="images/pic1.png" alt="" /></span>
				<h3>시작가: ${auction.startPrice} (KRW)</h3>
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