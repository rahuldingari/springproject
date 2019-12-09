<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>working</title>
</head>

<body>
<table>
<c:forEach items="${productsdisplay}" var="list">
<tr><td><img src="data:image/jpg;base64,${list.base64}" /></td>
</tr>
<tr><td><c:out value="${list.pro_type }">${list.pro_type}</c:out></td></tr>
<tr><td><c:out value="${list.quantity }">${list.quantity}</c:out></td></tr>
<tr><td>Prize:<c:out value="${list.pro_brand }">${list.pro_brand}</c:out></td></tr>
<tr><td><form action="${pageContext.request.contextPath}/add_to_cart/${product_id} ">
<input type="submit" value="Add To Cart"/>
</form></td></tr>

</c:forEach>
</table>
</body>
</html>