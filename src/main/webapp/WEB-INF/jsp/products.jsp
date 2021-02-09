<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Products</title>


</head>

<body>
<h3>Product List</h3>

<table>
    <thead>
    <th>Add to Cart</th>
    <th>Product name</th>
    <th>Price</th>

    </thead>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>
                <form action="cart/add" method="post">
                    <input type="hidden" name="productId" value="${product.id}">
                    <input type="submit" value="Save">
                </form>
            </td>
            <td>${product.getName()}</td>
            <td>${product.getPrice()}</td>
        </tr>
    </c:forEach>
</table>
-------------------
</body>


</html>