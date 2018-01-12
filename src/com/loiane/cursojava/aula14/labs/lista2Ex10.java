package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

public class lista2Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o turno que vc estuda (M, N ou V): ");
		char turno = scan.next(".").charAt(0);
		
		switch(turno){
		
		case 'm':
		case 'M': System.out.println("Bom dia!"); break;
		
		case 'n':
		case 'N': System.out.println("Boa noite!"); break;
		
		case 'v':
		case 'V': System.out.println("Boa tarde!"); break;
		default: System.out.println("Valor inv�lido.");
		
		}
		
		
		
		
		

	}

}
