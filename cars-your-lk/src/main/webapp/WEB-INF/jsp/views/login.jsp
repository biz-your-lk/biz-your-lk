<%--
  Created by IntelliJ IDEA.
  User: asankah
  Date: 7/22/14
  Time: 12:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--<%@ include file="/WEB-INF/jsp/common/taglibs.jsp" %>--%>
<html>
<head><title>Spring Login Page</title></head>
<body>

    <h1>Spring Security Custom Login Form</h1>
 
	<div id="login-box">
 
		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty message}">
			<div class="msg">${message}</div>
		</c:if>
        <c:url value='authenticationProcess' var="submitURL"/>
		<form name='loginForm'
		  action="${submitURL}" method='POST'>
 
		  <table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="submit" /></td>
			</tr>
		  </table>
 
		  <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
 
		</form>
	</div>

    <form action="/logout" method="POST">
      <button type="submit">LOGOUT</button>
        <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
    </form>

    <form id="tw_signin" action="<c:url value="/signin/facebook"/>" method="POST">
        <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
  <button type="submit">
    LOGIN WITH FACE BOOK
  </button>
</form>

</body>
</html>