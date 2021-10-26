<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<form action="/test" method="post">
    <input type="text" name="value"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>