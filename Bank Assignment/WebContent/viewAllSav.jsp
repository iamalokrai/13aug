<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Account No.</th>
			<th>Account Holder</th>
			<th>Date of Birth</th>
			<th>Contact No</th>
			<th>Email</th>
		</tr>
		<jstl:forEach var="saving" items="${requestScope.saving}" >
			<tr>
			<td>${saving.accountBalance}</td>
				<td>${saving.accountNo }</td>
				<td>${saving.accountHolder.customerName }</td>
				<td>${saving.accountHolder.dateOfBirth }</td>
				<td>${saving.accountHolder.contactNumber }</td>
				<td>${saving.accountHolder.emailId }</td>
		</jstl:forEach>
	</table>
</body>
</html>