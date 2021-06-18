<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="IncludeTop.jsp"%>
<!-- Main -->
<div id="main">
	<div class="inner">
		<h1>용달 서비스 등록하기</h1>
		<form method="post" action="/delivery/insert.do">
			<div class="row gtr-uniform">
				<div class="col-12">
					<label for="address1">아이디</label> <input type="text"
						name="username" id="username" value="${userSession.username}"
						placeholder="${userSession.username}" />
				</div>
 
				<div class="col-12">
					<label for="address1">출발지</label> <input type="text"
						name="address1" id="address1" value="${delivery.address1}"
						placeholder="출발가능 지역을 작성해주세요." />
				</div>
				<div class="col-12">
					<label for="address2">도착지</label> <input type="text"
						name="address2" id="address2" value="${delivery.address2 }"
						placeholder="도착 가능 지역을 작성해주세요." />
				</div>
				<div class="col-12">
					<label for="serviceDate">서비스 제공일</label>
					<div class="col-lg-10">
						<input type="text" id="serviceDate" name="serviceDate"
							class="form-control" placeholder="2021/01/01">
					</div>
					<div class="col-12">
						<input type="hidden" name="filename" id="filename"
							value="${delivery.filename }" placeholder="첨부파일" />
					</div>
					<div class="col-12">
						<label for="address2">가격</label> <input type="text" name="price"
							id="price" value="${delivery.price }" placeholder="가격" />
					</div>

					<label for="size">차량 재적 정보</label>
					<div class="col-3">
						<input type="text" name="width" id="width"
							value="${delivery.width }" placeholder="가로" />
					</div>
					<div class="col-3">
						<input type="text" name="depth" id="depth"
							value="${delivery.depth }" placeholder="세로 " />
					</div>
					<div class="col-3">
						<input type="text" name="height" id="height"
							value="${delivery.height }" placeholder="높이" />
					</div>
					<div class="col-3">
						<input type="text" name="weight" id="weight"
							value="${delivery.weight }" placeholder="무게" />
					</div>

					<div class="col-12">
						<input type="text" name="loadage" id="loadage"
							value="${delivery.loadage }" placeholder="총 적재량" />
					</div>
					<br>
					<br>
					<div class="col-12">
						<ul class="actions">
							<li><input type="submit" value="Submit" class="primary" /></li>
							<li><input type="reset" value="Reset" /></li>
						</ul>
					</div>
				</div>
			</div>
		</form>
	</div>
</div>

<%@ include file="IncludeBottom.jsp"%>