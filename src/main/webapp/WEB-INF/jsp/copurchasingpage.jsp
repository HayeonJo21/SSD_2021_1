<%@ include file="IncludeTop.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Main -->
<div id="main">
	<div class="inner">
		<header>
			<h1>
				용달 서비스 공동구매<br />
			</h1>
			<p>진행중인 공동구매 목록입니다.</p>
			<br/>
			<li><a href="/coPurchasing/insert/form.do">공동구매 등록 </a></li>
			<br/>
		</header>
		<section class="tiles">
		<c:forEach var="cp" items="${CPList}">
			<article class="style5">
				<span class="image"> <img src="/images/pic08.jpg" alt="" />
				</span> <a
					href="<c:url value='/coPurchasing/detailView.do'>
						   <c:param name='coPurchasingId' value='${cp.coPurchasingId}'/>
				 		 </c:url>">
					<h2>${cp.username}님의공동구매</h2>
					<div class="content">
						<p>1인당 가격: ${cp.unitCost }</p>
					</div>
				</a> 현황
				<div class="progress">
					<div class="progress-bar" role="progressbar" style="width: 65%;"
						aria-valuenow="65" aria-valuemin="0" aria-valuemax="100">65%</div>
				</div>
			</article>
		</c:forEach>
	</section>
	</div>
</div>

<%@ include file="IncludeBottom.jsp"%>