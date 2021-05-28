<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/editarEmpresa" var="linkServletEditarEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${empresas}" var="empresa">
		<c:if test="${empresa.id == id}">

			<form action="${linkServletEditarEmpresa}" method="post">

				<input type="hidden" name="id" value="${empresa.id }" /> Nome: <input
					type="text" name="nome" value="${empresa.nome }" /> Data Abertura:
				<input type="text" name="data" value="<fmt:formatDate
					value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />" />
				<input type="submit" />
			</form>
		</c:if>
	</c:forEach>
</body>
</html>