<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="IncludeTop.jsp"%>
<!-- Main -->
<div id="main">
	<div class="inner">

<<<<<<< HEAD
				<h2>경매 글 작성</h2>
				<form method="post" action="/delivery/auctionNewAuctionSubmitted.do">
					<div class="form-group">
						<label for="auction.serviceId" style="font-size: 24px">Username</label>
						<input type="text" style="width: 800px" class="form-control"
							name="username" value = '${userSession.username}' id="username">
					</div>
					<div class="form-group">
						<label for="auction.endDate" style="font-size: 24px">EndDate</label>
						<input type="text" style="width: 800px" class="form-control"
							name="endDate" placeholder="마감일 ex 2021/06/15" value="2021/06/30">
					</div>
					<div class="form-group">
						<label for="auction.startPrice" style="font-size: 24px">StartPrice</label>
						<input type="text" style="width: 800px" class="form-control"
							name="startPrice" placeholder="ex 50000" value="50000" id="startPrice">
					</div>
					
					
					<!-- pre>복용기간		     	 <input type="text" name="ingestion_start" id="datepicker1"> ~ <input
					type="text" name="ingestion_end" id="datepicker2">
			</pre> -->
					
					<div class="form-group text-center">
						<button type="submit" class="button primary">
							경매 등록<i class="fa fa-check spaceLeft"></i>
						</button>
						<a class="btn btn-warning" href="/">가입취소<i
							class="fa fa-times spaceLeft"></i>
						</a>
					</div>
=======
		<h2>경매 글 작성</h2>
>>>>>>> branch 'master' of https://github.com/choi1k/SSD_2021_1.git

		<div class="col-12">
			<label for="demo-name">경매 진행할 상품 선택</label>
			<div class="table-wrapper">
				<table class="alt">
					<thead>
						<tr>
							<th>Name</th>
							<th>Date</th>
							<th>Start</th>
							<th>Destination</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach var="del" items="${delList}">
							<tr>
								<td><a
									href="<c:url value='/auction/insert2.do'>
						   <c:param name='deliveryId' value='${del.deliveryId}'/>
				 		 </c:url>">${del.deliveryId}</a></td>
								<td>${del.serviceDate}</td>
								<td>${del.address1}</td>
								<td>${del.address2}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<br /> <br /> <br />
		</div>
	</div>


	<%@ include file="IncludeBottom.jsp"%>