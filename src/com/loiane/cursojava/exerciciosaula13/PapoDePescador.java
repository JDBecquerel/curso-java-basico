package com.loiane.cursojava.exerciciosaula13;

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
			
			System.out.println("O excesso é de " + excesso + 
					"\nEntão tem de pagar uma multa de R$" + multa);
		}
		
		else{
			
			excesso = 0;
			multa = 0;
			
			System.out.println("Excesso é " + excesso + "\nEntão a multa é de R$ " + multa);
		}

	}

}
