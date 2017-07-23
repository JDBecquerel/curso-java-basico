package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double soma = 0;
		double numerador = 1, denominador = 1;
		
		System.out.print("Quantos termos a série deve conter?");
		int n = scan.nextInt();
		
		System.out.print("S = ");
		
		for(int i = 0; i < n; i++){
				if(i == n-1){
					System.out.print(numerador + "/" + denominador + " + ... + n/m");
				}
				else{
					System.out.print(numerador + "/" + denominador + "  + ");
				}
				soma = soma + (numerador/denominador);
				numerador++;
				denominador = denominador + 2;
		}
		
		System.out.println("\nSoma: "+ soma);

	}

}
