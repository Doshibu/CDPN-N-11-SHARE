<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/main.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Project List</title>
</head>
<body>
	<div class="container">
		<c:forEach items="${projectListPresentation}" var="project">
			<c:url value="project" var="url">
				<c:param name="id" value="${project.id}">
				</c:param>
			</c:url>
			<a href="${url}">
				<div class="card">
					<div>
						<c:out value="${project.name}"></c:out>
					</div>
					<div>
						<c:out value="${project.goal}"></c:out>
					</div>
					<div>
						<c:out value="${project.description}"></c:out>
					</div>
					<div>
						<progress value="${project.currentFunding}" max="${project.goal}">${project.currentFunding}</progress>
					</div>
					<div>
						<c:out value="${project.currentFunding}"></c:out>
					</div>
				</div>
			</a>
		</c:forEach>
	</div>
</body>
</html>