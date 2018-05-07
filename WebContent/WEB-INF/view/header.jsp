<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<header class="navbar navbar-expand-lg navbar-dark bg-primary">
	<span class="navbar-brand mb-0 h1">ANU Basketball</span>
	<div class="collapse navbar-collapse" id="navbarTogglerDemo01">
		<div class="navbar-nav-scroll">
			<ul class="navbar-nav bd-navbar-nav flex-row">
				<li class="nav-item"><a class="nav-link" href="/anubasketball/">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Ladders</a></li>
			</ul>
		</div>
		<ul class="navbar-nav flex-row ml-md-auto d-none d-md-flex">
			<c:choose>
				<c:when test="${empty sessionScope.user}">
					<li class="nav-item"><a class="nav-link active"
						href="/anubasketball/CompetitionManager/toSignUp">Register</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/anubasketball/CompetitionManager/toSignIn">Login</a></li>
				</c:when>
				<c:otherwise>
					<li class="nav-item"><a class="nav-link active"
						href="/anubasketball/CompetitionManager/signOut">Sign out</a></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</div>
</header>