<%@ include file="IncludeTop.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Main -->
<div id="main">
	<div class="inner">
		<header>
			<h1>
				용달 서비스 경매<br />
			</h1>
			<p>
				진행중인 경매 목록입니다. <br /> ** 기사분이 올린 경매는 저가 경매로 이루어집니다.(역경매) **
			</p>


			<li><a href="/auction/insert">경매등록 </a></li>

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

		</header>
	<section class="tiles">
		<article class="style1">
			<span class="image"> <img src="images/pic1.png" />
			</span> <a href="acutionDetail.jsp">
				<h2>출발지: 고양 이케아(IKEA)</h2>
				<div class="content">
					<p>
						고양 이케아 > 경기도 의정부 민락동 가능한 기사 분 찾습니다. <br /> 물건 규격: 1.4 x 1.0m, 약
						9kg
					</p>
				</div>
			</a> <br /> 남은기간: 00일 00시 00분 00초
			<div class="col-6 col-12-medium">
				<ul class="actions stacked">
					<li><a href="#" class="button fit">경매 입장</a></li>
				</ul>
			</div>
		</article>
		<article class="style7">
			<span class="image"> <img src="images/pic2.png" alt="" />
			</span> <a href="generic.html">
				<h2>출발지: 광명 이케아(IKEA)</h2>
				<div class="content">
					<p>
						광명 이케아(IKEA) > 서울시 성북구 월곡동 가능한 기사분 찾습니다. <br /> 물건 규격: 170cm x
						89cm, 약 12kg
					</p>
				</div>
			</a> <br /> 남은기간: 00일 00시 00분 00초
			<div class="col-6 col-12-medium">
				<ul class="actions stacked">
					<li><a href="#" class="button fit">경매 입장</a></li>
				</ul>
			</div>
		</article>
		<article class="style3">
			<span class="image"> <img src="images/pic3.jpg" alt="" />
			</span> <a href="generic.html">
				<h2>출발지: 경기도 의정부시 가구거리</h2>
				<div class="content">
					<p>
						고양시에서 출발 가능, 서비스 필요한 사용자 찾습니다. <br /> 차량 적재: 60kg 이하 가능
					</p>
				</div>
			</a> <br /> 남은기간: 00일 00시 00분 00초
			<div class="col-6 col-12-medium">
				<ul class="actions stacked">
					<li><a href="#" class="button fit">경매 입장</a></li>
				</ul>
			</div>
		</article>
	</section>
	<br /> <br /> <br />
	<section class="tiles">
		<article class="style4">
			<span class="image"> <img src="images/passage.png" alt="" />
			</span> <a href="generic.html">
				<h2>Un Passage (2008)</h2>
				<div class="content">
					<p>
						하태임 Taeim Ha의 작품입니다.<br />추정가: 1,900,000 ~ 3,500,000(KRW)
					</p>
				</div>
			</a><br /> 남은기간: 00일 00시 00분 00초
			<div class="col-6 col-12-medium">
				<ul class="actions">
					<li><span class="button primary disabled">응찰 마감</span></li>
				</ul>
			</div>

		</article>
		<article class="style5">
			<span class="image"> <img src="images/pumpkin.png" alt="" />
			</span> <a href="generic.html">
				<h2>Pumpkin (1988)</h2>
				<div class="content">
					<p>
						쿠사마 야요이 Yayoi Kusama의 작품입니다.<br /> 추정가: 50,000,000 ~
						75,000,000(KRW)
					</p>
				</div>
			</a><br /> 남은기간: 00일 00시 00분 00초
			<div class="col-6 col-12-medium">
				<ul class="actions stacked">
					<li><a class="button fit">경매 입장</a></li>
				</ul>
			</div>

		</article>
		<article class="style6">
			<span class="image"> <img src="images/scene.png" alt="" />
			</span> <a href="generic.html">
				<h2>풍경 (2004)</h2>
				<div class="content">
					<p>
						김종학 Kim ChongHak의 작품입니다. <br /> 추정가: 65,000,000 ~
						100,000,000(KRW)
					</p>
				</div>
			</a><br /> 남은기간: 00일 00시 00분 00초
			<div class="col-6 col-12-medium">
				<ul class="actions stacked">
					<li><a href="#" class="button fit">경매 입장</a></li>
				</ul>
			</div>
		</article>
	</section>
	</div>
</div>
<%@ include file="IncludeBottom.jsp"%>