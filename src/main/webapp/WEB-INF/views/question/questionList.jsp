<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"	scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>질문 목록</title>
<script>
	function ajax() {
		
	}
</script>
</head>
<body>
	<div class="container">
		<table class="table table-bordered">
			<thead>
			<tr>
				<th>ID</th>
				<th>QUIZ_ID</th>
				<th>USER_ID</th>
				<th>REGDATE</th>			
			</tr>
			</thead>
			<tbody>
			<c:forEach var="question" items="${questions }">
			<tr>
				<td><a href="${ctx}/question/${question.id }">${question.id }</a></td>
				<td>${question.qid }</td>
				<td>${question.uid }</td>
				<td>${question.regdate }</td>
			</tr>
			</c:forEach>
			</tbody>
		</table>
		
		<a class="btn btn-default" href="${ctx}/question/regist">등록</a>
		<a class="btn btn-default" href="javascript:ajax();">ajax json call</a>
	</div>
</body>
</html>