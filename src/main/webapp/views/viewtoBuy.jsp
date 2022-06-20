<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<script type="text/javascript">
function edit()
{
document.myform.action="addToCart";
document.myform.submit();
}
</script>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>All Product List </h1>

<form name="myform">
<table align="center" style="margin: 0px auto;" border="5">

<tr>
<th>productID</th>
<th>productName</th>
<th>productPrice</th>
<th>productDescp</th>
<th>productCategory</th>
<th>mfg_Date</th>
<th>exp_Date</th>
<th>Select</th>
<th>BUY</th>
</tr>

<c:forEach items="${products}" var="productlist">

<tr>
       <td><c:out value="${productlist.productID}"></c:out></td>
       <td><c:out value="${productlist.productName}"></c:out></td>
       <td><c:out value="${productlist.productPrice}"></c:out></td> 
       <td><c:out value="${productlist.productDescp}"></c:out></td>
       <td><c:out value="${productlist.productCategory}"></c:out></td>
       <td><c:out value="${productlist.mfg_Date}"></c:out></td>
       <td><c:out value="${productlist.exp_Date}"></c:out></td>
       
      <td><input type="radio" name="rd" value="${productlist.productID}"></td>
      <td><input type="button" value="BUY" onclick="edit()"></td>


</tr>
</c:forEach>

</table>
</form>

<a href="welcome">Logout</a><br><br>

</body>
</html>