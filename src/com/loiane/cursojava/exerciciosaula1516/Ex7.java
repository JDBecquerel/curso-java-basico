package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double maior = Integer.MIN_VALUE;
		double num;
		
		for(int i = 1; i <= 5; i++){
			
			System.out.println("Insira o " + i + "º número.");
			num = scan.nextDouble();
			
			if(maior < num){
				maior = num;
			}
			
			
		}
		
		System.out.println("O maior número é: " + maior);
		
		
	}

}
