package com.loiane.cursojava.aula56.labs.exercCalc;

public enum OperacaoMatematica {

	SOMA('+') {
		@Override
		public double executarOperacao(double n1, double n2) {
			return n1 + n2;
		}
	}, SUBTRACAO('-') {
		@Override
		public double executarOperacao(double n1, double n2) {
			return n1 - n2;
		}
	}, DIVISAO('/') {
		@Override
		public double executarOperacao(double n1, double n2) {
			return n1/n2;
		}
	}, MULTIPLICACAO('*') {
		@Override
		public double executarOperacao(double n1, double n2) {
			return n1*n2;
		}
	};
	
	private char valor;
	
	private OperacaoMatematica(char valor){
		this.valor = valor;
	}
	
	public abstract double executarOperacao(double n1, double n2);
	
}
