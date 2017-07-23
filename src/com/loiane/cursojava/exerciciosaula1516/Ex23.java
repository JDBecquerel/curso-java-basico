package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double valor = 1.99;
		
		 System.out.println("TABELA DE PREÇOS 1 - 50 itens\n");
		 
		 for(int i = 1; i <= 50; i++){
			 System.out.println(i + " - R$ " + valor*i);
		 }

	}

}
