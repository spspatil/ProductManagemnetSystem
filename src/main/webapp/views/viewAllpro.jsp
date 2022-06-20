<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>All Product List </h1>
<table align="center" style="margin: 0px auto;" border="5">

<tr>
<th>productID</th>
<th>productName</th>
<th>productPrice</th>
<th>productDescp</th>
<th>productCategory</th>
<th>mfg_Date</th>
<th>exp_Date</th>
</tr>

<c:forEach items="${products}" var="productlist">
<tr>
<td>${productlist.productID}</td>
<td>${productlist.productName}</td>
<td>${productlist.productPrice}</td>
<td>${productlist.productDescp}</td>
<td>${productlist.productCategory}</td>
<td>${productlist.mfg_Date}</td>
<td>${productlist.exp_Date}</td>




</tr>
</c:forEach>

</table>
<a href="welcome">Logout</a><br><br>
<a href="productReg">AddProduct</a><br><br>

</body>
</html>