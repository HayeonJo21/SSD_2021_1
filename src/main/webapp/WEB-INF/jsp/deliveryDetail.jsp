<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="IncludeTop.jsp"%>

	<h2>용달 서비스 정보</h2>
	<div class="table-wrapper">
				<table>
					<thead>
						<tr>
							<th>Item</th>
							<th>Description</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>서비스 제공자</td>
							<td>${delivery.username}</td>
							
						</tr>
						<tr>
							<td>출발지</td>
							<td>${delivery.address1 }</td>
							
						</tr>
						<tr>
							<td>도착지</td>
							<td>${delivery.address2 }</td>
							
						</tr>
						<tr>
							<td>서비스 날짜</td>
							<td>${delivery.serviceDate }</td>
							
						</tr>
						<tr>
							<td>가격</td>
							<td>${delivery.price }</td>
							
						</tr>
					</tbody>
				</table>
			</div>
<%@ include file="IncludeBottom.jsp"%>

