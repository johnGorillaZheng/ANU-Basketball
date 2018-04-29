<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
    <title>Login</title>
</head>

<body>
    <%@include file="header.jsp"%>

    <div class="row">
        <div class="col-4 offset-4 pt-5">
            <div class="card mt-5">
                <h5 class="card-header">Login</h5>
                <div class="card-body p-5">
                    <form action="/anubasketball/CompetitionManager/signIn" method="post" class="" >
                        <div class="form-group row col-12">
                            <label for="email" class="sr-only">Email address</label>
                            <input type="email" name="email" id="email" class="form-control" placeholder="Email address" required="" autofocus="">
                        </div>
                        <div class="form-group row col-12">
                            <label for="password" class="sr-only">Email address</label>
                            <input type="password" name="password" id="password" class="form-control" placeholder="Password" required="" autofocus="">
                        </div>
                        <div class="checkbox mb-3 col-12">
                            <label>
                                <input type="checkbox" value="remember-me" name="remember-me"> Remember me
                            </label>
                            <a href="#" class="link float-right">Forget your password?</a>
                        </div>
                        <div class="form-group row mt-4 col-12">
                            <button type="submit" class="form-control btn-primary">Login now</button>
                        </div>
                    </form>
                    <div class="form-group row mt-4 col-12">
                            <button onclick="window.location.href='/anubasketball/CompetitionManager/toSignUp'" class="form-control btn-info">Have no account? Register now!</button>
                    </div>
                    
                     <label>${error}</label>
                     <% request.removeAttribute("error");%>
                </div>
                <div class="card-footer"></div>
            </div>
        </div>
    </div>
    
</body>

</html>