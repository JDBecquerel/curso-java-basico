package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double soma = 0;
		double media;
		double nota;
		int n;
		
		System.out.println("Insira quantas notas deseja inserir: ");
		n = scan.nextInt();
		
		for(int i = 1; i <= n; i++){
			
			System.out.println("Insira a " + i + "� nota: ");
			nota = scan.nextDouble();
			
			soma = soma + nota;
		}
		
		media = soma/n;
		
		System.out.println("A m�dia de " + n + " notas �: " + media);
		

	}

}
