<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success</title>
<style type="text/css">
    span {
        display: inline-block;
        width: 200px;
        text-align: left;
    }
</style>
</head>
<body>
    <div align="center">
        <h2>Registration Succeeded!</h2>
     
        <span>Form:</span><span>${user.countryName}</span><br/>
        <span>Form:</span><span>${user.cityName}</span><br/>
        <span>Keyword:</span><span>${user.keywords}</span><br/>
    </div>
</body>
</html>