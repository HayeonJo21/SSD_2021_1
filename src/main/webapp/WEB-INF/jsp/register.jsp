<%@ include file="IncludeTop.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
function userCreate() {
	if (form.username.value == "") {
		alert("사용자 이름을 입력하십시오.");
		form.username.focus();
		return false;
	} 
	if (form.password1.value == "") {
		alert("비밀번호를 입력하십시오.");
		form.user_password.focus();
		return false;
	}
	if (form.password1.value != form.password2.value) {
		alert("비밀번호가 일치하지 않습니다.");
		form.password2.focus();
		return false;
	}
	if (form.fistName.value == "") {
		alert("이름을 입력하십시오.");
		form.firstName.focus();
		return false;
	}
	if (form.lastName.value == "") {
		alert("이름을 입력하십시오.");
		form.lastName.focus();
		return false;
	}
	if (form.address.value == "") {
		alert("주소를 입력하십시오.");
		form.address.focus();
		return false;
	}
	if (form.phone.value == "") {
		alert("전화번호를 입력하십시오.");
		form.phone.focus();
		return false;
	}
	var emailExp = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/;
	if(emailExp.test(form.email.value)==false) {
		alert("이메일 형식이 올바르지 않습니다.");
		form.email.focus();
		return false;
	}
	var phoneExp = /^\d{2,3}-\d{3,4}-\d{4}$/;
	if(phoneExp.test(form.phone.value)==false) {
		alert("전화번호 형식이 올바르지 않습니다.");
		form.phone.focus();
		return false;
	}
	
	form.submit();
}
	</script>
		<!-- Main -->
		<div id="main">
			<div class="inner">
				<h1>Register Page</h1>
				<div class="col-sm-6 col-md-offset-3">
					<form role="form" action="user/newUserSubmitted.do" method="post">
						<div class="form-group">
							<label for="username" style="font-size: 24px">UserName</label>
							<input type="text" style="width: 800px" class="form-control"
								name="username" placeholder="이름을 입력해 주세요.">
						</div>
						<div class="form-group">
							<label for="password1" style="font-size: 24px">Password</label>
							<input type="password" style="width: 800px" class="form-control"
								name="password1" placeholder="비밀번호를 입력해 주세요.">
						</div>
						<div class="form-group">
							<label for="password2" style="font-size: 24px">Password Check</label>
							<input type="password" style="width: 800px" class="form-control"
								name="password2" placeholder="비밀번호를 입력해 주세요.">
						</div>
						<div class="form-group row">
							<label for="fistName" class="col-lg-2 col-form-label" style="font-size: 24px">FirstName</label>
							<div class="col-lg-10">
								<input type="text" name="firstname" class="form-control"
									placeholder="길동">
							</div>
							<label for="lastName" class="col-lg-2 col-form-label" style="font-size: 24px">LastName</label>
							<div class="col-lg-10">
								<input type="text" name="lastName" class="form-control"
									placeholder="홍">
							</div>
						</div>
						<div class="form-group">
							<label for="email" style="font-size: 24px">Email</label>
							<input type="text" style="width: 800px" class="form-control"
								name="email" placeholder="kildongHong@naver.com">
						</div>
						<div class="form-group">
							<label for="address" style="font-size: 24px">Address</label>
							<input type="text" style="width: 800px" class="form-control"
								name="address" placeholder="주소를 입력해 주세요.">
						</div>
						<div class="form-group">
							<label for="phone" style="font-size: 24px">PhoneNumber</label> <input
								type="text" style="width: 800px" class="form-control"
								name="phone" placeholder="010-0000-0000">
						</div>
						<div class="form-group">
							<label for="favoriteMall" style="font-size: 24px">FavoriteMall</label>
							<input type="text" style="width: 800px" class="form-control"
								name="favoriteMall" placeholder="선호하는 매장을 입력하세요.">
						</div>
						<div class="form-group">
							<label for="languagePrefernce" style="font-size: 24px">LanguagePreference</label>
							<input type="text" style="width: 800px" class="form-control"
								name="languagePrefernce" placeholder="Korean">
						</div>
						<div class="form-group">
							<label for="carInfo" style="font-size: 24px">CarInfo</label>
							<input type="text" style="width: 800px" class="form-control"
								name="carInfo" placeholder="소유한 차량의 정보를 입력하세요.">
								<p><p><p><p>
						</div>
						<div class="col-6 col-12-small">
							<label style="font-size: 24px">Agree to Terms</label>
							<input type="checkbox" id="demo-human" name="demo-human">
							<label for="demo-human">약관에 동의 합니다.</label>
							<p><p><p><p>
							
						</div>
						<div class="form-group text-center">
							<button type="submit" id="join-submit" class="button primary" onClick="userCreate();return false;">
								회원가입<i class="fa fa-check spaceLeft"></i>
							</button>
							<button type="submit" class="btn btn-warning">
								가입취소<i class="fa fa-times spaceLeft"></i>
							</button>
						</div>
					</form>
				</div>
			</div>
		</div>

		<%@ include file="IncludeBottom.jsp"%>