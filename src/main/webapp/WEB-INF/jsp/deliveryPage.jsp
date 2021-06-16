<%@ include file="IncludeTop.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Main -->
<div id="main">
	<div class="inner">
		<header>
			<h1>
				용달 서비스 거래<br />
			</h1>
			<p>
				진행중인 용달 서비스 입니다. <br />
			</p>
<li><a href="/delivery/insert.do">용달 서비스 등록 </a></li>
			<div class="table-wrapper">
				<table class="alt">
					<thead>
						<tr>
							<th>Name</th>
							<th>Date</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach var="del" items="${delivery}">
							<tr>
								<td><a
									href="<c:url value='/delivery/detailView.do'>
						   <c:param name='deliveryId' value='${del.deliveryId}'/>
				 		 </c:url>">${del.deliveryId}</a></td>
								<td>${del.serviceDate}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>

		</header>
	<br /> <br /> <br />
	</div>
</div>
<%@ include file="IncludeBottom.jsp"%>