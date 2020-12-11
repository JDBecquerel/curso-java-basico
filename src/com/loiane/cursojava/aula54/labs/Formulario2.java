package com.loiane.cursojava.aula54.labs;

public class Formulario2 {
	
	enum OpcaoFormulario {
		
		ARROZ(1), FEIJAO(2), MACARRAO(3) , CARNE(4);
		
		private int valor;
		
		OpcaoFormulario(int valor){
			this.valor = valor;
		}

		public int getValor() {
			return valor;
		}
		
	}
	
	private String nome;
	private OpcaoFormulario escolhaComida;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public OpcaoFormulario getEscolhaComida() {
		return escolhaComida;
	}
	public void setEscolhaComida(OpcaoFormulario escolhaComida) {
		this.escolhaComida = escolhaComida;
	}

}
