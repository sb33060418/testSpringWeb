<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>teacher</title>
	<script type="text/javascript" src="<%=path %>/resources/js/jquery-3.2.0.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			list();
			var ajaxOption = null;
			$("#saveButton").click(function(){
				save();
			});
		});
		function list(){
			$.ajax({
				url:"teacher/list",
				dataType:"json",
				success:function(data){
					$("#listBody").empty();
					$.each(data.list, function(i, item){
						var teacherTr = "<tr><form name='updateForm_"+item.id+"' action='teacher/update' method='POST'>"
							+"<td><input type='hidden' name='id' id='id_"+item.id+"' value='"+item.id+"'/>"+item.id+"</td>"
							+"<td><input type='text' name='name' id='name_"+item.id+"' value='"+item.name+"' /></td>"
							+"<td><input type='text' name='age' id='age_"+item.id+"' value='"+item.age+"' /></td>"
							+"<td><a href='javascript:void(0);' onclick='get("+item.id+");'>get</a>&nbsp;"
							+"<a href='javascript:void(0);' onclick='remove("+item.id+");'>remove</a>&nbsp;"
							+"<input type='submit' value='update' id='updateButton_"+item.id+"' onclick='update("+item.id+");' /></td></tr>";
							//alert(teacherTr);
						$("#listBody").append(teacherTr);
					});
					count();
				}
			});
		}
		function count(){
			$.ajax({
				url:"teacher/count",
				dataType:"json",
				success:function(data){
					$("#count").html(data.count);
				}
			});
		}
		function save(){
			$("#saveButton").attr("disabled", true);
			$.ajax({
				url:"teacher/save",
				type:"POST",
				data:"name="+$("#name").val()+"&"+"age="+$("#age").val(),
				dataType:"json",
				complete:function(){
					$("#saveButton").attr("disabled", false);
				},
				success:function(data){
					alert(data.status);
					list();
				}
			});
		}
		function get(id){
			$.ajax({
				url:"teacher/get",
				data:"id="+id,
				dataType:"json",
				success:function(data){
					var teacherInfo = "id:"+data.teacher.id+"\nname:"+data.teacher.name+"\nage:"+data.teacher.age;
					alert(teacherInfo);
				}
			});
		}
		function remove(id){
			$.ajax({
				url:"teacher/remove",
				data:"id="+id,
				dataType:"json",
				success:function(data){
					alert(data.status);
					list();
				}
			});
		}
		function update(id){
			$("#updateButton_"+id).attr("disabled", true);
			$.ajax({
				url:"teacher/update",
				type:"POST",
				data:"id="+id+"&name="+$("#name_"+id).val()+"&"+"age="+$("#age_"+id).val(),
				dataType:"json",
				complete:function(data){
					$("#updateButton_"+id).attr("disabled", false);
				},
				success:function(data){
					alert(data.status);
					list();
				}
			});
		}
	</script>
</head>
<body>
	save
	<form name="saveForm" action="teacher/save" method="POST">
		name:<input type="text" name="name" id="name" /> 
		<br /> 
		age:<input type="text" name="age" id="age" /> 
		<br /> 
		<input type="button" value="save" id="saveButton" />
	</form>
	count:<span id="count"></span>
	<br/>
	list
	<table border="1">
		<thead>
			<tr>
				<td>id</td>
				<td>name</td>
				<td>age</td>
				<td>操作</td>
			</tr>
		</thead>
		<tbody id="listBody">
			<c:forEach items="${list }" var="teacher">
				<tr>
					<form name="updateForm_${teacher.id}" action="teacher/update" method="POST">
					<td><input type="hidden" name="id" id="id" value="${teacher.id}" />${teacher.id}</td>
					<td><input type="text" name="name" id="name" value="${teacher.name}" /></td>
					<td><input type="text" name="age" id="age" value="${teacher.age}" /></td>
					<td><a href="javascript:void(0);" onclick="get(${teacher.id});">get</a>&nbsp;<a href="javascript:void(0);" onclick="remove(${teacher.id});">remove</a>&nbsp;<input type="submit" value="update" id="updateButton_${teacher.id}" /></td>
					</form>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>