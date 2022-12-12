<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원정보확인</title>
</head>
<body>
회원정보를 출력해주세요.
<h2>회원정보</h2>
	<table border="1">
		<tr>
			<th>아 이 디</th>
			<th>회원이름</th>
		</tr>
	<c:forEach items="${memberInfo}" var="member">
		<tr>
			<td>${member.userId}</td>
			<td>${member.userName}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>