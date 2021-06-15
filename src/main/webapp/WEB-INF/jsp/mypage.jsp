<%@ include file="IncludeTop.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Main -->
<div id="main">
	<div class="inner">
		<h1>${user.username}님</h1>
		<div>
			<h3>회원정보</h3>
			<div class="table-wrapper">
				<table class="alt">
					<thead>
						<tr>
							<th>Name</th>
							<th>Description</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>username</td>
							<td>${user.username}</td> 
						</tr>
						<tr>
							<td>email</td>
							<td>${user.email}</td>
						</tr>
						<tr>
							<td>firstName</td>
							<td>${user.firstName}</td>
						</tr>
						<tr>
							<td>lastName</td>
							<td>${user.lastName}</td>
						</tr>
						<tr>
							<td>address</td>
							<td>${user.address}</td>
						</tr>
						<tr>
							<td>phone</td>
							<td>${user.phone}</td>

						</tr>
						<tr>
							<td>languagePreference</td>
							<td>${user.languagePreference}</td>
						</tr>
						<tr>
							<td>favoriteUser</td>
							<td>${user.favoriteUser}</td>
						</tr>
						<tr>
							<td>carInfo</td>
							<td>${user.carInfo}</td>
						</tr>
					</tbody>
				</table>
			</div>
			<a class="button" href="/user/updateAccount.do">정보수정</a><br><br><br>
			<%-- <div position="absolute" style="float: right; width: 300px;">
						<jsp:include page="message.jsp" flush="true" />
					</div> --%>
		</div>
		<div>
			<h3>참여한 공동구매 내역</h3>
			<div class="table-wrapper">
				<table class="alt">
					<thead>
						<tr>
							<th>Name</th>
							<th>Description</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach var="cp" items="${CPList}">
							<tr>
								<td><a
									href="<c:url value='/cp/view.do'>
						   <c:param name='cpId' value='${cp.coPurchasingId}'/>
				 		 </c:url>">${cp.coPurchasingId}</a></td>
								<td>${cp.username}</td>
								<td>${cp.note}</td>
								<td>${cp.unitcost}</td>
								<td>${cp.price}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<div>
			<h3>회원간 거래 글</h3>
			<div class="table-wrapper">
				<table class="alt">
					<thead>
						<tr>
							<th>Name</th>
							<th>Description</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach var="fm" items="${FMList}">
							<tr>
								<td><a
									href="<c:url value='/fm/view.do'>
						   <c:param name='fmId' value='${fm.fleamarketId}'/>
				 		 </c:url>">${fm.fleamarketId}</a></td>
								<td>${fm.username}</td>
								<td>${fm.address}</td>
								<td>${fm.totalPrice}</td>
								<td>${fm.itemId}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<div>
			<h3>참여한 경매 내역</h3>
			<div class="table-wrapper">
				<table class="alt">
					<thead>
						<tr>
							<th>Name</th>
							<th>Description</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach var="ac" items="${ACList}">
							<tr>
								<td><a
									href="<c:url value='/auction/view.do'>
						   <c:param name='acId' value='${ac.auctionId}'/>
				 		 </c:url>">${ac.acutionId}</a></td>
								<td>${ac.username}</td>
								<td>${ac.serviceId}</td>
								<td>${ac.startPrice}</td>
								<td>${ac.finalPrice}</td>
								<td>${ac.endDate}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

<%@ include file="IncludeBottom.jsp"%>
