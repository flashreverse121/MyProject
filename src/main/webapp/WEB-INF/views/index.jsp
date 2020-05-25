<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
<style type="text/css">
    label {
        display: inline-block;
        width: 200px;
        margin: 5px;
        text-align: left;
    }
    input[type=text], input[type=password], select {
        width: 200px;  
    }
    input[type=radio] {
        display: inline-block;
        margin-left: 45px;
    }
    input[type=checkbox] {
        display: inline-block;
        margin-right: 190px;
    }  
     
    button {
        padding: 10px;
        margin: 10px;
    }
</style>
</head>
<body>
    <div align="center">
        <h2>Search operation</h2>
        <form:form action="register" method="post" modelAttribute="user">
         
        
            <form:label path="countryName">Form List1:</form:label>
            <form:select path="countryName" items="${countryList}" /><br/>
            
             <form:label path="cityName">Form List2:</form:label>
            <form:select path="cityName" items="${cityList}" /><br/>
            
		  
		            
            
                <form:label path="keywords">Full name:</form:label>
            <form:input path="keywords" value="${attribute}"/><br/> 
               
            <form:button>Submit</form:button>
        </form:form>
    </div>
</body>
</html>