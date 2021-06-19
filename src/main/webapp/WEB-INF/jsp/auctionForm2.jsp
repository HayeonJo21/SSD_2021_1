<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="IncludeTop.jsp"%>
<!-- Main -->
<div id="main">
	<div class="inner">

		<h2>경매 글 작성</h2>
		<form method="post" action="/delivery/auctionInsert2.do">
			<div class="form-group">
				<label for="username" style="font-size: 24px">경매 게시자</label> <input
					type="text" style="width: 800px" class="form-control"
					name="username" value='${userSession.username}' id="username">
			</div>
			<div class="col-12">
				<label for="demo-name">경매 진행할 상품</label> <input type="hidden"
					name="deliveryId" id="deliveryId" value='${delivery.deliveryId}'
					placeholder="${delivery.deliveryId}" />
				<div class="col-lg-10">
					<p class="form-control-static">${delivery.deliveryId}</p>
				</div>
				<div class="form-group">
					<label for="auction.address1" style="font-size: 24px">출발지</label>
					<input type="hidden" style="width: 800px" class="form-control"
						name="address1" placeholder="${delivery.address1 }" id="address1" value='${delivery.address1}'>
						<p class="form-control-static">${delivery.address1}</p> 
				</div>
				<div class="form-group">
					<label for="auction.address2" style="font-size: 24px">도착지</label>
					<input type="hidden" style="width: 800px" class="form-control"
						name="address2" placeholder="${delivery.address2 }" id="address2" value='${delivery.address2 }'>
						<p class="form-control-static">${delivery.address2}</p> 
				</div>
				
				<div class="form-group">
					<label for="auction.startPrice" style="font-size: 24px">용달 서비스 제공일</label>
					<input type="hidden" style="width: 800px" class="form-control"
						name="serviceDate" placeholder="${delivery.serviceDate }" id="serviceDate" value='${delivery.serviceDate }'>
						<p class="form-control-static">${delivery.serviceDate}</p> 
				</div>
				
				
				<div class="form-group">
					<label for="auction.startPrice" style="font-size: 24px">경매 시작가</label>
					<input type="text" style="width: 800px" class="form-control"
						name="startPrice" placeholder="경매 시작가 ex. 50000" id="startPrice">
				</div>

				<div class="form-group">
					<label for="auction.endDate" style="font-size: 24px">경매 마감일</label>
					<input type="text" style="width: 800px" class="form-control"
						name="endDate" placeholder="경매 마감일 ex. 2021-06-23 13:00">
				</div>


				<div class="form-group text-center">
					<button type="submit" class="button primary">
						경매 등록<i class="fa fa-check spaceLeft"></i>
					</button>
					<a class="btn btn-warning" href="/">가입취소<i
						class="fa fa-times spaceLeft"></i>
					</a>
				</div>


				<!-- <div class="row gtr-uniform">
						<div class="col-12">
							<label for="demo-name"></label> <input type="text"
								name="demo-name" id="demo-name" value="" placeholder="username"
								disabled />
						</div>
						<div class="col-12">
							<input type="text" name="endDate" id="endDate" value=""
								placeholder="마감일" />
						</div>
						<div class="col-12">
							<input type="text" name="startPrice" id="startPrice" value=""
								placeholder="경매 시작가" />
						</div>

						<div class="col-12">
							<ul class="actions">
								<li><input type="submit" value="Submit" class="primary" /></li>
								<li><input type="reset" value="Reset" /></li>
							</ul>
						</div>
					</div> -->
		</form>

		<%-- 	<jsp:include page="delivery.jsp" flush="true" /> --%>
	</div>

</div>

<%@ include file="IncludeBottom.jsp"%>