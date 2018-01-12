package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class PapoDePescador {

	public static void main(String[] args) {
		
		
		double peso, excesso, multa;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		peso = scan.nextDouble();
		
		System.out.println("Sendo o peso de " + peso + " Kg");
		
		if(peso > 50){
			excesso = peso - 50;
			multa = excesso*4;
			
			System.out.println("O excesso � de " + excesso + 
					"\nEnt�o tem de pagar uma multa de R$" + multa);
		}
		
		else{
			
			excesso = 0;
			multa = 0;
			
			System.out.println("Excesso � " + excesso + "\nEnt�o a multa � de R$ " + multa);
		}

	}

}
