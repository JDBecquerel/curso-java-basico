package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int fat = 0;
		double aux = 0;
		
		System.out.println("Digite o n�mero para calcular seu fatorial");
		fat = scan.nextInt();
		
		System.out.println("Fatorial de: " + fat);
		System.out.print(fat + "! = " + fat);
		
		for(int i = fat-1; i >= 1; i--){
			
			System.out.print("." + i);
			fat = fat*i;
			
		}
		
		System.out.println(" = " + fat);

	}

}
