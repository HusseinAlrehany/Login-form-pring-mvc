<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<header>

	<title>Welcome</title>

</header>

<body>
	<%
	String firstName = request.getParameter("userName");
	
	out.print("Welcome " + firstName);
	%>


</body>


</html>