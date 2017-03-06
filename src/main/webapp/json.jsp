<%@ page language="java" pageEncoding="utf-8"%>
<%@ page contentType="text/html ; charset=UTF-8"%>
<html>
<head>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">  
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
		<script type="text/javascript" src ="resources/js/jquery.js"></script>
		<script>
			$(window).load(function(){
				$.ajax({
			        url: 'http://localhost:8080/testSpringWeb/json1',
			        dataType: 'json'
			    }).done(function (result) {
			     alert(result+":"+result.status);  
			        //TODO
			    }).fail(function (result, textStatus, info) {
			    //TODO
			    });
			})
		</script>
</head>
<body>
</body>
</html>
