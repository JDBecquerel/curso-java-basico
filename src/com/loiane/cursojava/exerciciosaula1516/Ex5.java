package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double taxaA = 0;
		double taxaB = 0;
		double popB = 0;
		double popA = 0;
		int anos = 0;
		

		
		
		
		while(popB <= 0){
			System.out.println("População de B: ");
			popB = scan.nextDouble();
			
			if(popB <= 0){
				System.out.println("Inválido, tente novamente.");
			}
		}
		
		while(popA <= 0){
			
			System.out.println("População de A: ");
			popA = scan.nextDouble();
			
			if(popA <= 0){
				System.out.println("Inválido, tente novamente.");
			}
		}
		
		if(popA < popB){
			
			while(taxaA <= 0){
				System.out.println("Insira a taxa(%) de crescimento populacional para a cidade A: ");
				taxaA = scan.nextDouble();
				taxaA = (taxaA)/100;
				
			}
			
			
			while(taxaB <= 0 || taxaB > taxaA){
				System.out.println("Insira a taxa(%) de crescimento populacional para a cidade B: ");
				taxaB = scan.nextDouble();
				taxaB = (taxaB)/100;
				
			}
			
			
			
			while(popA < popB){
				popA = popA + popA*taxaA;
				popB = popB + popB*taxaB;
				anos++;
				System.out.println("A: " + popA + "; B: " + popB + "; anos: " + anos);
			}
			
			if(popA > popB){
				System.out.println("\nLevaria " + anos + " anos para que A ultrapasse B");
			}
			
			else if ( popA == popB){
				System.out.println("\nLevaria " + anos + " anos para que A alcance B");
			}
			
		}
		
		else{
			
			while(taxaA <= 0){
				System.out.println("Insira a taxa(%) de crescimento populacional para a cidade A: ");
				taxaA = scan.nextDouble();
				taxaA = (taxaA)/100;
				
			}
			
			
			while(taxaB <= 0 || taxaA > taxaB){
				System.out.println("Insira a taxa(%) de crescimento populacional para a cidade B: ");
				taxaB = scan.nextDouble();
				taxaB = (taxaB)/100;
				
			}
			
			
			
			while(popB < popA){
				popA = popA + popA*taxaA;
				popB = popB + popB*taxaB;
				anos++;
				System.out.println("A: " + popA + "; B: " + popB + "; anos: " + anos);
			}
			
			if(popB > popA){
				System.out.println("\nLevaria " + anos + " anos para que B ultrapasse A");
			}
			
			else if ( popA == popB){
				System.out.println("\nLevaria " + anos + " anos para que B alcance A");
			}
			
		}
		
		
		
		

	}

}
