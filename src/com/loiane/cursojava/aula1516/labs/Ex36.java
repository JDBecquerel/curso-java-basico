package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double soma = 0, N = 1;
		
		System.out.println("Quantos termos a s�rie deve conter? ");
		int term = scan.nextInt();
		
		System.out.print("H = ");
		
		for(int i = 0; i < term; i++){
			if(i == term - 1){
				System.out.print("1/" + N + " + ... + 1/N");
			}
			else if( i >= 1 && i != term - 1 ){
				
				System.out.print("1/" + N + " + ");
				
			}
			else{
				System.out.print("1 + ");
			}
			N++;
			soma = soma + 1/N;
		}
		
		System.out.print("\nSoma: " + soma);

	}
}
