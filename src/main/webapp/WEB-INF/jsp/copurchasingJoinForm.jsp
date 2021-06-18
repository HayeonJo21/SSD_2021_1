<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="IncludeTop.jsp"%>

<!-- Main -->
<div id="main">
	<div class="inner">

		<h2>공동구매 참여</h2>

		<div class="row gtr-uniform">
			<div class="col-12">
				<label for="demo-name">공동구매 모집자 이름</label><input type="hidden"
					name="username" id="username" value='${cp.username}' />
				<div class="col-lg-10">
					<p class="form-control-static">${cp.username}</p>
				</div>
			</div>



			<div class="col-12">
				<label for="demo-name">공동구매 상품</label> <input type="hidden"
					name="deliveryId" id="deliveryId" value='${delivery.deliveryId}'
					placeholder="${delivery.deliveryId}" />
				<div class="col-lg-10">
					<p class="form-control-static">${delivery.deliveryId}</p>
				</div>
			</div>

			<div class="col-12">
				<label for="demo-name">가격</label> <input type="hidden" name="price"
					id="price" value='${cp.price}' placeholder="${cp.price}" />
				<div class="col-lg-10">
					<p class="form-control-static">${cp.price}</p>
				</div>
			</div>

			<div class="col-12">
				<label for="demo-name">1인당 가격</label> <input type="hidden"
					name="price" id="price" value='${cp.unitCost}'
					placeholder="${cp.unitCost}" />
				<div class="col-lg-10">
					<p class="form-control-static">${cp.unitCost}</p>
				</div>
			</div>
			
			
			
			<form method="post" action="/coPurchasing/join.do">
				<div class="col-12">
					<label for="demo-name">coPurchasingId</label> <input type="text"
						name="coPurchasingId" id="coPurchasingId" value='${cp.coPurchasingId} '
						placeholder="1인당 가격을 입력하세요." />
				</div>

				<div class="col-12">
					<label for="demo-name">user</label> <input type="text" name="username"
						id="username" value='${user.username} ' placeholder="username" />
				</div>
				<div class="col-12">
					<ul class="actions">
						<li><input type="submit" value="Submit" class="primary" /></li>
						<li><input type="reset" value="Reset" /></li>
					</ul>
				</div>

			</form>
		</div>

	</div>

</div>

<%@ include file="IncludeBottom.jsp"%>