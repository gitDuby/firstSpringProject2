<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@ include file="../include/importTags.jsp"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
    <link type="text/css" href="<spring:url value='/css/first.css' />"
          rel="Stylesheet">
</head>
<body>
<div id="top">
    Banner : Magic site
    <br>
    <img   class="localeIcon"  src = '<spring:url value="/images/banner.jpg"/>' />
</div>
<div>
    <tiles:insertAttribute name="main-content" />
</div>
<div id="bottom">
    Footer : Copyright f. Dubisy
</div>
</body>
</html>