<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Student List</title></head>
<body>
<h2>All Students</h2>
<a href="${pageContext.request.contextPath}/students/add">Add Student</a>
<table border="1">
    <tr>
        <th>ID</th><th>Name</th><th>Email</th><th>Actions</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>
                <a href="${pageContext.request.contextPath}/students/edit/${student.id}">Edit</a> |
                <a href="${pageContext.request.contextPath}/students/delete/${student.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>