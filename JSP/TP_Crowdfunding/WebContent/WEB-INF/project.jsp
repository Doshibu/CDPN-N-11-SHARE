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
<title>Insert title here</title>
</head>
<body>
	<a href="projectList"><span class="action">back to list</span></a>
	<div class="container">
		<div class="form">
			<form method="post">
				<input type="hidden" value="${curentProjectPresentation.id}">
				<c:choose>
					<c:when test="${editionMode}">

						<div>
							<input type="text" name = "nameInput" value="${curentProjectPresentation.name}" />
						</div>
						<div>
							<button name="saveAction">edit</button>
						</div>
					</c:when>
					<c:otherwise>
						<div>
							<c:out value="${curentProjectPresentation.name}"></c:out>
						</div>
						<div>
							<button name="editionModeAction">edit</button>
						</div>
					</c:otherwise>
				</c:choose>
			</form>
		</div>
	</div>
</body>
</html>