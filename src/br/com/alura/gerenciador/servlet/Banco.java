package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		empresa.setId(chaveSequencial++);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		empresa2.setId(chaveSequencial++);
		lista.add(empresa);
		lista.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}

	public void remove(Empresa empresa) {
		if (Banco.lista.contains(empresa)) {
			Banco.lista.remove(empresa);
		}
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void update(Empresa empresa) {
		if (Banco.lista.contains(empresa)) {
			Banco.lista.remove(empresa);
			Banco.lista.add(empresa);
		}
	}

}
