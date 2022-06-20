<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>login sucess Customer Details</h1>
<table align="center" style="margin: 0px auto;" border="5">
<tr>
<th>CustomerID</th>
<th>CustomerName</th>
<th>Mobile</th>
<th>Email</th>
</tr>

<tr>
<td>${customer.id}</td>
<td>${customer.name}</td>
<td>${customer.contact}</td>
<td>${customer.email}</td>

</tr>
</table>

<a href="tobuyProduct">BuyProduct</a><br><br>
<a href="welcome">LogOut</a><br><br>
<a href="productReg">TrackOrder</a><br><br>

</body>
</html>