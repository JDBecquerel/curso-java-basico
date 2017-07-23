package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double soma = 0;
		double numerador = 1, denominador = 1;
		
		System.out.print("Quantos termos a série deve conter?");
		int n = scan.nextInt();
		
		
		
		System.out.print("H = ");
		
		for(int i = 1; i <= n  ; i++){
				if(i >= 1 && i < n-1){
					System.out.print("1/" + denominador + " + ");
				}
				else if(i == n-1){
					System.out.print("1/" + denominador + " + ... + 1/N");
				}
				else{
					System.out.print("1 + ");
				}
				soma = soma + (1/denominador);
				denominador++;
		}
		
		System.out.println("\nSoma: "+ soma);

	}

}
