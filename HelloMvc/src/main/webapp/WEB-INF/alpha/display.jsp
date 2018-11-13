<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form method="POST" action="./hello/getrecord" modelAttribute="e" >
ID
<f:input path="eid" />
<f:errors path="eid"/>
NAME
<f:input path="name" />
<f:errors path="name"/>
AGE
<f:input path="age" />
<f:errors path="age" cssClass="red"/>
<input type="submit" value="SUBMIT"/>


</f:form>



</body>
</html>