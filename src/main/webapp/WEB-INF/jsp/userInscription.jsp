<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<html>
<body>
<div class="text">
    Welcome on inscription page !
</div>


<form:form 	id="inscription"
              method="POST"
              action="/firstSpring/inscription/send"
              modelAttribute="currentUser">
    <br>
    <br>
    <form:label path="name"> Name </form:label>
    <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    <br>
    <form:label path="age"> Age </form:label>
    <form:input path="age"/>
    <form:errors path="age"/>
    <br>
    <br>
    <td>
        <form:radiobutton path="male" value="true" label="Boy" />
        <form:radiobutton path="male" value="false" label="Girl" />
    </td>
    <br>
    <br>
    What's your preferred hobby?
    <form:select path="hobby">
        <!--<form:option value="sport" label="Sport" />-->
        <!--<form:option value="painting" label="Painting" />-->
        <!--<form:option value="bicyle" label="Bicycle" />-->
        <form:options items="${hobbies}" itemValue="name" itemLabel="name" />
    </form:select>
    <br>
    <br>
    <form:button>Send</form:button>
</form:form>

</body>
</html>