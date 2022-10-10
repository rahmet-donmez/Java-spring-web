<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="ana_sayfa">ana sayfa</a>
	<h3>Adminler</h3>
	<c:forEach var="admins" items="${admins}">
	<form action="admin_sil" name="${admins }">
		
		${admins.first_name } ${admins.last_name}
<!-- 		<input type="submit" value="sil"> -->
	
	</form>
</c:forEach>
	

</body>
</html>