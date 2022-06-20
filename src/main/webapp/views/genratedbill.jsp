<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>your order placed</h1>
<table align="center" style="margin: 0px auto;" border="5">
<tr>
<th>BillId</th>
<th>customername</th>
<th>productName</th>
<th>productPrice</th>
<th>quantity</th>
<th>orderdDate</th>
</tr>

<tr>
<td>${order.orderId}</td>
<td>${order.customername}</td>
<td>${order.productName}</td>
<td>${order.productPrice}</td>
<td>${order.quantity}</td>
<td>${order.orderdDate}</td>

</tr>
</table>

<a href="tobuyProduct">viewProduct</a><br><br>
<a href="welcome">LogOut</a><br><br>
<a href="productReg">TrackOrder</a><br><br>



</body>
</html>