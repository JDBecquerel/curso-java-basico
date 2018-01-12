package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double contPar = 0, contImpar = 0;
		double num = 0;
		
		for(int i = 1; i <= 10; i++){
			
			System.out.println("Insira o " + i + "� n�mero: ");
			num = scan.nextDouble();
			
			if(num%2 == 0){
				contPar++;
			}
			
			else{
				contImpar++;
			}
		}
		
		System.out.println("A quantidade de n�meros pares:  " + contPar);
		System.out.println("A quantidade de n�meros �mpares: " + contImpar);

	}

}
