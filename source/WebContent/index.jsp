<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/index.css" type="text/css" rel="stylesheet" media="all" />
<title>ANU Basketball</title>
</head>
<body>
	<div id='login'>
		<form action="Login" method="post">
            <div id="login_title">login</div>
			<div class="line">
				username&nbsp;&nbsp; <input name="username" type="text"
					placeholder="username" />
			</div>
			<div class="line">
				password&nbsp;&nbsp; <input name="password" type="password"
					placeholder="password" />
			</div>
			<button id="log_submit" value="login" type="submit">login</button>
		</form>

	</div>
</body>
</html>