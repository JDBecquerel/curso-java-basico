package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double contPar = 0, contImpar = 0;
		double num = 0;
		
		for(int i = 1; i <= 10; i++){
			
			System.out.println("Insira o " + i + "º número: ");
			num = scan.nextDouble();
			
			if(num%2 == 0){
				contPar++;
			}
			
			else{
				contImpar++;
			}
		}
		
		System.out.println("A quantidade de números pares:  " + contPar);
		System.out.println("A quantidade de números ímpares: " + contImpar);

	}

}
