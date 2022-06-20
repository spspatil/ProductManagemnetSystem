<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Customer Details</h1>
<table align="center" style="margin: 0px auto;" border="5">
<tr>
<th>CustomerID</th>
<th>CustomerName</th>
<th>Mobile</th>
<th>Email</th>
</tr>

<tr>
<td>${saveCustomer.id}</td>
<td>${saveCustomer.name}</td>
<td>${saveCustomer.contact}</td>
<td>${saveCustomer.email}</td>




</tr>

</table>
<a href="customer">login</a><br><br>

</body>
</html>