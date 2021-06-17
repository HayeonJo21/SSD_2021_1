<%@ include file="IncludeTop.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Main -->
<div id="main">
	<div class="inner">
		<header>
			<h1>
				용달의 민족 <br /> a delivery service auction <br /> and co-purchasing
				site.<br />
			</h1>
			<p>현재 진행중인 용달 서비스 경매 및 공동구매 입니다.</p>
		</header>
		<h3>* 경매</h3>
		<section class="tiles">
			<c:forEach var="ac" items="${ACList}">
				<article class="style3">
					<span class="image"> <img src="images/pic01.jpg" alt="" />
					</span> <a href="auctionDetail.do">
						<h2>출발지: ${ac.address1 }</h2>
						<div class="content">
							<p>
								${ac.address1} > ${ac.address2 } <br /> 서비스일: ${ac.serviceDate}
								/ 시작가: ${ac.startPrice}
							</p>
						</div>
					</a><br />
					<div class="col-6 col-12-medium">
						<ul class="actions">
							<li><span class="button primary">경매 입장</span></li>
						</ul>
					</div>
				</article>
			</c:forEach>
		</section>
		<br /> <br /> <br />

		<h3>* 회원간 용달 거래</h3>
		<section class="tiles">
			<c:forEach var="del" items="${DelList}">
				<article class="style1">
					<span class="image"> <img src="images/pic06.jpg" alt="" />
					</span> <a
						href="<c:url value='/delivery/detailView.do'>
						   <c:param name='deliveryId' value='${del.deliveryId}'/>
				 		 </c:url>">
						<h2>출발지: ${del.address1 }</h2>
						<div class="content">
							<p>
								출발: ${del.address1 } > 도착: ${del.address2 }. <br /> 가격:
								${del.price}
							</p>
						</div>
					</a> <br /> 서비스 제공일: ${del.serviceDate }
				</article>
			</c:forEach>
		</section>

		<br /> <br /> <br />
		<h3>* 공동구매</h3>
		<section class="tiles">
			<article class="style2">
				<span class="image"> <img src="images/pic04.jpg" alt="" />
				</span> <a href="generic.html">
					<h2>고양이 (1957)</h2>
					<div class="content">
						<p>
							박수근 Park Sugeun의 작품입니다. <br /> (16.8 x 21.2 cm)
						</p>
					</div>
				</a> <br /> 남은기간: 19일
				<div class="progress">
					<div class="progress-bar" role="progressbar" style="width: 65%;"
						aria-valuenow="65" aria-valuemin="0" aria-valuemax="100">65%</div>
				</div>
			</article>
		</section>

		<br /> <br /> <br />
	</div>
</div>
<%@ include file="IncludeBottom.jsp"%>
