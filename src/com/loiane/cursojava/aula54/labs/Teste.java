package com.loiane.cursojava.aula54.labs;

import com.loiane.cursojava.aula54.labs.Formulario.Genero;

public class Teste {

	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.SEGUNDA;
		
		System.out.println(dia.toString() + " - " + dia.getValor());

		Data data = new Data(1,4,2026, DiaSemana.DOMINGO);
		Data data2 = new Data();
		
		Formulario formularioGenero = new Formulario();
		Genero genero = Genero.FEMININO;
		formularioGenero.setGenero(genero);
		System.out.println(genero.getValor());
		System.out.println(formularioGenero.getNome() + " - "  + formularioGenero.getGenero());
	}
}
