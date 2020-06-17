package com.prova.poo.entidades;

public class Exames {

	private int id;

	private String nome;
	private String metodo;
	private String resultado;
	private String paciente;
	private String doutor;

	public Exames() {

	}

	public Exames(String nome, String metodo, String resultado, String paciente, String doutor) {
		setNome(nome);
		setMetodo(metodo);
		setResultado(resultado);
		setPaciente(paciente);
		setDoutor(doutor);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getDoutor() {
		return doutor;
	}

	public void setDoutor(String doutor) {
		this.doutor = doutor;
	}

}
