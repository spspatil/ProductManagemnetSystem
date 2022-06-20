<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<td>${product.productID}</td>
<td>${product.productName}</td>
<td>${product.productPrice}</td>
<td>${product.productDescp}</td>
<td>${product.productCategory}</td>
<td>${product.mfg_Date}</td>
<td>${product.exp_Date}</td>



</tr>

</table>
<a href="productReg">AddProduct</a><br><br>

</body>
</html>