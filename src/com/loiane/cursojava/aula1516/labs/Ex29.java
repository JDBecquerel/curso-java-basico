package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o limite final do intervalo para mostrar os n�meros primos:");
		int num = scan.nextInt();
		
		int i = 1, cont = 0;
		
		while(i <= num){
			cont = 0;
			
			for(int j = 1; j <= i; j++){
				
				if(i%j == 0 && i%1 == 0){
					cont++;
				}
			}
			
			if(cont <= 2){
				System.out.print(i + " ");
			}
			
			i++;
		}
		
		 

	}

}
