<%@ page language="java" pageEncoding="utf-8"%>
<%@ page contentType="text/html ; charset=UTF-8"%>
<html>
<head>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">  
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
		<script type="text/javascript" src ="resources/js/jquery.js"></script>
</head>
<body>
<iframe src="refer.jsp"></iframe>
<a href="refer.jsp">refer</a>
<iframe src="javascript:'<script>function abc(o){alert(o);}</script><script src=http://127.10.0.1:8080/testSpringWeb/jsonp?callback=abc></script>'"></iframe>
</body>
</html>
