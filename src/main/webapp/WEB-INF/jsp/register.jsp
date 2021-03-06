<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="IncludeTop.jsp"%>
<!-- Main -->
<div id="main">
	<div class="inner">
		<h1>๐ Register Page</h1>
		<div class="col-sm-6 col-md-offset-3">
			<form:form modelAttribute="accountForm"
				action="/delivery/newUserSubmitted.do" method="post">
				<div class="form-group"> 
					<label for="account.username" style="font-size: 24px">Username</label>
					<input type="text" style="width: 800px" class="form-control"
						name="username" value="${userSession.username}"
						placeholder="๋ก๊ทธ์ธ ์ ์ฌ์ฉํ  ์ด๋ฆ์ ์๋ ฅํด ์ฃผ์ธ์.">
					<form:errors path="username" style="color:#E16A93; font-size:28px;" />
				</div>
				<div class="form-group">
					<label for="password1" style="font-size: 24px">Password</label> <input
						type="password" style="width: 800px" class="form-control"
						name="password" value="${userSession.password}"
						placeholder="๋น๋ฐ๋ฒํธ๋ฅผ ์๋ ฅํด ์ฃผ์ธ์.">
					<form:errors path="password" style="color:#E16A93; font-size:28px;" />
				</div>
				<div class="form-group">
					<label for="password2" style="font-size: 24px">Password
						Check</label> <input type="password" style="width: 800px"
						class="form-control" name="password2" placeholder="๋น๋ฐ๋ฒํธ๋ฅผ ์๋ ฅํด ์ฃผ์ธ์.">
					<form:errors path="password2" style="color:#E16A93; font-size:28px;" />
				</div>
				<div class="form-group row">
					<label for="firstName" class="col-lg-2 col-form-label"
						style="font-size: 24px">FirstName</label>
					<div class="col-lg-10">
						&nbsp;<input type="text" name="firstName"
							value="${userSession.firstName}" class="form-control"
							placeholder="๊ธธ๋">
						<form:errors path="firstName"
							style="color:#E16A93; font-size:28px;" />
					</div>
					<label for="lastName" class="col-lg-2 col-form-label"
						style="font-size: 24px">LastName</label>
					<div class="col-lg-10">
						&nbsp;<input type="text" name="lastName"
							value="${userSession.lastName}" class="form-control"
							placeholder="ํ">
						<form:errors path="lastName"
							style="color:#E16A93; font-size:28px;" />
					</div>
				</div>
				<div class="form-group">
					<label for="email" style="font-size: 24px">Email</label> <input
						type="text" style="width: 800px" class="form-control" name="email"
						value="${userSession.email}" placeholder="kildongHong@naver.com">
					<form:errors path="email" style="color:#E16A93; font-size:28px;" />
				</div>
				<div class="form-group">
					<label for="address" style="font-size: 24px">Address</label> <input
						type="hidden" style="width: 800px" class="form-control"
						name="address" value="${userSession.address}">
					
					<!-- ๋๋ก๋ช์ฃผ์ api ํ์ฉ -->
					<input type="text" id="sample2_postcode" name="postcode"
						placeholder="์ฐํธ๋ฒํธ"> <input type="button"
						class="button small" onclick="sample2_execDaumPostcode()"
						value="์ฐํธ๋ฒํธ ์ฐพ๊ธฐ" name="postcode"> <br> <input
						type="text" id="sample2_address" placeholder="์ฃผ์" name="address2">
						<form:errors path="address2" style="color:#E16A93; font-size:28px;" />
					<br> <input type="text" id="sample2_detailAddress"
						placeholder="์์ธ์ฃผ์" name="detailAddress"> <input
						type="text" id="sample2_extraAddress" placeholder="(๋)"
						name="extraAddress">
					
					<!-- iOS์์๋ position:fixed ๋ฒ๊ทธ๊ฐ ์์, ์ ์ฉํ๋ ์ฌ์ดํธ์ ๋ง๊ฒ position:absolute ๋ฑ์ ์ด์ฉํ์ฌ top,left๊ฐ ์กฐ์  ํ์ -->
					<div id="layer"
						style="display: none; position: fixed; overflow: hidden; z-index: 1; -webkit-overflow-scrolling: touch;">
						<img src="//t1.daumcdn.net/postcode/resource/images/close.png"
							id="btnCloseLayer"
							style="cursor: pointer; position: absolute; right: -3px; top: -3px; z-index: 1"
							onclick="closeDaumPostcode()" alt="๋ซ๊ธฐ ๋ฒํผ">
					</div>
				</div>
				<script
					src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js">
					
				</script>
				<script>
					// ์ฐํธ๋ฒํธ ์ฐพ๊ธฐ ํ๋ฉด์ ๋ฃ์ element
					var element_layer = document.getElementById('layer');

					function closeDaumPostcode() {
						// iframe์ ๋ฃ์ element๋ฅผ ์๋ณด์ด๊ฒ ํ๋ค.
						element_layer.style.display = 'none';
					}

					function sample2_execDaumPostcode() {
						new daum.Postcode(
								{
									oncomplete : function(data) {
										// ๊ฒ์๊ฒฐ๊ณผ ํญ๋ชฉ์ ํด๋ฆญํ์๋ ์คํํ  ์ฝ๋๋ฅผ ์์ฑํ๋ ๋ถ๋ถ.

										// ๊ฐ ์ฃผ์์ ๋ธ์ถ ๊ท์น์ ๋ฐ๋ผ ์ฃผ์๋ฅผ ์กฐํฉํ๋ค.
										// ๋ด๋ ค์ค๋ ๋ณ์๊ฐ ๊ฐ์ด ์๋ ๊ฒฝ์ฐ์ ๊ณต๋ฐฑ('')๊ฐ์ ๊ฐ์ง๋ฏ๋ก, ์ด๋ฅผ ์ฐธ๊ณ ํ์ฌ ๋ถ๊ธฐ ํ๋ค.
										var addr = ''; // ์ฃผ์ ๋ณ์
										var extraAddr = ''; // ์ฐธ๊ณ ํญ๋ชฉ ๋ณ์

										//์ฌ์ฉ์๊ฐ ์ ํํ ์ฃผ์ ํ์์ ๋ฐ๋ผ ํด๋น ์ฃผ์ ๊ฐ์ ๊ฐ์ ธ์จ๋ค.
										if (data.userSelectedType === 'R') { // ์ฌ์ฉ์๊ฐ ๋๋ก๋ช ์ฃผ์๋ฅผ ์ ํํ์ ๊ฒฝ์ฐ
											addr = data.roadAddress;
										} else { // ์ฌ์ฉ์๊ฐ ์ง๋ฒ ์ฃผ์๋ฅผ ์ ํํ์ ๊ฒฝ์ฐ(J)
											addr = data.jibunAddress;
										}

										// ์ฌ์ฉ์๊ฐ ์ ํํ ์ฃผ์๊ฐ ๋๋ก๋ช ํ์์ผ๋ ์ฐธ๊ณ ํญ๋ชฉ์ ์กฐํฉํ๋ค.
										if (data.userSelectedType === 'R') {
											// ๋ฒ์ ๋๋ช์ด ์์ ๊ฒฝ์ฐ ์ถ๊ฐํ๋ค. (๋ฒ์ ๋ฆฌ๋ ์ ์ธ)
											// ๋ฒ์ ๋์ ๊ฒฝ์ฐ ๋ง์ง๋ง ๋ฌธ์๊ฐ "๋/๋ก/๊ฐ"๋ก ๋๋๋ค.
											if (data.bname !== ''
													&& /[๋|๋ก|๊ฐ]$/g
															.test(data.bname)) {
												extraAddr += data.bname;
											}
											// ๊ฑด๋ฌผ๋ช์ด ์๊ณ , ๊ณต๋์ฃผํ์ผ ๊ฒฝ์ฐ ์ถ๊ฐํ๋ค.
											if (data.buildingName !== ''
													&& data.apartment === 'Y') {
												extraAddr += (extraAddr !== '' ? ', '
														+ data.buildingName
														: data.buildingName);
											}
											// ํ์ํ  ์ฐธ๊ณ ํญ๋ชฉ์ด ์์ ๊ฒฝ์ฐ, ๊ดํธ๊น์ง ์ถ๊ฐํ ์ต์ข ๋ฌธ์์ด์ ๋ง๋ ๋ค.
											if (extraAddr !== '') {
												extraAddr = ' (' + extraAddr
														+ ')';
											}
											// ์กฐํฉ๋ ์ฐธ๊ณ ํญ๋ชฉ์ ํด๋น ํ๋์ ๋ฃ๋๋ค.
											document
													.getElementById("sample2_extraAddress").value = extraAddr;

										} else {
											document
													.getElementById("sample2_extraAddress").value = '';
										}

										// ์ฐํธ๋ฒํธ์ ์ฃผ์ ์ ๋ณด๋ฅผ ํด๋น ํ๋์ ๋ฃ๋๋ค.
										document
												.getElementById('sample2_postcode').value = data.zonecode;
										document
												.getElementById("sample2_address").value = addr;
										// ์ปค์๋ฅผ ์์ธ์ฃผ์ ํ๋๋ก ์ด๋ํ๋ค.
										document.getElementById(
												"sample2_detailAddress")
												.focus();

										// iframe์ ๋ฃ์ element๋ฅผ ์๋ณด์ด๊ฒ ํ๋ค.
										// (autoClose:false ๊ธฐ๋ฅ์ ์ด์ฉํ๋ค๋ฉด, ์๋ ์ฝ๋๋ฅผ ์ ๊ฑฐํด์ผ ํ๋ฉด์์ ์ฌ๋ผ์ง์ง ์๋๋ค.)
										element_layer.style.display = 'none';
									},
									width : '100%',
									height : '100%',
									maxSuggestItems : 5
								}).embed(element_layer);

						// iframe์ ๋ฃ์ element๋ฅผ ๋ณด์ด๊ฒ ํ๋ค.
						element_layer.style.display = 'block';

						// iframe์ ๋ฃ์ element์ ์์น๋ฅผ ํ๋ฉด์ ๊ฐ์ด๋ฐ๋ก ์ด๋์ํจ๋ค.
						initLayerPosition();
					}

					// ๋ธ๋ผ์ฐ์ ์ ํฌ๊ธฐ ๋ณ๊ฒฝ์ ๋ฐ๋ผ ๋ ์ด์ด๋ฅผ ๊ฐ์ด๋ฐ๋ก ์ด๋์ํค๊ณ ์ ํ์ค๋์๋
					// resize์ด๋ฒคํธ๋, orientationchange์ด๋ฒคํธ๋ฅผ ์ด์ฉํ์ฌ ๊ฐ์ด ๋ณ๊ฒฝ๋ ๋๋ง๋ค ์๋ ํจ์๋ฅผ ์คํ ์์ผ ์ฃผ์๊ฑฐ๋,
					// ์ง์  element_layer์ top,left๊ฐ์ ์์ ํด ์ฃผ์๋ฉด ๋ฉ๋๋ค.
					function initLayerPosition() {
						var width = 300; //์ฐํธ๋ฒํธ์๋น์ค๊ฐ ๋ค์ด๊ฐ element์ width
						var height = 400; //์ฐํธ๋ฒํธ์๋น์ค๊ฐ ๋ค์ด๊ฐ element์ height
						var borderWidth = 5; //์ํ์์ ์ฌ์ฉํ๋ border์ ๋๊ป

						// ์์์ ์ ์ธํ ๊ฐ๋ค์ ์ค์  element์ ๋ฃ๋๋ค.
						element_layer.style.width = width + 'px';
						element_layer.style.height = height + 'px';
						element_layer.style.border = borderWidth + 'px solid';
						// ์คํ๋๋ ์๊ฐ์ ํ๋ฉด ๋๋น์ ๋์ด ๊ฐ์ ๊ฐ์ ธ์์ ์ค์์ ๋ฐ ์ ์๋๋ก ์์น๋ฅผ ๊ณ์ฐํ๋ค.
						element_layer.style.left = (((window.innerWidth || document.documentElement.clientWidth) - width) / 2 - borderWidth)
								+ 'px';
						element_layer.style.top = (((window.innerHeight || document.documentElement.clientHeight) - height) / 2 - borderWidth)
								+ 'px';
					}
				</script>
				<div class="form-group">
					<label for="phone" style="font-size: 24px">Phone Number</label> <input
						type="text" style="width: 800px" class="form-control" name="phone"
						value="${userSession.phone}" placeholder="010-0000-0000">
					<form:errors path="phone" style="color:#E16A93; font-size:28px;" />
				</div>
				<div class="form-group">
					<input type="hidden" style="width: 800px" class="form-control"
						name="favoriteUser" value="null" placeholder="์ ํธํ๋ ๋งค์ฅ์ ์๋ ฅํ์ธ์.">
				</div>
				<div class="form-group">
					<input type="hidden" style="width: 800px" class="form-control"
						name="languagePreference" value="null" placeholder="Korean">
				</div>
				<div class="form-group">
					<label for="carInfo" style="font-size: 24px">Car
						Information</label> <input type="text" style="width: 800px"
						class="form-control" name="carInfo" value="${userSession.carInfo}"
						placeholder="์์ ํ ์ฐจ๋์ ์ ๋ณด๋ฅผ ์๋ ฅํ์ธ์.">
					<form:errors path="carInfo" style="color:#E16A93; font-size:28px;" />
					<br> <br>

				</div>
				<div class="form-group" style="text-align: center">
					<button type="submit" id="join-submit" class="button primary">
						ํ์๊ฐ์<i class="fa fa-check spaceLeft"></i>
					</button>
					<a class="button" href="/">๊ฐ์์ทจ์<i class="fa fa-times spaceLeft"></i></a>
				</div>
			</form:form>
		</div>
	</div>
</div>
<%@ include file="IncludeBottom.jsp"%>