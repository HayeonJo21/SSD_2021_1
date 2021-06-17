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
			<h1 style="font-size: 30px">공동구매 ID : ${cp.coPurchasingId}</h1>
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
							<td> ${del.serviceDate }</td>
							<td></td>
						</tr>
						<tr>
							<td>Poster</td>
							<td> ${cp.username}</td>
							<td></td>
						</tr>
						<tr>
							<td>Destination</td>
							<td> ${del.address2 }</td>
							<td></td>
						</tr>
						<tr>
							<td>Price</td>
							<td> ${del.price }</td>
							<td>인당 ${cp.unitCost }</td>
						</tr>
						<tr>
							<td>MaxNumberOfPurchaser</td>
							<td> ${cp.maxNumberOfPurchaser }</td>
							<td></td>
						</tr>
						<tr>
							<td>Width</td>
							<td> ${del.width}m</td>
							<td></td>
						</tr>
						<tr>
							<td>Height</td>
							<td> ${del.height }m</td>
							<td></td>
						</tr>
						<tr>
							<td>Weight</td>
							<td> ${del.weight }kg</td>
							<td></td>
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