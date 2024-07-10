<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        #q{
            background-color: yellow;
            margin-right: 75%;
           
        }
    </style>
</head>
<body>
<form action="second" method="post">
        <div id="q">
            <h1>Personal Details</h1>
            HighestDegree:<input type="text" name="hd"><br><br>
            YearOfPassedOut:<input type="text" name="yop"><br><br>
            University:<input type="text" name="uv"><br><br>
            <input type="submit" value="submit" style="background-color: aliceblue;">
        </div>
    </form>
</body>
</html>