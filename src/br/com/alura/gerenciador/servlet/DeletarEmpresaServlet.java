package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeletarEmpresaServlet
 */
@WebServlet("/deletarEmpresa")
public class DeletarEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String id = request.getParameter("id");
		
		Empresa empresa = new Empresa();
		empresa.setId(Integer.parseInt(id));
		
		Banco banco = new Banco();
		banco.remove(empresa);
		
		 response.sendRedirect("listaEmpresas");
		
	}
}
