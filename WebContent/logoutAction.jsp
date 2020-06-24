<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html" charset="UTF-8">
<meta name="viewport" content="width=device-width" , initial-scale="1">
<link rel=stylesheet href=css/bootstrap.css>
<title>JSP 게시판 웹사이트</title>
</head>
<body>
	<%
		session.invalidate();
	%>
	<script type="text/javascript">
		location.href = 'main.jsp';
	</script>
</body>
</html>