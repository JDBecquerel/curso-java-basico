package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Montar a tabuada de: ");
		int num = scan.nextInt();
		
		System.out.print("Começar por: ");
		int inicio = scan.nextInt();
		
		System.out.print("Terminar em: ");
		int fim = scan.nextInt();
		
		while(fim < inicio){
			System.out.print("Final inválido.\nTerminar em: ");
			fim = scan.nextInt();
		}
		
		System.out.println("\nComeçar por: " + inicio);
		System.out.println("Terminar em: " + fim);
		System.out.println("\nVou montar a tabuada de " + num + " começando em " + inicio + " e terminando em " + fim + ": ");
		
		for(int i = inicio; i <= fim; i++){
			
			System.out.println(num + " X " + i + " = " + num*i);
			
		}
		
		
	}

}
