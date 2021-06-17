<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="IncludeTop.jsp"%>

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" />
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<script>
	$.datepicker.setDefaults({
		dateFormat : 'yy/mm/dd',
		prevText : '이전 달',
		nextText : '다음 달',
		monthNames : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월',
				'10월', '11월', '12월' ],
		monthNamesShort : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월',
				'9월', '10월', '11월', '12월' ],
		dayNames : [ '일', '월', '화', '수', '목', '금', '토' ],
		dayNamesShort : [ '일', '월', '화', '수', '목', '금', '토' ],
		dayNamesMin : [ '일', '월', '화', '수', '목', '금', '토' ],
		showMonthAfterYear : true,
		yearSuffix : '년'
	});

	$(function() {
		$("#datepicker1, #datepicker2").datepicker();
	});
</script>
		<!-- Main -->
		<div id="main">
			<div class="inner">

				<h2>경매 글 작성</h2>
				<form method="post" action="/auction/newAuctionSubmitted.do">
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
					
					
					<<!-- pre>복용기간		     	 <input type="text" name="ingestion_start" id="datepicker1"> ~ <input
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

		<!-- Scripts -->
		<script src="assets/js/jquery.min.js"></script>
		<script src="assets/js/browser.min.js"></script>
		<script src="assets/js/breakpoints.min.js"></script>
		<script src="assets/js/util.js"></script>
		<script src="assets/js/main.js"></script>

		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
			integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
			crossorigin="anonymous"></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
			integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
			crossorigin="anonymous"></script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
			integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
			crossorigin="anonymous"></script>
</body>
</html>