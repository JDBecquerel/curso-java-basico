package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

public class lista2Ex16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("PROGRAMA PARA CALCULAR VALORES DAS RA�ZES DA EQUA��O \n\n\n"
				+ "Informe os valores (a, b & c), a:");
		double a = scan.nextDouble();
		
		if(a != 0){
			
			System.out.println("b:");
			double b = scan.nextDouble();
			
			System.out.println("c:");
			double c = scan.nextDouble();
			
			double delta = Math.pow(b, 2) - (4*a*c);
			System.out.println("delta: " + delta);
			
			if(delta < 0){
				System.out.println("A equa��o n�o possui ra�zes reais. Programa encerrado.");
			}
			
			else if(delta == 0){
				double r = -b/2*a;
				System.out.println("A equa��o possui somente uma ra�z real: " + r);
				
			}
			
			
			else{
				double r1 = (-b + Math.sqrt(delta))/2*a;
				double r2 = (-b - Math.sqrt(delta))/2*a;
				
				System.out.println("A equa��o possui ra�zes e s�o, r1: " + r1 + " e r2: " + r2);
			}
		}
		
		else{
			System.out.println("A equa��o n�o � do segundo grau (a = 0). Programa encerrado.");
		}
		
		

	}

	

}
