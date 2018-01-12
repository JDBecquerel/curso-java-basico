package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

public class lista2Ex7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero: ");
		double n1 = scan.nextDouble();
		
		System.out.println("Digite o 2� n�mero: ");
		double n2 = scan.nextDouble();
		
		System.out.println("Digite o 3� n�mero: ");
		double n3 = scan.nextDouble();
		
		
		
		
		if( n3 > n2 && n3 > n1){
			
			System.out.println("O maior n�mero � " + n3);
		}
		
		else if( n1 > n2 && n1 > n3){
			
			System.out.println("O maior n�mero � " + n1);
		}
		
		else{
			
			System.out.println("O maior n�mero � " + n2);
		}
		
		
		
		
		if( n3 < n2 && n3 < n1){
			
			System.out.println("O menor n�mero � " + n3);
		}
		
		else if( n1 < n2 && n1 < n3){
			
			System.out.println("O menor n�mero � " + n1);
		}
		
		else{
			
			System.out.println("O menor n�mero � " + n3);
		}
		
		
		
		
		
		if( n3 < n2 && n3 < n1){
			
			System.out.println("O menor n�mero � " + n3);
		}
		
		else if( n1 < n2 && n1 < n3){
			
			System.out.println("O menor n�mero � " + n1);
		}
		
		else{
			
			System.out.println("O menor n�mero � " + n2);
		}

	}

}
