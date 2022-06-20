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

<h1>Product Details</h1>
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

<tr>
<td>${addproduct.productID}</td>
<td>${addproduct.productName}</td>
<td>${addproduct.productPrice}</td>
<td>${addproduct.productDescp}</td>
<td>${addproduct.productCategory}</td>
<td>${addproduct.mfg_Date}</td>
<td>${addproduct.exp_Date}</td>



</tr>

</table>
<a href="productReg">AddProduct</a><br><br>
<a href="viewALL">ViewAllProducts</a><br><br>
<a href="productReg">view product by Id</a><br><br>


</body>
</html>