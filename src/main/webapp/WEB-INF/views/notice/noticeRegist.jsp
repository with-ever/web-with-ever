<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"	scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="submenu" content="notice" />
<title>공지사항 등록</title>
</head>

<body>

	<div class="container">
	<form class="form-horizontal" action="${ctx}/notice/" method="post">
		<div class="form-group">
	    	<label for="title" class="col-md-2 control-label">제목</label>
	    	<div class="col-md-10">
	    		<input type="text" class="form-control" placeholder="제목" id="title" name="title" />
			</div>
		</div>
		<div class="form-group">
	    	<label for="content" class="col-md-2 control-label">내용</label>
	    	<div class="col-md-10">
	    		<input type="text" class="form-control" placeholder="내용" id="content" name="content" />
			</div>
		</div>
		<div class="form-group">
    	<div class="col-sm-offset-2 col-sm-10">
      		<button type="submit" class="btn btn-default">등록</button>
    		</div>
  		</div>
	</form>
	</div>
</body>
</html>