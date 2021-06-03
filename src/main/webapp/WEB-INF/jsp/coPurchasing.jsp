<%@ include file="IncludeTop.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Main -->
<div id="main">
	<div class="inner">
		<h1>CoPurchasing</h1>
		<span class="image main"><img src="images/ikea.jpg" alt="" /></span>
		<section>
			<h1 style="font-size: 40px">공동구매 상세내역</h1>
			<!--  <h2>공동구매 ID : ${coPurchasingLineItem.coPurchasingId}</h2> -->
			<h1 style="font-size: 30px">공동구매 ID : IK330</h1>
			<div class="table-wrapper">
				<table>
					<thead>
						<tr>
							<th>Item</th>
							<th>Description</th>
							<th>note</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>ServiceDate</td>
							<td>21.04.16</td>
							<td></td>
						</tr>
						<tr>
							<td>Poster</td>
							<td>광명Love</td>
							<td></td>
						</tr>
						<tr>
							<td>Destination</td>
							<td>광명동</td>
							<td>수궁동 부근까지 가능</td>
						</tr>
						<tr>
							<td>Price</td>
							<td>56000원</td>
							<td>인당 14000원</td>
						</tr>
						<tr>
							<td>MaxNumberOfPurchaser</td>
							<td>4명</td>
							<td></td>
						</tr>
						<tr>
							<td>Width</td>
							<td>2m</td>
							<td></td>
						</tr>
						<tr>
							<td>Height</td>
							<td>1.2m</td>
							<td></td>
						</tr>
						<tr>
							<td>Weight</td>
							<td>50kg</td>
							<td></td>
						</tr>
						<tr>
							<td>Loadage</td>
							<td>10개</td>
							<td>인당 3개 이하</td>
						</tr>
					</tbody>
				</table>
			</div>
			<br>
			<!-- percentage bar -->
			<h1 style="font-size: 30px">Progress of CoPurchasing</h1>
			<p>공동구매 진행상황을 보여줍니다.</p>
			<div class="progress">
				<div
					class="progress-bar progress-bar-warning progress-bar-striped active"
					role="progressbar" aria-valuenow="40" aria-valuemin="0"
					aria-valuemax="100" style="width: 75%">75%</div>
			</div>
			<br>
			<br>
			<!-- 참여자 정보 -->
			<h1 style="font-size: 30px">참여자 정보</h1>
			<div class="table-wrapper">
				<table class="alt">
					<thead>
						<tr>
							<th>UserName</th>
							<th>Address</th>
							<th>Loadage</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>choi03</td>
							<td>수궁동</td>
							<td>2개</td>
						</tr>
						<tr>
							<td>skyPark</td>
							<td>광명1동</td>
							<td>1개</td>
						</tr>
						<tr>
							<td>rud99</td>
							<td>광명7동</td>
							<td>3개</td>
						</tr>
					</tbody>
				</table>
			</div>
		</section>
	</div>
</div>
<%@ include file="IncludeBottom.jsp"%>