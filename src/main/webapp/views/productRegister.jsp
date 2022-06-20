<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Insert product details</h2>

<form action="saveProduct">

ProductName: <input type="text" name="productName"><br><br>
Product Price: <input type="text" name="productPrice"><br><br>
Product Description: <input type="text" name="productDescp"><br><br>
Product Category: <input type="text" name="productCategory"><br><br>
Product MFG Date: <input type="date" name="mfg_Date"><br><br>
Product EXP Date: <input type="date" name="exp_Date"><br><br>


 <input type="submit" value="ADD">
 
</form>

<a href="welcome">LogOut</a><br><br>


</body>
</html>