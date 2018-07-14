<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:choose>
	<c:when test="${!empty listEmps}">
		<table border="1">
			<tr style="color:windowframe;">
				<th>EMP NO</th>
				<th>EMP Name</th>
				<th>EMP DEPT</th>
				<th>EMP Salary</th>
			</tr>
			<c:forEach var="dto" items="${listEmps}">
				<tr style="color: gray;">
					<td>${dto.eno}</td>
					<td>${dto.ename}</td>
					<td>${dto.desg}</td>
					<td>${dto.salary}</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>Records not found</c:otherwise>
</c:choose>
<br>
<br>
<a href="home.htm">home</a>