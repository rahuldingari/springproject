<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.b{
padding-left: 10%;
postion:absolute;
top:10%;
}
.c{

postion:absolute;
top:20%;
}
#img1{
width:20%;
height:20%;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="b">
<a href="products/camera"><img src="${pageContext.request.contextPath}/resources/images/canon_1300d_1855mm_1.jpg" id="img1"/></a>
</div>
<div=class="c"><a href="products/memory card"><img src="${pageContext.request.contextPath}/resources/images/sandisk_pro_32gb_300mbs.jpg"id="img1"/></a>
    </div>  
</body>
</html>