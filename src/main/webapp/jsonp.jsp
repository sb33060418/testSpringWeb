<%@ page language="java" pageEncoding="utf-8"%>
<%@ page contentType="text/html ; charset=UTF-8"%>
<html>
	<head>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<script type="text/javascript" src="resources/js/jquery.js"></script>
		<!-- jquery方法一：不指定回调函数名，jquery随机生成 -->
		<script>
			$(window).load(function(){
				$.ajax({
			        url: 'http://127.0.0.1:8080/testSpringWeb/jsonp',
			        dataType: 'jsonp',
			        success:function (result) {
				    	//TODO
				    	alert("ajax.jsonp:"+result.status);  
				    }
			    });
			})
		</script>
		<!-- jquery方法二：指定回调函数名 -->
		<script>
			$(window).load(function(){
				$.ajax({
			        url: 'http://127.0.0.1:8080/testSpringWeb/jsonp',
			        dataType: 'jsonp',
			        jsonpCallback: 'ajaxCallback', 
			        contentType: 'application/jsonp;charset=UTF-8',
			    }).done(function (result) {
			    	//TODO
			    	alert("ajax.done:"+result.status);  
			    }).fail(function (result, textStatus, info) {
			    	//TODO
			    	alert("ajax.fail:"+result+":"+textStatus+":"+info);  
			    });
			})
		    function ajaxCallback(result) {  
		        //alert(result);  
		        for(var i in result) {  
		            alert("ajax.callback:"+i+"="+result[i]);//循环输出a:1,b:2,etc.  
		        }  
		    } 
		</script>
	</head>
	<body>
		<!-- 通过创建script标签访问   -->
		<script type="text/javascript">
		    function documentCallback(result) {  
		        //alert(result);  
		        for(var i in result) {  
		            alert("document.callback:"+i+"="+result[i]);//循环输出a:1,b:2,etc.  
		        }  
		    }  
		    var JSONP=document.createElement("script");  
		    JSONP.type="text/javascript";  
		    JSONP.src="http://localhost:8080/testSpringWeb/jsonp?callback=documentCallback";  
		    document.getElementsByTagName("head")[0].appendChild(JSONP);  
		</script>
		<!-- 通过iframe访问 -->
		<iframe
			src="javascript:'<script>function iframe(o){alert(\'iframe.callback:\'+o.status);}</script><script src=http://127.0.0.1:8080/testSpringWeb/jsonp?callback=iframe></script>'"></iframe>
	</body>
</html>
