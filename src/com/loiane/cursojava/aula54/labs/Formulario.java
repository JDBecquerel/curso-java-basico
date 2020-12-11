package com.loiane.cursojava.aula54.labs;

public class Formulario {
	
	enum Genero{
		FEMININO('F'), MASCULINO('M');
		
		private char valor;
		
		Genero(char valor){
			this.valor = valor;
		}

		public char getValor() {
			return valor;
		}

		public void setValor(char valor) {
			this.valor = valor;
		}

	}
	
	private Genero genero;
	private String nome;
	
	public Genero getGenero() {
		return genero;
	}
	public String getNome() {
		return nome;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
