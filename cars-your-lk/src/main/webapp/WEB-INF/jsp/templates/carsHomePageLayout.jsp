<%--
  Created by IntelliJ IDEA.
  User: asankah
  Date: 7/29/14
  Time: 6:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/taglibs.jsp"%>
<html>
<head>
    <title>
        <c:if test="${title != null}">
            <%--<spring:message code="${title}"/>--%>
        </c:if>
    </title>
    <meta content="text/html; charset=utf-8" http-equiv="Content-Type"/>
    <c:if test="${metaDescription != null}">
        <%--<meta content="<spring:message code='${metaDescription}'/>" name="description"/>--%>
    </c:if>
    <c:if test="${metaKeywords != null}">
        <%--<meta content="<spring:message code='${metaKeywords}'/>" name="keywords"/>--%>
    </c:if>

    <%--  Styles and JS goes here--%>
</head>


<body>

<div class="narrow-wrap">
    <tiles:insertAttribute name="header"/>
</div>

<div>
    <tiles:insertAttribute name="mainMenu"/>
</div>

<div>
    <tiles:insertAttribute name="leftSideContent"/>
</div>

<div>
    <tiles:insertAttribute name="content"/>
</div>

<div>
    <tiles:insertAttribute name="footer"/>
</div>


</body>
</html>