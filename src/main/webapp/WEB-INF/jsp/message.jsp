<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<title>DM</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<noscript>
	<link rel="stylesheet" href="assets/css/noscript.css" />
</noscript>
<style>
.chatbox {
	padding: 10px 0;
	width: 100%;
}
</style>
</head>
<body class="is-preload">
	<!-- Wrapper -->
	<form action="/message/sending.do" method="POST">
	<div id="wrapper">
		<div style="width: 400px;">
			<div class="bg-dark text-white "
				style="width: 400px; height: 80px; display: table;">
				<span class="align-middle"
					style="display: table-cell; padding: 0 0 0 20px;">${receiver}님과의 대화</span>
				<!-- <a href="message_list.jsp">DM리스트</a> -->
				<a href="/user/message.do" class="button text-white"
					style="display: table-cell; padding: 20px;">DM리스트</a>
			</div>
			<c:forEach var="list" items="${contentList}">
			<c:choose>
				<c:when test="${usersession.username eq $contentList.username}">
					<div class="chatbox ">
						<div class="chatbox float-right">
							<label for="myMessage" class="float-right">나</label><br>
							<div class="d-inline-flex p-2 bg-light text-dark float-right"
								id="myMessage">${list.content }</div>
						</div>
					</div>
				</c:when>
				<c:otherwise>
					<div class="chatbox">
						<div class="chatbox ">
							<label for="buyerMessage">상대방</label><br>

							<div class="d-inline-flex p-2 bg-secondary text-white float-left"
								id="buyerMessage">${list.content}</div>
						</div>
					</div>
				</c:otherwise>
			</c:choose>
			</c:forEach>
		</div>
		<br>
		<div class="form-group">
			<label for="exampleFormControlTextarea1">메시지 보내기</label>
			<textarea class="form-control" id="exampleFormControlTextarea1"
				rows="3" style="width: 400px;" placeholder="이곳에 메세지를 작성하세요." name="content"></textarea>
				<input type="hidden" id="receiverUsername" name="receiverUsername">
		</div>
		<input type="submit" value="Send Message" class="primary" />

	</div>
	</form>

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