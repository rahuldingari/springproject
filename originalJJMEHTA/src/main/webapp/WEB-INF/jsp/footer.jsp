<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
* {
  box-sizing: border-box;
}
/* Create two unequal columns that floats next to each other */
.column {
  float: left;
  padding: 125px;
  height: 300px; /* Should be removed. Only for demonstration */
}
.footer{
position:absolute;
top:80%;}

.left {
  width: 25%;
}

.right {
  width: 75%;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}
a{
style="text-decoration:none"
}
</style>
</head>
<body>
<div class="footer">
<div class="row">
  <div class="column" style="background-color:white;">
    <h2>Contact Us</h2>
	<h5>Narayan Smruti , Chhabildas Road, Dadar (W), Mumbai, MH, IN, 400028</h5>
	<h5 style="text-decoration:none">+91-9833771200</h5>
	<h5><a style="text-decoration:none" href="">info@jjmehta.com</a></h5>
  </div>
  <div class="column" style="background-color:white;">
    <h4><a style="text-decoration:none" href=""> Contact Us</a> &nbsp&nbsp <a style="text-decoration:none" href=""> About Us</a> &nbsp&nbsp <a style="text-decoration:none" href=""> Terms and Conditions</a>  &nbsp&nbsp <a style="text-decoration:none" href=""> Privacy Statement</a></h4>
    
	<h4><a  style="text-decoration:none" href="">jjmehta On Web</a> &nbsp&nbsp <a style="text-decoration:none" href=""> Site map</a></h4>
  </div>
</div>
<h5 style="padding-left:120px" > © 1998 - 2019 JJmehta.com - J J Mehta and Sons. All rights reserved. Powered by X-Cart</h5>
</div>
</body>
</html>