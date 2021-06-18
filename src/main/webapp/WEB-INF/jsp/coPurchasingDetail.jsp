<%@ include file="IncludeTop.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Main -->
<div id="main">
	<div class="inner">
		<h1>Co-Purchasing</h1>
		<section>
			<h1 style="font-size: 40px">공동구매 상세내역</h1>
			<h1 style="font-size: 30px">공동구매 ID : ${cp.coPurchasingId}</h1>
			<h3>@Note: <b style="color:#f2849e">${cp.note }</b></h3>
			
						<a href="/coPurchasing/join.do?coPurchasingId=${cp.coPurchasingId}">공동구매 참여</a>
			
			<div class="table-wrapper">
				<table>
					<thead>
						<tr>
							<th>Item</th>
							<th>Description</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>ServiceDate</td>
							<td> ${del.serviceDate }</td>
							
						</tr>
						<tr>
							<td>Poster</td>
							<td> <a href="/user/view?username=${cp.username}">${cp.username}</a></td>
							<td></td>
						</tr>
						<tr>
							<td>Destination</td>
							<td> ${del.address2 }</td>
						
						</tr>
						<tr>
							<td>Price</td>
							<td> ${del.price } / 인당 ${cp.unitCost }</td>
						</tr>
						<tr>
							<td>MaxNumberOfPurchaser</td>
							<td> ${cp.maxNumberOfPurchaser }</td>
							
						</tr>
						<tr>
							<td>Width</td>
							<td> ${del.width}m</td>
						
						</tr>
						<tr>
							<td>Height</td>
							<td> ${del.height }m</td>
							
						</tr>
						<tr>
							<td>Weight</td>
							<td> ${del.weight }kg</td>
						
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
						<c:forEach var="cplineitem" items="${cplineitem}">
							<tr>
								<td>${cplineitem.deliveryId}</td>
								<td>${cplineitem.coPurchasingId}</td>
								<td>${cplineitem.username}</td>
							</tr>
						</c:forEach>
						
					</tbody>
				</table>
			</div>
		</section>
	</div>
</div>
<%@ include file="IncludeBottom.jsp"%>