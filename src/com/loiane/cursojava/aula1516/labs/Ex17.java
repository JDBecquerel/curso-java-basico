package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int fat;
		
		System.out.print("Digite o n�mero para calcular seu fatorial: ");
		fat = scan.nextInt();
	
		
		for(int aux = (fat - 1); aux > 0 ; aux--){
			fat = fat*aux;
		}
		
		System.out.print("O seu fatorial �: " + fat);

	}

}
