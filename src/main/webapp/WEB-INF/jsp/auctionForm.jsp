<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="IncludeTop.jsp"%>
		<!-- Main -->
		<div id="main">
			<div class="inner">

				<h2>경매 글 작성</h2>
				<form method="post" action="/delivery/auctionNewAuctionSubmitted.do">
					<div class="form-group">
						<label for="auction.serviceId" style="font-size: 24px">Username</label>
						<input type="text" style="width: 800px" class="form-control"
							name="username" value = '${userSession.username}' id="username">
					</div>
					<div class="form-group">
						<label for="auction.endDate" style="font-size: 24px">EndDate</label>
						<input type="text" style="width: 800px" class="form-control"
							name="endDate" placeholder="마감일 ex 20210615" value="20210630">
					</div>
					<div class="form-group">
						<label for="auction.startPrice" style="font-size: 24px">StartPrice</label>
						<input type="text" style="width: 800px" class="form-control"
							name="startPrice" placeholder="ex 50000" value="50000" id="startPrice">
					</div>
					
					
					<!-- pre>복용기간		     	 <input type="text" name="ingestion_start" id="datepicker1"> ~ <input
					type="text" name="ingestion_end" id="datepicker2">
			</pre> -->
					
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

<%@ include file="IncludeTop.jsp"%>