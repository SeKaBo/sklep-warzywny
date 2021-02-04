<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Spring Shopping Page</title>
</head>

<body>
<h2><center>Welcome to my Shop</center></h2>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
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
</body>

</html>
