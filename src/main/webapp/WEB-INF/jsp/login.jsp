<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="IncludeTop.jsp"%>
		<!-- Main -->
		<div id="main">
			<div style="float:right; padding-right:100px">
				<a href="#" class="button primary">&nbsp;&nbsp;&nbsp;&nbsp;Admin&nbsp;&nbsp;&nbsp;&nbsp;</a>
			</div>
			<div class="inner">
				<h1>Login</h1>
				<label for="inputUsername" class="visually-hidden" style="font-size:24px">Username</label>
				<input type="text" style="width:420px" id="username" placeholder="Username" required autofocus>
				<p><p>
				<label for="inputPassword" class="visually-hidden" style="font-size:24px">Password</label>
				<input type="password" style="width:420px" id=password" placeholder="Password" required>
				<ul class="actions">
					<li><a href="#" class="button">&nbsp;&nbsp;&nbsp;&nbsp;Login&nbsp;&nbsp;&nbsp;&nbsp;</a></li>
					<li><a href="/user/insertAccount.do" class="button">&nbsp;&nbsp;Register&nbsp;&nbsp;</a></li>
				</ul>
			</div>
		</div>
		<%@ include file="IncludeBottom.jsp"%>