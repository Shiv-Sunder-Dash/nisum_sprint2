<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Spring Bean Scope Demonstration</title></head>
<body>
<h2>Spring Bean Scope Demonstration</h2>
<ul>
    <li>${singleton}</li>
    <li>${prototype}</li>
    <li>${request}</li>
    <li>${session}</li>
    <li>${application}</li>
</ul>
<a href="<c:url value='/' />">Reload Page</a>
</body>
</html>
