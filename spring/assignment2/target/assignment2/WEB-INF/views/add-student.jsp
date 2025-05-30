<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Add Student</title></head>
<body>
<h2>Add New Student</h2>
<form action="${pageContext.request.contextPath}/students/save" method="post">
    Name: <input type="text" name="name" /><br/>
    Email: <input type="email" name="email" /><br/>
    <input type="submit" value="Save" />
</form>
</body>
</html>