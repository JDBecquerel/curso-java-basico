package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		int raio;
		double areaC;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para calcular o valor da area do c�rculo digite o valor do raio: ");
		raio = scan.nextInt();

		areaC = raio*raio*Math.PI;
		
		System.out.println("A area do circulo �: " + areaC);
		
	}

}
