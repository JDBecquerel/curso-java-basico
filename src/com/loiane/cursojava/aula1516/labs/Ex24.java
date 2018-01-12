package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		double valor = 0.18;
		
		 System.out.println("Pre�o do p�o: R$ 0.18 \nPanificadora P�o de ontem - Tabela de pre�os");
		 
		 for(int i = 1; i <= 50; i++){
			 System.out.println(i + " - R$ " + valor*i);
		 }

	}

}
