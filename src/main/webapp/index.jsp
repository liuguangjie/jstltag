<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="my" uri="http://localhost" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    your ip is  <my:viewIP iptest="9"/>

    <my:test1>
        test body  output
    </my:test1>


<a href="${pageContext.request.contextPath}/simple/test3.jsp">xxxxxxx</a>

    <%
        List<String> users=new ArrayList<String>(5);

        users.add("liujie");
        users.add("nihao");
        users.add("hhh");
        users.add("kkk");
        request.setAttribute("users",users);

    %>
    <br/>
    <c:forEach var="temp" items="${users}" varStatus="status">
        ${temp} -- ${status.index}<br/>
    </c:forEach>

<%--
--%>
    <br/>
    <my:iterator var="user" collection="${users}" varOperation="oper" >
        [${oper.index == 0 ? '0' : oper.index }] 角标 ${user} <br/>
    </my:iterator>




</body>
</html>
