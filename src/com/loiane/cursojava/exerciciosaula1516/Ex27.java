package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		double temperatura = 0, total = 0, media = 0;
		double maiorTemp = Double.MIN_VALUE, menorTemp = Double.MAX_VALUE;
		int i = 0;
		
		
		System.out.println("Medindo a temperatura\n"
				+ "Entre com a quatidade de temperaturas: ");
		int qtd = scan.nextInt();
		
			
				for(int j = 0; i < qtd; j++){
					i++;
					System.out.print(i + "º (ºC): ");
					temperatura = scan.nextDouble();
					
					if(temperatura > maiorTemp){
						maiorTemp = temperatura;
					}
					
					if(temperatura < menorTemp){
						menorTemp = temperatura;
					}
					
					total = total + temperatura;
					
				}
				
				media = total/i;
				
				System.out.println("\nA maior temperatura é: " + maiorTemp);
				System.out.println("A menor temperatura é: " + menorTemp);
				System.out.println("media: " + media + " ºC\n");
				
				
				
		

	}

}
