<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href = "resources/css/clip.css">
<style>
  a:hover {
    color: #BDBDBD;
    transition-duration: 0.5s;
    transition-property: all;
  }
</style>
</head>
<body>
	<div class="menu">
		<a class="menu-item" href="gongji">공지</a>
		<a class="menu-item" href="clip" >핫클립</a>
	</div>
	<div class="time-menu">
		<a class="menu-item" href="">TODAY</a>
		<a class="menu-item" href="">WEEK</a>
		<a class="menu-item" href="">MONTH</a>
	</div>
	<div>
		<c:forEach var="c" items="${clip }">
			<a href="${c.c_url}">${c.c_title } ${c.c_view }</a><p>
		</c:forEach>
	</div>
</body>
</html>