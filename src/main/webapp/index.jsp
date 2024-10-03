<!doctype html>
<html lang="en">

<head>

<meta charset="UTF-8">

<title>JSP Servlet Page</title>
<link rel="stylesheet" href=" <%= application.getContextPath() +"/css/style.css" %>">

</head>

<body>

<div class="container">
<%@include file="Menu.jsp" %>

<h1>This is a servlet page</h1>
<p>You will receive information about JSP Servlets<p>

<form action="<%= application.getContextPath()  + "/third" %>" method="post">
<input name="message" type="text" placeholder="Type name here">
<button type="submit">Submit</button>


</form>

</div>


<script src=<%= application.getContextPath() +"/js/scripts.js" %>></script>
</body>

</html>