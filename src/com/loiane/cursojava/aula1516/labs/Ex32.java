package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double valor = 0, valItem, total = 0;
		int cod = 1;
		int qtd = 0;
		String output = "";
		
		
		while(true){
			System.out.println("	CARDAPIO\n\nEspecifica��o	C�digo	Pre�o"
					+ "\nCachorro quente	100	R$ 1,20"
					+ "\nBauru simples	101	R$ 1,30"
					+ "\nBauru com ovo	102	R$ 1,50"
					+ "\nHamb�rguer	103	R$ 1,20"
					+ "\nCheeseBurguer	104	R$ 1,30"
					+ "\nRefrigerante	105	R$ 1,00\n");
			
			System.out.print("Insira o c�digo do item, para encerrar c�digo = 000: ");
			cod = scan.nextInt();
			
			System.out.print("Digite a quantidade: ");
			qtd = scan.nextInt();
			
			if(cod == 0){
				output += "Total a pagar = " +  total;
				
				break;
			}
			
			if(cod == 100){
				valor = 1.20;
				output += "Cachorro Quente -> 1,20*" +  qtd;
				output += " = " + (1.20*qtd) + "\n";
			}
			else if(cod == 101){
				valor = 1.30;
				output += "Bauru Simples -> 1,30*" +  qtd;
				output += " = " + (1.30*qtd) + "\n";
			}
			else if(cod == 102){
				valor = 1.50;
				output += "Bauru com Ovo -> 1,50*" +  qtd;
				output += " = " + (1.50*qtd) + "\n";
			}
			else if(cod == 103){
				valor = 1.20;
				output += "Hamb�rguer -> 1,20*" +  qtd;
				output += " = " + (1.20*qtd) + "\n";
			}
			else if(cod == 104){
				valor = 1.30;
				output += "Cheeseburguer -> 1,30*" +  qtd;
				output += " = " + (1.30*qtd) + "\n";
			}
			else if(cod == 105){
				valor = 1.00;
				output += "Refrigerante -> 1,00*" +  qtd;
				output += " = " + (1.0*qtd) + "\n";
			}
			
			
			
			valItem = valor*qtd;
			total = total + valItem;
			
		}
		
		System.out.println(output);
		
	}

}
