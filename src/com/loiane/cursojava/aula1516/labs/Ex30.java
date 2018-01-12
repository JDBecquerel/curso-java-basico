package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Montar a tabuada de: ");
		int num = scan.nextInt();
		
		System.out.print("Come�ar por: ");
		int inicio = scan.nextInt();
		
		System.out.print("Terminar em: ");
		int fim = scan.nextInt();
		
		while(fim < inicio){
			System.out.print("Final inv�lido.\nTerminar em: ");
			fim = scan.nextInt();
		}
		
		System.out.println("\nCome�ar por: " + inicio);
		System.out.println("Terminar em: " + fim);
		System.out.println("\nVou montar a tabuada de " + num + " come�ando em " + inicio + " e terminando em " + fim + ": ");
		
		for(int i = inicio; i <= fim; i++){
			
			System.out.println(num + " X " + i + " = " + num*i);
			
		}
		
		
	}

}
