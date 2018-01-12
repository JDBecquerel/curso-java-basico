package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double num = 0;
		
		while(num < 1 || num > 10){
			System.out.println("Insira o n�mero para calcular sua tabuada, entre 1 e 10: ");
			num = scan.nextDouble();
		}
		
		
		System.out.println("Tabuada de " + num + "\n");
		for(int i = 1; i <= 10; i++){
			System.out.println(num + " X " + i + " = " + (num*i) );
		}

	}

}
