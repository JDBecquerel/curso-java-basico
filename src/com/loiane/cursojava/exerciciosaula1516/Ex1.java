package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double num;
		
		System.out.println("Insira um número de 0 a 10: ");
		num = scan.nextDouble();
		
		do{
			
			
			if(num < 0 || num > 10){
				System.out.println("Número inválido, informe um valor válido:");
				num = scan.nextDouble();
			}	
		}while(num < 0 || num > 10);

	}

}
