<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/21 0021
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<div class="jq22-container" style="padding-top:100px">
    <div class="login-wrap">       <%--图片框--%>
        <div class="login-html">    <%--登录界面--%>
            <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
            <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
            <div class="login-form">
                <%--登录--%>
                <form id="fm">
                <div class="sign-in-htm">
                    <div class="group">
                        <label for="user" class="label" >Username</label>
                        <input id="user" type="text" class="input" name="username">
                    </div>
                    <div class="group">
                        <label for="pass" class="label">Password</label>
                        <input id="pass1" type="password" class="input" data-type="password" name="password">
                    </div>
                    <div class="group">
                        <input id="check" type="checkbox" class="check"  name="check" checked>
                        <label for="check"><span class="icon"></span> Keep me Signed in</label>
                    </div>
                    <div class="group">
                        <input type="submit" id="button1" name="SignIn" value="Sign In">
                    </div>
                    <div class="hr"></div>
                    <div class="foot-lnk">
                        <a href="#forgot">Forgot Password?</a>
                    </div>
                </div>
                </form>
                <%--注册--%>
                <div class="sign-up-htm">
                    <div class="group">
                        <label for="user" class="label">Username</label>
                        <input id="user1" type="text" class="input">
                    </div>
                    <div class="group">
                        <label for="pass" class="label">Password</label>
                        <input id="pass" type="password" class="input" data-type="password">
                    </div>
                    <div class="group">
                        <label for="pass" class="label">Repeat Password</label>
                        <input id="pass2" type="password" class="input" data-type="password">
                    </div>
                    <div class="group">
                        <label for="pass" class="label">Email Address</label>
                        <input id="pass3" type="text" class="input">
                    </div>
                    <div class="group">
                        <input type="button" id="button2" name="SignUp" value="Sign Up">
                    </div>
                    <div class="hr"></div>
                    <div class="foot-lnk">
                        <label for="tab-1">Already Member?</label>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#button1").click(function () {
                var fm=$("#fm").serialize();
                $.ajax({
                    url:"doLogin",
                    type:"post",
                    data:fm,
                    success:function (data) {
                        alert(data);
                        switch (data) {
                            case "0":alert("Sign in successfully!");
                                window.location.href="list";
                                break;
                            case "1":alert("PassWord error,please enter again!");
                                window.location.href="login";
                                break;
                            case "2":alert("Please enter the password!");
                                window.location.href="login";
                                break;
                            case "3":alert("Please register!");
                                window.location.href="register";
                                break;
                            default:window.location.href="login";
                                break;
                        }
                    }
                })
            })
        })
    </script>
</body>
</html>
