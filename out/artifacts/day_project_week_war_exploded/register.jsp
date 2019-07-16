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
    <style>
        .div1{
            width: 600px;
            height: 600px;
            border: 5px solid cornflowerblue;
            margin: 0 auto;
        }
        span{
            width: 50px;
            height: 50px;
            color: burlywood;
        }
        .inner{
            width: 135px;
            height: 30px;
            border-radius: 15px;
        }
        .rg{
            width: 70px;
            height: 30px;
            background-color: cornflowerblue;
            border-radius: 15px;
        }
    </style>

    <script type="text/javascript">

    </script>


</head>
<body>
<div class="div1">
    <span><h2>用户注册</h2></span>
    用户名：<input type="text" class="inner"><br>
    密 码：<input type="password" class="inner"><br>
    性 别：<select name="" id="">
            <option value="1">男</option>
            <option value="2">女</option>
         </select><br>
    爱 好：<input type="checkbox">跑步
        <input type="checkbox">跳舞
        <input type="checkbox">瑜伽<br>
    手机号码：<input type="text" class="inner"><br>
    email：<input type="email" class="inner"><br>
    addrs：<input type="text" class="inner"><br>
    <input type="submit" value="注册" class="rg">
</div>

</body>
</html>
