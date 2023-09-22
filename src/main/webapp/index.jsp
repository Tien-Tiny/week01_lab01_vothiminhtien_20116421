<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Form Log in</title>
</head>
<body>
<div id="container">
  <form id="formLogin" action="login?action=checkLogin" method="post">
    <h2 style="color: #0000FF; font-family: 'Times New Roman', serif">LOGIN FORM</h2>
    UserName: <input type="text" name="email" placeholder="Nhap email"/> <br>
    Password: <input type="password" name="password" placeholder="Nhap password"/> <br>
    <button type="submit" id="loginbtn" >Login</button>
  </form>
</div>
</body>
</html>