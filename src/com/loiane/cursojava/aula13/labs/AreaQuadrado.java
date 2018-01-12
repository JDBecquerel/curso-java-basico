package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		
		double area, L;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado para calcular sua area: ");
		L = scan.nextDouble();
		
		area = Math.pow(L, 2);
		
		System.out.println("O dobro da area do quadrado: " + 2*area);
		
		

	}

}
