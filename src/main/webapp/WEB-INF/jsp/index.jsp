<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Spring Shopping Page</title>
</head>

<body>
<h2>Welcome to my main page</h2>
<br>1
<br>2
<br>3
<br>4
<br>5
<br>6
<br>7
<p>Click below button to redirect the shopping cart</p>

<form:form method = "GET" action = "/koszyk">

    <table>
        <tr>
            <td>
                <input type = "submit" value = "KOSZYK"/>
            </td>
        </tr>
    </table>
</form:form>
</body>

</html>
