<%@ include file="IncludeTop.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Main -->
<div id="main">
	<div class="inner">
		<header>
			<h1>
				π μ©λ¬ μλΉμ€ κ±°λ<br />
			</h1>
			<p>
				μ§νμ€μΈ μ©λ¬ μλΉμ€ μλλ€. <br />
			</p>
			<a class=button href="/delivery/insert.do">μ©λ¬ μλΉμ€ λ±λ‘ π</a>
			<br />
			<section class="tiles">
				<c:forEach var="del" items="${delivery}">
					<article class="style1">
						<span class="image"> <img src="/images/pic06.jpg" alt="" />
						</span> <a
							href="<c:url value='/delivery/detailView.do'>
						   <c:param name='deliveryId' value='${del.deliveryId}'/>
				 		 </c:url>">
							<h2>μΆλ°μ§: ${del.address1 }</h2>
							<br/>
							<div class="content">
								<p>
									μΆλ°: ${del.address1 } > λμ°©: ${del.address2 } <br /> κ°κ²©:
									${del.price}
								</p>
							</div>
						</a> <br /> μλΉμ€ μ κ³΅μΌ: ${del.serviceDate }
					</article>
				</c:forEach>
			</section>

		</header>
		<br /> <br /> <br />
	</div>
</div>
<%@ include file="IncludeBottom.jsp"%>