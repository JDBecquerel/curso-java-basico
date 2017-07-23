package com.loiane.cursojava.exerciciosaula14;

import java.util.Scanner;

public class lista2Ex1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite o 2º número: ");
		int n2 = scan.nextInt();
		
		if(n1 > n2){
			
			System.out.println("O maior número é: " + n1);
		}
		
		else{
			
			System.out.println("O maior número é: " + n2);
		}
	}

}
