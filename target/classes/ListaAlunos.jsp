<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Todos Alunos</title>
</head>
<body>
	<c:forEach var = "aluno" items ="${todosAlunos}">
		<c:choose>
			<c:when test="${aluno.nota >= 5}">
				<li>Aluno Aprovado: Nome:  ${aluno.nome} :   RA:  ${aluno.ra} :    NOTA: ${aluno.nota}</li>
			</c:when>
			<c:when test="${aluno.nota < 5}">
				<li>Aluno Reprovado: Nome:  ${aluno.nome} :   RA:  ${aluno.ra} :    NOTA:  ${aluno.nota}</li>
			</c:when>
		</c:choose>
	</c:forEach>
	
</body>
</html>