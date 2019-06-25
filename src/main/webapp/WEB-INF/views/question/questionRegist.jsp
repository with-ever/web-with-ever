<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"	scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="submenu" content="question" />
<title>질문 등록</title>
</head>
<body>
	<div class="container">
		<form class="form-horizontal" action="${ctx}/question/" method="post">			
			<div class="form-group">
			    <label for="content" class="col-sm-2 control-label">내용</label>
			    <div class="col-sm-10">
			      <input type="textbox" class="form-control" id="content" placeholder="내용" name="content">
			    </div>
		  	</div>
			
			<div class="form-group">
			    <label for="answer" class="col-sm-2 control-label">정답</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="answer" placeholder="정답" name="answer">
			    </div>
		  	</div>
	
			<input type="submit" value="등록" class="btn btn-default btn-primary"/>
			<input type="reset" value="취소" class="btn btn-default"/>
		</form>
	</div>
</body>
</html>