<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
<table>
<tr>
<td>Account Holder Name : </td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>Email Id : </td>
<td><input type="email" name="email"></td>
</tr>
<tr>
<td>Date of Birth : </td>
<td><input type="date" name="dob"></td>
</tr>
<tr>
<td>Mobile Number : </td>
<td><input type="number" name="mno" pattern="[789][0-9]{9}"></td>
</tr>
<tr>
<td>Account Type : </td>
<td><select name="type">
<option value="savings">Savings Account</option>
<option value="current">Current Account</option>
</select>
</td>
</tr>
<tr>
<td>If Savings :</td>
<td><input type="radio" name="ifsav" value="salaried">Salaried
<input type="radio" name="ifsav" value="nonsalaried">Non-Salaried</td>
</tr>
<tr>
<td colspan="2"><h3>For Savings Account Only:</h3></td>
</tr>
<tr>
<td>Enter the amount(if salaried) : </td>
<td><input type="number" name="samount" min=0></td>
</tr>
<tr>
<td>Enter the amount(if non salaried)(min 1000) : </td>
<td><input type="number" name="samount" min=1000></td>
</tr>
<tr>
<td colspan="2"><h3>For Current Account Only:</h3></td>
</tr>
<tr>
<td>Enter the overdraft limit(min 10000) : </td>
<td><input type="number" name="overdraft" min=10000></td>
</tr>
<tr>
<td>Enter the amount (min 10000) : </td>
<td><input type="number" name="camount" min=10000></td>
</tr>
<tr>
<td><input type="reset" value="Reset"></td>
<td><input type="submit" value="Submit"></td>
</tr>
</table>
</form>
</body>
</html>