package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		double base = 0;
		double expoente = 0;
		double aux = 0;
		
		System.out.println("Insira a base: ");
		base = scan.nextDouble();
		
		System.out.println("Insira o expoente: ");
		expoente = scan.nextDouble();
		
		aux = base;
		for(int i = 1; i < expoente; i++){
			base = base*aux;
		}
		
		System.out.println("Resultado: " + base);

	}

}
