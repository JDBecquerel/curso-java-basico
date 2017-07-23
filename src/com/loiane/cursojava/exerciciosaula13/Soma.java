package com.loiane.cursojava.exerciciosaula13;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Numero 1 = ");
		int num1 = scan.nextInt();
		
		System.out.print("Numero 2 = ");
		int num2 = scan.nextInt();
		
		int soma = num1 + num2;
		System.out.println("A soma é: " + soma);

	}

}
