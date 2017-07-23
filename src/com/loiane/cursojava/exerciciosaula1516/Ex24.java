package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		double valor = 0.18;
		
		 System.out.println("Preço do pão: R$ 0.18 \nPanificadora Pão de ontem - Tabela de preços");
		 
		 for(int i = 1; i <= 50; i++){
			 System.out.println(i + " - R$ " + valor*i);
		 }

	}

}
