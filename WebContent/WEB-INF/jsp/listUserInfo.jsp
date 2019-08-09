<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>userId</td>
        <td>userName</td>
    </tr>
    <c:forEach items="${userInfolist}" var="userInfo" varStatus="st">
        <tr>
            <td>${userInfo.userId}</td>
            <td>${userInfo.userName}</td>
              
        </tr>
    </c:forEach>
</table>