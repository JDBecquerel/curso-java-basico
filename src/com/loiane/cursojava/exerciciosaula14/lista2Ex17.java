package com.loiane.cursojava.exerciciosaula14;

import java.util.Scanner;

public class lista2Ex17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um ano para calcular se ele é bissexto: ");
		int ano = scan.nextInt();
		
		if(ano%4 == 0){
			if(ano%100 != 0){
				System.out.println("O ano é bissexto.");
			}
		}
		
		else if(ano%400 == 0){
			System.out.println("O ano é bissexto.");
		}
		
		else{
			System.out.println("O ano não é bissexto.");
		}

	}

}
