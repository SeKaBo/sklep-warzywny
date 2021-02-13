<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Log in with your credentials</title>


    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
</head>

<body>



<div class="container">
    <div class="row">
        <div class="col-sm-1" >
            <jsp:include page="navbar.jsp" />
        </div>
        <div class="col-sm" style="border-right:black">
            <form method="POST" action="/bootstrap" class="form-signin">
                <h2 class="form-heading">Log in</h2>

                <div class="form-group ">
                    <input name="elementName" type="text" class="form-control" placeholder="Username"
                           autofocus="true"/>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">add</button>
                </div>


            </form>
            <div>    <c:forEach items="${elements}" var="element">
                <tr>
                    <td>${element.getDisplayName()}</td>
                    <td>
                        <form action="/bootstrap/delete/${element.getId()}" method="POST">
                            <input type="submit" value="delete">
                        </form>
                    </td>
                </tr>


            </c:forEach></div>

            <div>
                <span>Total count ${sum}</span>
            </div>
        </div>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</body>
</html>