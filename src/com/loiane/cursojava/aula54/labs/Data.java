package com.loiane.cursojava.aula54.labs;

public class Data {

	private int dia;
	private int ano;
	private int mes;
	private DiaSemana diaSemana;
	
	
	public Data(int dia, int ano, int mes, DiaSemana diaSemana) {
		super();
		this.dia = dia;
		this.ano = ano;
		this.mes = mes;
		this.diaSemana = diaSemana;
	}
	
	public Data() {
		super();
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public DiaSemana getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}
	
	
}
