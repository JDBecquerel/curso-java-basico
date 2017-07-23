package com.loiane.cursojava.exerciciosaula14;

import java.util.Scanner;

public class lista2Ex6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o 1º número: ");
		double n1 = scan.nextDouble();
		
		System.out.println("Digite o 2º número: ");
		double n2 = scan.nextDouble();
		
		System.out.println("Digite o 3º número: ");
		double n3 = scan.nextDouble();
		
		if( n3 > n2 && n3 > n1){
			
			System.out.println("O maior número é " + n3);
		}
		
		else if( n1 > n2 && n1 > n3){
			
			System.out.println("O maior número é " + n1);
		}
		
		else{
			
			System.out.println("O maior número é " + n2);
		}

		

	}

}
