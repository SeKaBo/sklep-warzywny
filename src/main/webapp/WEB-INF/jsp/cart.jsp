<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>


<html>
<head>
    <meta charset="UTF-8">
    <title>Cart</title>
</head>
<body>
<h3>Cart</h3>
<table>
    <thead>
    <th>Product Name</th>
    <th>Price</th>
    <th>Action</th>
    </thead>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.getName()}</td>
            <td>${product.getPrice()}</td>
            <td>
                <form action="delete" method="post">
                    <input type="hidden" name="productId" value="${product.id}">
                    <input type="submit" value="Delete">
                </form>
            </td>
        </tr>


    </c:forEach>
</table>

<%--<form:form method = "GET" action = "/cart">--%>
----------------------------------------------


<form:form method = "GET" action = "/products">

    <table>
        <tr>
            <td>

                <th>Subtotal : </th>

            </td>
        </tr>
    </table>
</form:form>

----------------------------------------------

<form:form method = "GET" action = "/products">

    <table>
        <tr>
            <td>

                <input type = "submit" value = "Products"/>

            </td>
        </tr>
    </table>
</form:form>
------------------------------------------------

<p>Click below button to redirect the Main Page</p>

<form:form method = "GET" action = "/index">

    <table>
        <tr>
            <td>

                <input type = "submit" value = "Main Page"/>

            </td>
        </tr>
    </table>
</form:form>
------------------------------------------------

</body>

</html>