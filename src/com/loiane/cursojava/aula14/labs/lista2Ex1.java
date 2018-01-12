package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

public class lista2Ex1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero: ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		int n2 = scan.nextInt();
		
		if(n1 > n2){
			
			System.out.println("O maior n�mero �: " + n1);
		}
		
		else{
			
			System.out.println("O maior n�mero �: " + n2);
		}
	}

}
