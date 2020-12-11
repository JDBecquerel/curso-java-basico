package com.loiane.cursojava.aula54.labs;

import com.loiane.cursojava.aula54.labs.Formulario.Genero;
import com.loiane.cursojava.aula54.labs.Formulario2.OpcaoFormulario;

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
		
		Formulario2 formularioComida = new Formulario2();
		OpcaoFormulario comida = OpcaoFormulario.ARROZ;
		formularioComida.setEscolhaComida(comida);
		
		//o FEMININO, ARROZ etc é para o usuário enquanto o valor para o db
		
		System.out.println(formularioComida.getEscolhaComida() + " - " + comida.getValor());
	}
}
