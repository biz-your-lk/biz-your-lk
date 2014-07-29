<%@ page language="java" buffer="128kb" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<c:url var="images" value="/images/"></c:url>

<head>
    <title>
        <c:if test="${dynamicTitle != null}">
            <fmt:message key="${dynamicTitle}"/>
        </c:if>
    </title>
    <meta content="text/html; charset=utf-8" http-equiv="Content-Type"/>
    <c:if test="${metaDescription != null}">
        <meta content="${metaDescription}" name="description"/>
    </c:if>
    <c:if test="${keywords != null}">
        <meta content="${keywords}" name="keywords"/>
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