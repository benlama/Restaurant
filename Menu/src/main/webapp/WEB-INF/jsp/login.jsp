<%-- 
    Document   : login
    Created on : 6 mai 2015, 11:48:07
    Author     : DNS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.sun.org.apache.bcel.internal.util.ClassPath"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <c:if test="${not empty param.error}">
            <font color="red">
                Login error. <br />
                Reason : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
            </font>
        </c:if>
                                      
        <form method="POST" action="<c:url value="/j_spring_security_check" />" >
                 <input type="text" class="form-control" placeholder="Username" name="j_username" >
                 <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="j_password" >
                 <input type="checkbox" />Remember me
                 <input type="submit" class="btn btn-primary pull-right" value="Login" />
        </form>
    
    </body>
</html>
