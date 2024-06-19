<%-- 
    Document   : index
    Created on : Jun 14, 2024, 8:43:39 PM
    Author     : marua
--%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

    <head>

        <title>Lista de tareas</title>

</head>

<body>

    <h1>Lista de tareas</h1>

    <form action="AgregarTarea" method="post">

        Tarea: <input type="text" name="task" />

        <input type="submit" value="Add Task" />

    </form>

    <h2>Tareas:</h2>

    <ul>

        <c:forEach var="task" items="${tasks}">

            <li>${task}</li>

        </c:forEach>

    </ul>

</body>

</html>
