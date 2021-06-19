<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="IncludeTop.jsp"%>
<script>
	function closedAuction() {
		alert("종료된 경매 입니다.");
		return false;
	} 
</script>
<!-- Main -->
<div id="main">
	<div class="inner">
		<h1>Auction ⏳</h1>
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
		<form action="" method="post"></form>
		<h2>
			⏰ 경매 마감시간: ${ac.endDate }
			<c:if test="${userSession.username eq ac.username}">
				<div style="float: right; padding-right: 30px">
					<!--<c:if test="${status eq close}">
						<a href="index" class="button primary">&nbsp;&nbsp;&nbsp;🛎낙찰🛎&nbsp;&nbsp;&nbsp;</a>
					</c:if>-->
					<c:if test="${status eq 'CLOSE'}">
						<input type="button" class="button" disabled
							value="&ensp;🛎낙찰🛎&ensp;">
					</c:if>
					<c:if test="${status eq 'OPEN'}">
						<input type="button" class="button primary"
							value="&ensp;🛎낙찰🛎&ensp;">
					</c:if>
				</div>
			</c:if>
		</h2>
		<h3>💵 시작가: ${ac.startPrice} (KRW)</h3>
		<h3>💰 입찰단위: 입찰자 자유</h3>
		<br />
		<c:if
			test="${userSession.username ne ac.username && userSession.username ne null}">
			<div style="float: right; padding-right: 5px">
				<c:if test="${status eq 'CLOSE'}">
					<a href="#"
						class="button primary" onclick="closedAuction()">&ensp;&ensp;경매
						참여🤚🏻&ensp;&ensp;</a>
				</c:if>
				<c:if test="${status eq 'OPEN'}">
					<a href="/delivery/auctionJoin.do?auctionId=${ac.auctionId}"
						class="button primary">&ensp;&ensp;경매 참여🤚🏻&ensp;&ensp;</a>
				</c:if>
			</div>
		</c:if>
		<br />
		<h3>
			<b style="color: #f2849e">* 입찰 현황</b>
		</h3>
		<div class="table-wrapper">
			<table class="alt">
				<thead>
					<tr>
						<th>번호</th>
						<th>참여자</th>
						<th>입찰일시</th>
						<th>입찰금액</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="aclineitem" items="${aclineitem}" varStatus="st">
						<tr>
							<td>${st.index+1}</td>
							<td>${aclineitem.username}</td>
							<td>${aclineitem.joinDate}</td>
							<td>${aclineitem.joinPrice}원</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>

<%@ include file="IncludeBottom.jsp"%>