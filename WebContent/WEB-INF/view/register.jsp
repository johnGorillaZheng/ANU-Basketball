<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css">
    <title>Register</title>
</head>

<body>
    <%@include file="header.jsp"%>
    
    <div class="row">
        <div class="alert alert-danger col-8 offset-2 mt-4 d-none" id="alert" role="alert">
            This is a primary alertâcheck it out!
        </div>
        <div class="col-4 offset-4">
            <div class="card mt-5">
                <h5 class="card-header">Register</h5>
                <div class="card-body p-5">
                    <form action="/anubasketball/CompetitionManager/signUp" name="form" method="post" onsubmit="return validate_form(this)">
                        <div class="form-group row">
                            <div class="col-5">
                                <label for="first_name">First name</label>
                                <input type="text" class="form-control" name="first_name" id="first_name" placeholder="First name" required>
                            </div>
                            <div class="col-6">
                                <label for="last_name">Last name</label>
                                <input type="text" class="form-control" name="last_name" id="last_name" placeholder="Last name" required>
                            </div>
                        </div>
                        <div class="form-group row col-12">
                            <label>Email Address:</label>
                            <label for="email" class="sr-only">Email address</label>
                            <input type="email" name="email" id="email" class="form-control" placeholder="Email address" required>
                        </div>
                        <div class="form-group row col-12">
                            <label>Password:</label>
                            <label for="password" class="sr-only">Email address</label>
                            <input type="password" name="password" id="password" class="form-control" placeholder="Password" required>
                        </div>
                        <div class="form-group row col-12">
                            <label>Please confirm your Password:</label>
                            <label for="password_confirm" class="sr-only">Email address</label>
                            <input type="password" name="password_confirm" id="password_confirm" class="form-control" placeholder="Password" required>
                        </div>
                        <div class="form-group row mt-4 col-12">
                            <button type="submit" class="form-control btn-primary">Register now</button>
                        </div>
                        <div class="form-group row mt-4 col-12">
                            <a href="/anubasketball/CompetitionManager/toSignIn" class="btn form-control btn-info">Have an account? Go login</a>
                        </div>
                    </form>
                     <label>${error}</label>
                     <% request.removeAttribute("error");%>
                </div>
                <div class="card-footer"></div>
            </div>
        </div>
    </div>

    <script type="text/javascript">
        function validate_form(thisForm) {
            with(thisForm) {
                let pattern = /^(?![A-Z]+$)(?![a-z]+$)(?!\d+$)(?![\W_]+$)\S{6,20}$/;
                if (pattern.exec(password.value)) {
                    set_alert("The length of password should be no more than 20 characters and password should only contain number, alphabet, dash and underline")
                    password.focus();
                    return false;
                }

                if (password.value != password_confirm.value) {
                    set_alert("The confirmation of password should be as same as password");
                    password_confirm.focus();
                    return false;
                }
                return true;
            }
        }
        function set_alert(str) {
            let alert = document.getElementById('alert');
            alert.innerText = str;
            alert.classList.remove('d-none');
        }
    </script>
</body>

</html>