<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="IncludeTop.jsp"%>
<style>
.chatbox {
	padding: 10px 0;
	width: 100%;
}
</style>

<!-- Wrapper -->
<form action="/delivery/messageSend.do" method="POST">
	<div id="wrapper">
		<div id="main">
			<div class="inner">
				<h1>Your Message</h1>
				<div style="width: 400px;">
					<div class="bg-dark text-white "
						style="width: 400px; height: 80px; display: table;">
						<span class="align-middle"
							style="display: table-cell; padding: 0 0 0 20px;">${receiver}님 과의
							대화</span> 
						<!-- <a href="message_list.jsp">DM리스트</a> -->
						<a href="/delivery/message.do" class="button text-white"
							style="display: table-cell; padding: 20px;">DM리스트</a>
					</div>

					<c:forEach var="list" items="${contentList}">
						<c:choose>
							<c:when test="${username eq list.senderUsername}">
								<div class="chatbox ">
									<div class="chatbox float-right">
										<label for="myMessage" class="float-right">나</label><br>
										${list.messageDate }
										<div class="d-inline-flex p-2 bg-light text-dark float-right"
											id="myMessage">${list.content}</div>
									</div>
								</div>
							</c:when>
							<c:otherwise>
								<div class="chatbox">
									<div class="chatbox ">
										<label for="buyerMessage">${list.senderUsername}</label><br>

										${list.messageDate }
										<div
											class="d-inline-flex p-2 bg-secondary text-white float-left"
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
						rows="3" style="width: 400px;" placeholder="이곳에 메세지를 작성하세요."
						name="content"></textarea>
					<input type="hidden" id="receiverUsername" name="receiverUsername"
						value="${receiver}">
				</div>
				<input type="submit" value="Send Message" class="primary" />
			</div>
		</div>
	</div>
</form>
<%@ include file="IncludeBottom.jsp"%>