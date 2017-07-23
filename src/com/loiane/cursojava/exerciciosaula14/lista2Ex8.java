package com.loiane.cursojava.exerciciosaula14;

import java.util.Scanner;

public class lista2Ex8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double prod1, prod2, prod3;
		
		System.out.println("Digite o preço do primeiro produto: ");
		prod1 = scan.nextDouble();
		
		System.out.println("Digite o preço do segundo produto: ");
		prod2 = scan.nextDouble();
		
		System.out.println("Digite o preço do terceiro produto: ");
		prod3 = scan.nextDouble();
		
		
		
		//
		
		if(prod1 < prod2 && prod1 < prod3){
			
			System.out.println("Comprar produto um.");
		}
		else if(prod2 < prod1 && prod2 < prod3){
			System.out.println("Comprar produto dois.");
		}
		
		else{
			System.out.println("Comprar produto três.");
		}

	}

}
