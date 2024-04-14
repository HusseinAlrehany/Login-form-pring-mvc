<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<header>
	<title>SIGN IN FORM</title>

	<link type="text/css" rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/sign-user-style.css">

	<link type="text/css" rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css">



</header>

<body>

	<div id="wrapper">

		<div id="header">

			<h2>Already member? SIGN IN</h2>


			<!-- FOR POP UP MESSAGE TO NOT VERIFY INVALID USER NAME AND PASSWORD -->
			<c:if test="${not empty errorMessage}">
				<script type="text/javascript">
					alert("${errorMessage}");
				</script>
			</c:if>



		</div>

		<div id="container">

			<h2>LogIn Form</h2>

			<form:form action="checkUser" modelAttribute="users" method="POST">

				<table>
					<tbody>
						<tr>
							<td><label>User Name:</label></td>
							<td><form:input path="userName" />
							<form:errors path="userName" /></td>

						</tr>
						<tr>
							<td><label>PassWord:</label></td>
							<td><form:input path="passWord" /></td>

						</tr>
						<tr>
							<td><label></label></td>
							<td><input type="submit" value="LogIn" class="add-button" /></td>
							<td><input type="reset" value="Reset" class="add-button" /></td>


						</tr>
						<tr>

							<td><label>not member? </label></td>
							<td><a
								href="${pageContext.request.contextPath }/user/signUpForm">Sign
									Up</a></td>

						</tr>





					</tbody>


				</table>



			</form:form>

		</div>


	</div>


</body>




</html>