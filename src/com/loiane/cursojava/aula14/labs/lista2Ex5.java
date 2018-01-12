package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

public class lista2Ex5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota: ");
		double n1 = scan.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		double n2 = scan.nextDouble();
		
		double media = (n1 + n2)/2;
		
		if(media == 10){
			System.out.println("Aprovado com distin��o.");
		}
		
		else if(media >= 7){
			System.out.println("Aprovado");
		}
		
		else{
			System.out.println("Reprovado.");
		}
	}

}
