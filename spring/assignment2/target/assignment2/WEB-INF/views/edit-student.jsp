<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Edit Student</title></head>
<body>
<h2>Edit Student</h2>
<form action="${pageContext.request.contextPath}/students/update" method="post">
    <input type="hidden" name="id" value="${student.id}" />
    Name: <input type="text" name="name" value="${student.name}" /><br/>
    Email: <input type="email" name="email" value="${student.email}" /><br/>
    <input type="submit" value="Update" />
</form>
</body>
</html>
