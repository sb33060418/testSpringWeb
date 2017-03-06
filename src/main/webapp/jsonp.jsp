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
			        url: 'http://127.10.0.1:8080/testSpringWeb/jsonp',
			        dataType: 'jsonp',
			        callback: 'JsonpCallback', 
			        contentType: 'application/jsonp;charset=UTF-8',
			    }).done(function (result) {
			     alert("done:"+result+":"+result.status);  
			        //TODO
			    }).fail(function (result, textStatus, info) {
			     alert("fail:"+result+":"+textStatus+":"+info);  
			    //TODO
			    });
			})
			$(window).load(function(){
				$.ajax({
			        url: 'http://127.10.0.1:8080/testSpringWeb/jsonp?callback=JsonpCallback',
			        dataType: 'jsonp',
			        contentType: 'application/jsonp;charset=UTF-8',
			    });
			})
		    function JsonpCallback(result) {  
		        alert(result);  
		        for(var i in result) {  
		            alert(i+":"+result[i]);//循环输出a:1,b:2,etc.  
		        }  
		    }  
		</script>
</head>
<body>
<!-- 		<script type="text/javascript">  
		    function jsonpCallback(result) {  
		        alert(result);  
		        for(var i in result) {  
		            alert(i+":"+result[i]);//循环输出a:1,b:2,etc.  
		        }  
		    }  
		    var JSONP=document.createElement("script");  
		    JSONP.type="text/javascript";  
		    JSONP.src="http://localhost:8080/testSpringWeb/jsonp?callback=jsonpCallback";  
		    document.getElementsByTagName("head")[0].appendChild(JSONP);  
		</script>   -->
</body>
</html>
