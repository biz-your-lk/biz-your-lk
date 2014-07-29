<%--
  Created by IntelliJ IDEA.
  User: asankah
  Date: 7/26/14
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<form action="<c:url value="/connect/facebook" />" method="POST">
    <input type="hidden" name="scope" value="offline_access" />
    <p>You haven't created any connections with Twitter yet. Click the button to create
       a connection between your account and your Twitter profile.
       (You'll be redirected to Twitter where you'll be asked to authorize the connection.)</p>
    <p>
     <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
        <button type="submit">Click
    </button></p>
</form>
</html>