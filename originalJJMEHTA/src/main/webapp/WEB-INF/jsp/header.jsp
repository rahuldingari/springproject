<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
#header{
width:100%;
height:100px;
background-color:white;
}
#img{
padding-left:50px;
position:absolute;
top:10px;
}
#searchbar{
padding-left:70%;
width:40px;
position:absolute;
top:10px;
}
#text{
border: 0;
outline: 0;
background: transparent;
border-bottom: 1px solid black;
width:250px;
border-radius:12px;
height:40px;
}
#login{
padding-left:87%;
position:absolute;
top:10px;
}
#signin{
height:40px;
background-color:white;
background-color: white;
color: black;
border: 2px solid #555555;
}
#jj{
height:40px;
padding-left:90%
}
#abcd{
padding-left:10%;
position:absolute;
top:8%;
font size:6;
}
#efgh{
padding-left:18%;
position:absolute;
top:8%;
}
#ijkl{
padding-left:30%;
position:absolute;
top:8%;
}
#mnop{
padding-left:40%;
position:absolute;
top:8%;
}

</style>
</head>
<body>
<div id="header">
<div id="img"><a href="hello"><img src="${pageContext.request.contextPath}/resources/images/jjmehtalogo.png" id="jj"/></a></div>
<div id="searchbar"><input  type="text" placeholder="Search for items" id="text"/></div>
<div id="login"><a href="registerForm">SIGN UP</a>/<a href="loginForm">LOGIN</a></div>
<div id="abcd"><p>Home</p></div>
<div id="efgh"><p>Shopping Cart</p></div>
<div id="ijkl"><p>jjmehta Forum</p></div>
<div id="mnop"><p>Contact Us</p></div>
</div>    
</body>
</html>