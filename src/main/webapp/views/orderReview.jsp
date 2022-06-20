
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<script type="text/javascript">
function edit()
{
document.myform.action="Saveorder";
document.myform.submit();
}
</script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Hi..${customerinfo.name}</h1>
<h1>Order confirmation </h1>

<form name="myform">
<table align="center" style="margin: 0px auto;" border="5">

<tr>
<th>productName</th>
<th>productPrice</th>
<th>productDescp</th>
<th>Quantity</th>
</tr>



<tr>

       <td><c:out value="${product.productName}"></c:out></td>
       <td><c:out value="${product.productPrice}"></c:out></td> 
       <td><c:out value="${product.productDescp}"></c:out></td>
      
      <td><input type="number" name="rd" value="quantity"></td>
      <td><input type="button" value="Submit" onclick="edit()"></td>


</tr>

</table>
</form>







<a href="welcome">logout</a><br><br>
</body>
</html>