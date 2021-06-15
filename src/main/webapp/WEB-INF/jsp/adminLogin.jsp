<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="IncludeTop.jsp"%>
		<!-- Main -->
		<div id="main">
			<div class="inner">
				<h1 style="color: purple">Administrator Login</h1>
				<form action="/delivery/signon.do" method="POST">
				<c:if test="${data ne null}">
					<p style="color: red">${data.message}</p>
				 </c:if>
				<label for="username" class="visually-hidden" style="font-size:24px">Username</label>
				<input type="text" style="width:420px" id="username" name="username" placeholder="Username" required autofocus>
				<p/><p/>
				<label for="password" class="visually-hidden" style="font-size:24px">Password</label>
				<input type="password" style="width:420px" id=password" name="password" placeholder="Password" required>
				
				<ul class="actions">
					<li><button type="submit" >&nbsp;&nbsp;&nbsp;&nbsp;Login&nbsp;&nbsp;&nbsp;&nbsp;</button></li>
				</ul></form>
			</div>
		
		</div>
<%@ include file="IncludeBottom.jsp"%>