<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
//Scriptlet tag:- all java code run here
<%
int a= 10;
if(a>10){
	out.println("a is less than 10");
}
else{
	out.println("a is greater than 10");
}
for(int i= 1;i<5;i++){
	out.println(i);
}
//String name = Request.getAttribute(name);
%>
//Expression Tag:- basically used to print any value
<%= a%>
//Declaration Tag :- basically used to declaier the methods and variables
<%!
	int b= 50;
	int square(){
		return b*b;
	}
	%>

</body>
</html>