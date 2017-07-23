package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		double soma = 0;
		double media = 0;
		double num = 0;
		
		
		for(int i = 1; i <= 5; i++){
			
			System.out.println("Insira a " + i + "ª nota.");
			num = scan.nextDouble();
			soma = soma + num;
			
		}
		
		media = soma/5;
		
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
	}

}
