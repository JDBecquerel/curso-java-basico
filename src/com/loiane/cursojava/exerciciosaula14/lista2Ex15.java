package com.loiane.cursojava.exerciciosaula14;

import java.util.Scanner;

public class lista2Ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double l1, l2, l3;
		
		System.out.println("Informe os três lados do triângulo, lado 1: ");
		l1 = scan.nextDouble();
		
		System.out.println("Lado 2: ");
		l2 = scan.nextDouble();
		
		System.out.println("Lado 3: ");
		l3 = scan.nextDouble();
		
		
		if( (l1 + l2) > l3 && (l1 + l3) > l2 && (l2 + l3) > l1){
			
			
			if(l1 == l2 && l2 == l3){
				
				System.out.print("É um triângulo equilatero.");
			}
			
			else if(l1 == l2 || l1 == l3 || l2 == l3){
				System.out.print("É um triângulo isoceles.");
			}
			
			else{
				System.out.print("É um triângulo escaleno.");
			}
			
		}
		
		else{
			
			System.out.println("Não é um triângulo.");
		}
		
		
	}

}
