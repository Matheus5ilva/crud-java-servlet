package br.com.alura.gerenciador.servlet;

import java.util.Date;

public class Empresa {

	private Integer id = 0;
	private String nome;
	private Date dataAbertura = new Date();

	public Empresa() {
		this.id = id + 1;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	@Override
	public boolean equals(Object empresa) {
		System.out.println("entrei no metodo equals");
		if (this.getId() == ((Empresa) empresa).id) {
			return true;
		}
		return false;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

}
