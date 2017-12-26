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
			        url: 'http://localhost:8080/testSpringWeb/json/y',
			        dataType: 'json'
			    }).done(function (result) {
			    	//TODO
			    	alert("done:"+result+":"+result.status);  
			    }).fail(function (result, textStatus, info) {
			    	//TODO
			    	alert("fail:"+result+":"+textStatus+":"+info);  
			    });
			})
		</script>
	</head>
	<body>
	</body>
</html>
