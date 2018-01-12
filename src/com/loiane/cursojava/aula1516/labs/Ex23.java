package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double valor = 1.99;
		
		 System.out.println("TABELA DE PRE�OS 1 - 50 itens\n");
		 
		 for(int i = 1; i <= 50; i++){
			 System.out.println(i + " - R$ " + valor*i);
		 }

	}

}
