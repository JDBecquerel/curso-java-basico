package com.loiane.cursojava.exerciciosaula14;

import java.util.Scanner;

public class lista2Ex18 {
	
	public static void main(String[] args){
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número para determinar se é ímpar ou par: ");
		int num = scan.nextInt();
		
		if(num%2 == 0){
			
			System.out.println("O número é par");
		}
		
		else{
			
			System.out.println("O número é ímpar");
		}
		
	}
}
