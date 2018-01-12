package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double soma = 0, n = 1, m = 1;
		
		System.out.print("Quantos termos a série deve conter? ");
		int termos = scan.nextInt();
		
		System.out.print("S = ");
		
		for(int i = 0; i < termos; i++){
			if(i == termos - 1){
				System.out.print(n + "/" + m + " + ... + n/m");
			}
			else{
				System.out.print(n + "/" + m + " + ");
			}
			n++;
			m = m + 2;
			soma = soma + n/m;
		}
		
		System.out.println("\nSoma: " + soma);

	}

}
