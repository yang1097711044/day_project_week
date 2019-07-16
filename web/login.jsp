<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/15
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function onCheck() {
            var loginObj = document.getElementById('loginName');
            var pwdObj = document.getElementById('pwd');
            if (!loginObj.value){
                alert("用户名不能为空！");
                return false;
            }else if (!pwdObj.value) {
                alert("密码不能为空！");
                return false;
            }

        }
        function onRegister() {
            window.location.href="register.jsp";
        }
    </script>
</head>
<body>
<form action="loginServlet" method="post" onsubmit="return onCheck()">
    <h2>用户登录</h2>
    用户名：<input type="text" name="username" id="loginName"><br>
    密 码：<input type="password" name="password" id="pwd"><br>
    <input type="submit" value="登录">
    <input type="button" value="注册" onclick="onRegister()">
</form>
</body>
</html>
