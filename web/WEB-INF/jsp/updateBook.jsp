<%--
  Created by IntelliJ IDEA.
  User: 哇哈哈
  Date: 2020年5年19年0019
  Time: 下午 02:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>修改书籍</h3>
<form action="${pageContext.request.contextPath}/books/updateBook">
         <input type="hidden" name="bookID" value="${oBook.bookID}">
    书名:<input type="text" name="bookName" value="${oBook.bookName}" required>
    数量:<input type="text" name="bookCounts" value="${oBook.bookCounts}" required>
    介绍:<input type="text" name="detail" value="${oBook.detail}" required>
    <input type="submit" value="ok"/>
</form>
</body>
</html>
