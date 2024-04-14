<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<header>
	<title>Sign Up New Member</title>

	<link type="text/css" rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/sign-user-style.css">

	<link type="text/css" rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css">



</header>
<body>


	<div id="wrapper">
		<div id="header">

			<h2>New Member Sign Up</h2>
		</div>

	</div>
	<div id="container">

		<form:form action="saveUser" modelAttribute="users" method="POST">

			<table>
				<tbody>
					<tr>
						<td><label>first Name:</label></td>
						<td><form:input path="firstName" /></td>

					</tr>
					<tr>
						<td><label>last Name:</label></td>
						<td><form:input path="lastName" /></td>
					</tr>
					<tr>
						<td><label>user Name:</label></td>
						<td><form:input path="userName" />
						<form:errors path="userName"/></td>
					</tr>
					<tr>
						<td><label>passWord:</label></td>
						<td><form:input path="passWord" placeholder="*******"/>
						<form:errors path="passWord"/></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save User" class="add-button"></td>
						<td><input type="reset" value="Reset" class="add-button"/></td>
						<td><a href="http://localhost:8080/loginform/user/Login">Cancel</a></td>
					</tr>




				</tbody>


			</table>




		</form:form>

	</div>


</body>



</html>