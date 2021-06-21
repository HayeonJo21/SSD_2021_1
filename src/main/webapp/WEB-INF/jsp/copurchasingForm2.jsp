<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="IncludeTop.jsp"%>
<script type="text/javaScript">
	function eventKeyup(str){
		var total = $('#price').val();
		
		$("#unitCost").val(parseInt(total/str));
	}
</script>
<!-- Main -->
<div id="main">
	<div class="inner">

		<h2>공동구매 글 작성</h2>
		<form method="post" action="/delivery/coPurchasingInsert.do">
			<div class="row gtr-uniform">
				<div class="col-12">
					<label for="demo-name">공동구매 모집자 이름</label><input type="hidden"
						name="username" id="username" value='${userSession.username}' />
						<div class="col-lg-10">
	        	<p class="form-control-static">${userSession.username}</p> 
	        </div>
				</div>

				<div class="col-12">
					<label for="demo-name">공동구매 상품</label> <input type="hidden"
						name="deliveryId" id="deliveryId" value='${delivery.deliveryId}' placeholder="${delivery.deliveryId}"/>
						<div class="col-lg-10">
	        	<p class="form-control-static">${delivery.deliveryId}</p> 
	        </div>
				</div>

				<div class="col-12">
					<label for="demo-name">가격</label> <input type="hidden" name="price"
						id="price" value='${delivery.price}'
						placeholder="${delivery.price}" />
						<div class="col-lg-10">
	        	<p class="form-control-static">${delivery.price}</p> 
	        </div>
				</div>
				<div class="col-12">
					<label for="demo-name">총 모집 인원</label> <input type="text"
						name="maxNumberOfPurchaser" id="maxNumberOfPurchaser" value=""
						placeholder="총 모집 인원을 입력하세요." onkeyup="eventKeyup(this.value)" />
				</div>
				<div class="col-12">
					<label for="demo-name">1인당 가격</label> <input type="text"
						name="unitCost" id="unitCost" value="" placeholder="※ 총 모집 인원을 입력하시면 자동으로 계산됩니다."readonly />
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