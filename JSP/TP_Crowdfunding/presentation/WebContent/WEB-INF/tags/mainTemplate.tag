<%@tag description="main teplate of crowdfunding Site"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/main.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Crowdfunding Site</title>
</head>
<body>
	<div class="mainView">
		<div class="header">
		<span>Application de crowdFunding</span>
		<form method="post" action="login">
			<button name="logoutAction">log out</button>
		</form>
		</div>
		<div class="middle">
			<div class="menu" style="flex-basis: 180px;">
				<a href="projectList?mode=current"><div class="navigation">projet en cours</div></a>
				<a href="projectList?mode=funded"><div class="navigation">projets financés</div></a>
			</div>
			<div class="content">
				<jsp:doBody />
			</div>
		</div>
		<div class="footer"></div>
	</div>
</body>
</html>