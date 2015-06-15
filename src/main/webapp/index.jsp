<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>CXF Rest Example by Amaresh</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <div class="container bg-primary">
        <h1>Welcome to the CXF REST Example by Amaresh.</h1>
        <h2>WADL At</h2>
            <strong>http://localhost:8080/camel-cxf-example/rest/employeeservices?_wadl </strong>
        <h2>Access service at</h2>
            <strong>http://localhost:8080/camel-cxf-example/rest/employeeservices/getemployeedetail?employeeId=1 </strong>
        <h2>Request either xml or json response format (append .json or .xml to the operation)</h2>
            <strong>http://localhost:8080/camel-cxf-example/rest/employeeservices/getemployeedetail.json?employeeId=1 </strong><br>
            <strong>http://localhost:8080/camel-cxf-example/rest/employeeservices/getemployeedetail.xml?employeeId=1 </strong><br>
        <h1>Here are the routes created by Camel CXF.</h1>
        <h2>Rest endpoints</h2>
            <strong>http://localhost:8080/camel-cxf-example/camel/user/findAll</strong><br>
            <strong>http://localhost:8080/camel-cxf-example/camel/user/1</strong><br>
    </div>
</body>
</html>