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
<form method="post">
<table>
<%
List<Item> itemList = (List<Item>)request.getAttribute("itemList");
for(Item item : itemList){
%>
<tr>
<td>
<input type="hidden" name=<%="idInput-".concat(item.getId().toString())%> value=<%=item.getId()%>>
<input type="checkbox" name=<%="checkboxInput-".concat(item.getId().toString())%> <%= (item.getDone())?"checked":""%>></td>
<td><%= item.getDescription()%></td>
<tr>
<%	
}
%>
</table>
<button name="updateItems">sauvegarder</button>
</form>
<form method="post">
<label for="newItemDescInput">nouvel item : </label><input id="newItemDescInput" name="newItemDescInput" type="text" />
<button name="addItem">Ajouter un item</button>
</form>
</body>
</html>