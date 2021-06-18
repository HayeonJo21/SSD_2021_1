<%@ include file="IncludeTop.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Main -->
<div id="main">
	<div class="inner"> 
		<h1>${favUser.username}님</h1>
		
		
		
		<form method="post" action="/user/favoriteUser.do">
			<div class="form-group">
				<input type="hidden" class="form-control" name="username"
					value='${user.username}' id="username">
			</div>
			<div class="form-group">
				<input type="hidden" style="width: 800px" class="form-control"
					name="favoriteUsername" value='${favUser.username}' >
			</div>
			<div class="form-group">
				<input type="hidden" style="width: 800px" class="form-control"
					name="tradeCount" value="0"
					id="tradeCount">
			</div>

			<div class="form-group text-center">
				<button type="submit" class="button primary">
					즐겨찾기 등록<i class="fa fa-check spaceLeft"></i>
				</button>
				<a class="btn btn-warning" href="/">가입취소<i
					class="fa fa-times spaceLeft"></i>
				</a>
			</div>
		</form>
		
		
<%-- 		<a class="button" href="/user/favoriteUser.do?username=${user.username}">즐겨찾기 등록</a>
 --%>		<div>
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
							<td>${favUser.username}</td> 
						</tr>
						<tr>
							<td>email</td>
							<td>${favUser.email}</td>
						</tr>
						<tr>
							<td>firstName</td>
							<td>${favUser.firstName}</td>
						</tr>
						<tr>
							<td>lastName</td>
							<td>${favUser.lastName}</td>
						</tr>
						<tr>
							<td>address</td>
							<td>${favUser.address}</td>
						</tr>
						<tr>
							<td>phone</td>
							<td>${favUser.phone}</td>

						</tr>
						<tr>
							<td>languagePreference</td>
							<td>${favUser.languagePreference}</td>
						</tr>
						<tr>
							<td>favoriteUser</td>
							<td>${favUser.favoriteUser}</td>
						</tr>
						<tr>
							<td>carInfo</td>
							<td>${favUser.carInfo}</td>
						</tr>
					</tbody>
				</table>
			</div>
			<!-- <a class="button" href="/delivery/updateAccount.do">정보수정</a><br><br><br> -->
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
								<td>${cp.unitCost}</td>
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
						<c:forEach var="del" items="${DelList}">
							<tr>
								<td><a
									href="<c:url value='/delivery/detail/view.do'>
						   <c:param name='deliveryd' value='${del.deliveryId}'/>
				 		 </c:url>">${del.deliveryId}</a></td>
								<td>${del.serviceDate}</td>
								<td>${del.price}</td>
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
				 		 </c:url>">${ac.auctionId}</a></td>
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
