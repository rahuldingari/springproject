<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.body{
padding-left:500px;
padding-top:110px;
}
#email{width:500px;height:40px;}
#pass{width:500px;height:40px}
#but{width:500px;height:50px}
.b1{padding-left:210px}
p{font-size:20px;padding-left:200px}
</style>
</head>
<body>
<div class="body">
<p id="p">Login</p>
<form:form method="post" action="hello" modelAttribute="signIn">
<form:input type="text" path="email" id="email" placeholder="Email address"/><br>
<p id="pa"></p>
<form:input type="password" path="password" id="pass" placeholder="Password"/><br>
<input type="submit" id="but" value="Sign in"/>
</form:form>   
</div>

</body>
</html>