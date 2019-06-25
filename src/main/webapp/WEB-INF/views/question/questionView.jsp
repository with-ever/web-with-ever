<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"	scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<table class="table table-bordered">
			<thead>
			<tr>
				<td width="15%"></td>
				<td width="85%"></td>
			</tr>
			</thead>
			<tbody>
			<tr>
				<td>QUESTION_ID</td>
				<td>${question.id }</td>
			</tr>
			<tr>
				<td>QUIZ_ID</td>
				<td>${question.qid }</td>
			</tr>
			<tr>
				<td>USER_ID</td>
				<td>${question.uid }</td>
			</tr>
			<tr>
				<td>CONTENT</td>
				<td>${question.content }</td>
			</tr>
			<tr>
				<td>REGDATE</td>
				<td>${question.regdate }</td>
			</tr>
			</tbody>
		</table>
		
		<a class="btn btn-default" href="${ctx}/question/${question.id}/modify">수정</a>
	</div>
</body>
</html>