package com.loiane.cursojava.exerciciosaula13;

import java.util.Scanner;

public class Inteiros21Real {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int primeiro, segundo, produto, aux;
		double terceiro, soma;
		
		System.out.println("Digite 2 números inteiro e 1 real: ");
		primeiro = scan.nextInt();
		segundo = scan.nextInt();
		terceiro = scan.nextFloat();
		
		
	//a	
		
		produto = (2*primeiro)*(segundo/2);
		
		System.out.println("o produto do dobro do primeiro com metade do segundo: " + produto);
		
   //b
		
		soma = (3*primeiro) + terceiro;
		
		System.out.println("\nsoma do triplo do primeiro com o terceiro" + soma);
   //c
		terceiro = terceiro*terceiro*terceiro;
		
		System.out.println("\nterceiro^3: " + terceiro);
			
		
	}
	
}

	

		
