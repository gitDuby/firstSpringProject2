<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <title> Welcome </title>
</head>
<body>
<div>
 Welcome to you
</div>
<form:form id="form"
           method="POST"
           action ="/firstSpring/hello/send"
           modelAttribute="magicKeyForm">
    <form:label path="magicKey"> Magic Key </form:label>
    <form:input path="magicKey"/>
    <form:button>Send</form:button>
</form:form>
</body>
</html>