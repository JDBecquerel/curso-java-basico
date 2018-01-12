package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

public class lista2Ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double l1, l2, l3;
		
		System.out.println("Informe os tr�s lados do tri�ngulo, lado 1: ");
		l1 = scan.nextDouble();
		
		System.out.println("Lado 2: ");
		l2 = scan.nextDouble();
		
		System.out.println("Lado 3: ");
		l3 = scan.nextDouble();
		
		
		if( (l1 + l2) > l3 && (l1 + l3) > l2 && (l2 + l3) > l1){
			
			
			if(l1 == l2 && l2 == l3){
				
				System.out.print("� um tri�ngulo equilatero.");
			}
			
			else if(l1 == l2 || l1 == l3 || l2 == l3){
				System.out.print("� um tri�ngulo isoceles.");
			}
			
			else{
				System.out.print("� um tri�ngulo escaleno.");
			}
			
		}
		
		else{
			
			System.out.println("N�o � um tri�ngulo.");
		}
		
		
	}

}
