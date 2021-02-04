<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>


<html>
<head>
    <meta charset="UTF-8">
    <title>Cart</title>
</head>
<body>
<h3>Koszyk</h3>
<table>
    <thead>
    <th>Nazwa Produktu</th>
    <th>Cena</th>
    </thead>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.getName()}</td>
            <td>${product.getPrice()}</td>
        </tr>


    </c:forEach>
</table>

<%--<form:form method = "GET" action = "/cart">--%>
----------------------------------------------
<form:form method = "GET" action = "/products">

    <table>
        <tr>
            <td>

                <input type = "submit" value = "Produkty"/>

            </td>
        </tr>
    </table>
</form:form>
------------------------------------------------
</body>

</html>