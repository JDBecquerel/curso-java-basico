package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double num;
		
		System.out.println("Insira um n�mero de 0 a 10: ");
		num = scan.nextDouble();
		
		do{
			
			
			if(num < 0 || num > 10){
				System.out.println("N�mero inv�lido, informe um valor v�lido:");
				num = scan.nextDouble();
			}	
		}while(num < 0 || num > 10);

	}

}
