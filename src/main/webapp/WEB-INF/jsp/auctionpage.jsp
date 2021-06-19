<%@ include file="IncludeTop.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Main -->
<div id="main">
	<div class="inner">
		<header>
			<h1>
				⏳ 용달 서비스 경매<br />
			</h1>
			<p>
				진행중인 경매 목록입니다. <br />
			</p>


			<li><a href="/delivery/auctionInsert.do">경매등록 📝</a></li>
		</header>
		<section class="tiles">
			<c:forEach var="ac" items="${ACList}">
			<c:if test="${ACList eq null}">
		   <h2>아직 등록된 경매가 없습니다. <a href="/"><b>되돌아가기</b></a></h2>
			</c:if>
				<article class="style3">
					<span class="image"> <img src="/images/pic01.jpg" alt="" />
					</span> <a
						href="<c:url value='/delivery/auctionDetailView.do'>
						   <c:param name='acId' value='${ac.auctionId}'/>
				 		 </c:url>">
						<h2>출발지: ${ac.address1 }</h2>
						<div class="content">
							<p>
								${ac.address1} > ${ac.address2 } <br /> 시작가: ${ac.startPrice}
							</p>
						</div>
					</a> <br />
					<div class="col-6 col-12-medium">
						<ul class="actions">
							<li><span class="button primary">경매 입장가능</span></li>
						</ul>
					</div>
				</article>
			</c:forEach>
		</section>
	</div>
</div>
<%@ include file="IncludeBottom.jsp"%>