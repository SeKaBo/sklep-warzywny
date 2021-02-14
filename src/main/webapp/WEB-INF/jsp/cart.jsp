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
    <div>    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.getName()}</td>
            <td>
                <form action="/cart/delete" method="post">
                    <input type="hidden" name="productId" value="${product.getId()}">
                    <input type="submit" value="delete">
                </form>
            </td>
        </tr>


    </c:forEach></div>
</table>

<%--<form:form method = "GET" action = "/cart">--%>
----------------------------------------------


<form:form method = "GET" action = "/products">

    <table>
        <tr>
            <td>

                <div>
                    <span>Total count ${sum}</span>
                </div>

            </td>
        </tr>
    </table>
</form:form>

----------------------------------------------
<p>Click below button to redirect the Products</p>

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