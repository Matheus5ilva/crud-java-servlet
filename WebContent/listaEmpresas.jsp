<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.List, br.com.alura.gerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/mostrarEmpresa" var="linkServletEditarEmpresa" />
<c:url value="/deletarEmpresa" var="linkServletDeletarEmpresa" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty empresa}">
            Empresa ${ empresa } cadastrada com sucesso!
    </c:if>
	<br /> Lista de empresas:
	<br />
	<ul>
		<c:forEach items="${empresas }" var="empresa">

			<li>${empresa.id} - ${empresa.nome} - <fmt:formatDate
					value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" /> / <a
				href="${linkServletEditarEmpresa}?id=${empresa.id}">Editar</a> - <a
				href="${linkServletDeletarEmpresa}?id=${empresa.id}">Apagar</a></li>
		</c:forEach>
	</ul>

</body>
</html>