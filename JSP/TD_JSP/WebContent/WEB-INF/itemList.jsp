<%@page import="fr.imie.Item"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<%
List<Item> itemList = (List<Item>)request.getAttribute("itemList");
for(Item item : itemList){
%>
<tr>
<td><input type="checkbox" <%= (item.getDone())?"checked":""%>></td>
<td><%= item.getDescription()%></td>
<tr>
<%	
}
%>
</table>
</body>
</html>