
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

${message}

<hr>
<br>

<table border="1">
	<tr>
		<th>EMPNO</th>  <th>ENAME</th> <th>SAL</th>
	</tr>
	<c:forEach  var="e"  items="${lstEmp}">
		<tr>
			<td> <c:out value="${e.empno}"/> </td>
			<td> <c:out value="${e.ename}"/> </td>
			<td> <c:out value="${e.sal}"/> </td>
		</tr>
	</c:forEach>
</table>