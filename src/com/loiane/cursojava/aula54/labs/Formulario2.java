package com.loiane.cursojava.aula54.labs;

public class Formulario2 {
	
	enum OpcaoFormulario {
		
		OP1("Arroz"), OP2("Feijao"), OP3("Macarrão") , OP4("Carne");
		
		private String valor;
		
		OpcaoFormulario(String valor){
			this.valor = valor;
		}
	}
	
	private String nome;
	private OpcaoFormulario escolhaComida;

}
