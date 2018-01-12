package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double maior = Integer.MIN_VALUE;
		double num;
		
		for(int i = 1; i <= 5; i++){
			
			System.out.println("Insira o " + i + "� n�mero.");
			num = scan.nextDouble();
			
			if(maior < num){
				maior = num;
			}
			
			
		}
		
		System.out.println("O maior n�mero �: " + maior);
		
		
	}

}
