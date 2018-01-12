package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		
		double altura, pesoIdeal;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a altura para saber o peso ideal: ");
		altura = scan.nextDouble();
		
		pesoIdeal = (72.7*altura) - 58;
		
		System.out.println("Seu peso ideal �: " + pesoIdeal);
		

	}

}
