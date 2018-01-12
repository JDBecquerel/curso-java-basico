package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

public class lista2Ex3 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o sexo (F-M): ");
		char sexo = scan.next(".").charAt(0);
		
		if(sexo == 'F' || sexo == 'f'){
			
			System.out.println("F - feminino");
		}
		
		else if(sexo == 'M' || sexo == 'm'){
			
			System.out.println("M - masculino");
		}
		
		else{
			System.out.println("Sexo invalido");
		}
		

	}

}
