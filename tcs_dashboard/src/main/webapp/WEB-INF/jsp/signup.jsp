<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>SignUp Page</title>
</head>
<body>
<form action="/users/signup" method="post">
 <table border="0">
  <tr>
   <td>ID:</td>
   <td><input type="text" name="j_username"></td>
  </tr>
  <tr>
   <td>PASSWORD:</td>
   <td><input type="password" name="j_password"></td>
  </tr>
  <tr>
   <td colspan="2">
    <input type="submit" value="Login">
   </td>
  </tr>
 </table>
</form>
</body>
</html>

