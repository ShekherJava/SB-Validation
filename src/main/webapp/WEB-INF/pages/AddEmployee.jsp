<%@ taglib prefix = "form"  uri = "http://www.springframework.org/tags/form" %>

<html>
 <body>
	<form:form action = "save"  modelAttribute="employee" method="post">
		Empno <form:input path="empno"/> <form:errors path="empno" cssClass="error"/> <br>
		Ename <form:input path="ename"/> <form:errors path="ename" cssClass="error"/> <br>
		Sal   <form:input path="sal"/> <form:errors path="sal" cssClass="error"/> <br>
		
		<input type="submit"  value="submit">
	</form:form>
 </body>
</html> 	
		