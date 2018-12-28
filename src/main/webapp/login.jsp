<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/21 0021
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/path.jsp" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
   <style>
       body{

           background-image: url("img/123.jpg");
           background-position: center center;
           background-size: cover;
           background-repeat: no-repeat;
           width: 100vw;        /*这个设置容器宽度为浏览器宽度*/
           height: 100vh;
       }
   </style>
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
                    <form id="up">
                <div class="sign-up-htm">
                    <div class="group">
                        <label for="user" class="label">Username</label>
                        <input id="user1" type="text" class="input" name="Uname" placeholder="6~12个字符"><span id="message"></span>
                    </div>
                    <div class="group">
                        <label for="pass" class="label">Password</label>
                        <input id="pass" type="password" class="input" data-type="password" name="Upassword1" placeholder="6~12个字符">
                    </div>
                    <div class="group">
                        <label for="pass" class="label">Repeat Password</label>
                        <input id="pass2" type="password" class="input" data-type="password" name="Upassword2" placeholder="6~12个字符"><span id="message1"></span>
                    </div>
                    <div class="group">
                        <label for="pass" class="label">Email Address</label>
                        <input id="pass3" type="text" class="input" name="Uemail" placeholder="             @qq.com">
                    </div>
                    <div class="group">
                        <input type="button" id="button2" name="SignUp" value="Sign Up" disabled="disabled">
                    </div>
                    <div class="hr"></div>
                    <div class="foot-lnk">
                        <label for="tab-1">Already Member?</label>
                    </div>
                </div>
                    </form>
            </div>
        </div>
    </div>
</div>



    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
/*登录*/
        $(function () {
            $("#button1").click(function () {
                var fm=$("#fm").serialize();
                $.ajax({
                    url:"doLogin",
                    type:"post",
                    data:fm,
                    success:function (data) {

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
        });
/*注册*/
        $(function () {
            var un ;
            var psd;
            var psd1;
            var email;
            $(".input").blur(function () {
                un = $("#user1").val();
                psd = $("#pass").val();
                psd1 = $("#pass2").val();
                email = $("#pass3").val();
                console.log(un);
                $.ajax({
                    url:"doRegister",
                    type:"post",
                    data:{"user1":un ,"pass":psd , "pass2":psd1 , "pass3":email},
                    success:function (data) {
                        console.log(data);
                        if (data =="0"){
                            $("#message").text("请输入用户名！")
                        }
                        if (data == "1"){
                            $("#message").text("用户已存在！")
                        }
                        else if (data == "2") {
                            $("#message").text("√") ;              /*用户名可以注册*/
                        }
                        if (data == "23") {
                            $("#message1").text("√");                    /*密码相同，可以注册*/
                            $("#button2").attr("disabled",false)          /*解开button*/
                        }else if (data == "24") {
                            $("#message1").text("两次密码不同，请从新输入")
                        }
                    }
                });

            })
            $("#button2").click(function () {
                $.ajax({
                    url:"doInsert",
                    type:"post",
                    data:{"user1":un ,"pass":psd , "pass2":psd1 , "pass3":email},
                    success:function (data) {
                        if (data =="1"){
                            alert("注册成功")
                            window.location.href="login";
                        }
                    }

                })
            })

        })
    </script>
</body>
</html>
