package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

public class lista2Ex18 {
	
	public static void main(String[] args){
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero para determinar se � �mpar ou par: ");
		int num = scan.nextInt();
		
		if(num%2 == 0){
			
			System.out.println("O n�mero � par");
		}
		
		else{
			
			System.out.println("O n�mero � �mpar");
		}
		
	}
}
