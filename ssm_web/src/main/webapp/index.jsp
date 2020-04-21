<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>

<%--${pageContext.request.contextPath}表示当前项目名称,因为tomcat默认虚拟路径是 /项目名称--%>
<jsp:forward page="/pages/main.jsp"></jsp:forward>
</body>
</html>
