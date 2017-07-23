 package com.loiane.cursojava.exerciciosaula14;

import java.util.Scanner;

public class lista2Ex21 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual combust�vel (gasolina - G ou �lcool - A)?");
		String op = scan.next();
		
		switch(op){
		
		case "gasolina":
		case "Gasolina":
		case "G":
		case "g":
			
			System.out.println("Quantos litros de gasolina? ");
			double qtd = scan.nextDouble();
			double valor = qtd*2.5;
			
			if(qtd <= 20){
				
				valor = valor - valor*0.4;
				System.out.println("o valor a ser pago pelo cliente �: R$ " + valor);
			}
			
			else{
				
				valor = valor - valor*0.06;
				System.out.println("o valor a ser pago pelo cliente �: R$ " + valor);
			}
		
		
		
		break;
			
		case "�lcool":
		case "Alcol":
		case "álcool":
		case "alcool":
		case "A":
		case "a":
			
			System.out.println("Quantos litros de �lcool? ");
			double qt = scan.nextDouble();
			double val = qt*1.9;
			
			if(qt <= 20){
				
				val = val - val*0.03;
				System.out.println("o valor a ser pago pelo cliente �: R$ " + val);
				
			}
			
			else{
				
				val = val - val*0.05;
				System.out.println("o valor a ser pago pelo cliente é: R$ " + val);
			}
		
		}

	}

}
