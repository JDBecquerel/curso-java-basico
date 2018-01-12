package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

public class lista2Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as notas do aluno para calcular a m�dia, n1: ");
		double n1 = scan.nextDouble();
		
		System.out.println("n2: ");
		double n2 = scan.nextDouble();
		
		double media = (n1 + n2)/2;
		
		String conceito = "";
		
		if(media > 9 && media <= 10){
			conceito = "A";
			
		}
		
		else if( media > 7.5 && media <= 9){
			
			conceito = "B";
		}
		
		else if( media >= 6 && media <= 7.5 ){
			
			conceito = "C";
		}
		
		else if ( media > 4 && media < 6){
			
			conceito = "D";
		}
		
		else if(media > 0 && media <= 4){
			
			conceito = "E";
		}
		
		System.out.println("Nota 1: " + n1);
		System.out.println("Nota 2: " + n2);
		System.out.println("Media: " + media);
		System.out.println("Conceito: " + conceito);
		
		switch(conceito){
		
		case "A":
		case "B":
		case "C": System.out.println("APROVADO."); break;
		case "D":
		case "E": System.out.println("REPROVADO."); break;
			
			
		}
		
		
		
		

	}

}
