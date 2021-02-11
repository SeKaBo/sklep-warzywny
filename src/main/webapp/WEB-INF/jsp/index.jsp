<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<link rel="stylesheet" type="text/css" href="../../style.css"/>
<html>
<head>
    <link href="<c:url value="style.css" />" rel="stylesheet">
    <title>Spring Shopping Page</title>

</head>

<body>
<h2><center>Welcome to my Shop</center></h2>
<br>
<div class="container">
    <div class="row">
        <div class="col-sm-1" >
            <jsp:include page="navbar.jsp" />
        </div>
<br>
<br>
<br>
<br>
<br>
<br>
<%--<p>Click below button to redirect the Products</p>--%>

<%--<form:form method = "GET" action = "/products">--%>

<%--    <table>--%>
<%--        <tr>--%>
<%--            <td>--%>

<%--                <input type = "submit" value = "Products"/>--%>

<%--            </td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--</form:form>--%>

<%--<br>--%>
<%--<br>--%>
<%--<br>--%>
<%--<br>--%>



<%--<p>Click below button to redirect the Cart</p>--%>

<%--<form:form method = "GET" action = "/cart">--%>

<%--    <table>--%>
<%--        <tr>--%>
<%--            <td>--%>

<%--                <input type = "submit" value = "Cart"/>--%>

<%--            </td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--</form:form>--%>

</body>

</html>
