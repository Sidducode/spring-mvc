<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.springmvc.dto.Employee,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>virat  kohli</h1>
  
  <%
  
  List<Employee> employees=(List<Employee>)request.getAttribute("employees");
  
  for (int i = 0; i < employees.size(); i++)
      System.out.print(employees.get(i) + " ");

  
  for (Employee e: employees){
  out.println(e.getId());
  out.println(e.getName());
}
  
  %>
</body>
</html>