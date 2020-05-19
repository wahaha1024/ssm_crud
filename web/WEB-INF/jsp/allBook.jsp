<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 哇哈哈
  Date: 2020年5年18年0018
  Time: 下午 04:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有书籍</title>
</head>
<body>
    <h3>所有书籍</h3>
    <form action="${pageContext.request.contextPath}/books/findBook" method="post">
        <input type="text" name="bookName"/>
        <input type="submit" value="搜索"/>
        <span style="color: red" >${error}</span>
    </form>
    <table border="1" width="400">
        <tr>
            <th>ID</th>
            <th>书名</th>
            <th>数量</th>
            <th>说明</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${list}" var="book">
            <tr>
                <td>${book.bookID}</td>
                <td>${book.bookName}</td>
                <td>${book.bookCounts}</td>
                <td>${book.detail}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/books/toUpdateBook?id=${book.bookID}">修改</a>
                        &nbsp; | &nbsp;
                    <a href="${pageContext.request.contextPath}/books/delBook?id=${book.bookID}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a class="button" href="${pageContext.request.contextPath}/books/toAddBook" >新增书籍</a>
</body>
</html>
