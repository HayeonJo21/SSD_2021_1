<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="IncludeTop.jsp"%>

<!-- Main -->
<div id="main">
	<div class="inner">

		<h2>공동구매 글 작성</h2>
		<form method="post" action="/coPurchasing/insert.do">
			<div class="row gtr-uniform">
				<div class="col-12">
					<label for="demo-name">공동구매 모집자 이름</label> <input type="text"
						name="username" id="username" value="${userSession.username}"
						placeholder="${userSession.username}" disabled />
				</div>

				<div class="col-12">
					<label for="demo-name">공동구매 상품</label> <input type="text"
						name="deliveryId" id="deliveryId" value="${delivery.deliveryId}" disabled/>
				</div>

				<div class="col-12">
					<label for="demo-name">가격</label> <input type="text" name="price"
						id="price" value="${delivery.price}"
						placeholder="${delivery.price}" disabled />
				</div>

				<div class="col-12">
					<label for="demo-name">1인당 가격</label> <input type="text"
						name="unitCost" id="unitCost" value="" placeholder="unitCost" />
				</div>

				<div class="col-12">
					<label for="demo-name">총 모집 인원</label> <input type="text"
						name="maxNumberOfPurchaser" id="maxNumberOfPurchaser" value=""
						placeholder="maxNumberOfPurchaser" />
				</div>
				<div class="col-12">
					<label for="demo-name">부가 설명</label> <input type="text" name="note"
						id="note" value="" placeholder="부가 설명을 입력해주세요." />
				</div>
				<div class="col-12">
					<ul class="actions">
						<li><input type="submit" value="Submit" class="primary" /></li>
						<li><input type="reset" value="Reset" /></li>
					</ul>
				</div>
			</div>
		</form>

	</div>

</div>

<%@ include file="IncludeBottom.jsp"%>