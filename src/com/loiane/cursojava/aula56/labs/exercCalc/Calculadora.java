package com.loiane.cursojava.aula56.labs.exercCalc;

public class Calculadora {

	private OperacaoMatematica operacao;
	private int resultado;
	
	public OperacaoMatematica getOperacao() {
		return operacao;
	}
	public void setOperacao(OperacaoMatematica operacao) {
		this.operacao = operacao;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	@Override
	public String toString() {
		return "Calculadora [operacao=" + operacao + "]";
	}
	
}
