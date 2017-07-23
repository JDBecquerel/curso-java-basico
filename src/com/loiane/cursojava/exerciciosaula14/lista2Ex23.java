package com.loiane.cursojava.exerciciosaula14;

import java.util.Scanner;

public class lista2Ex23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double total;
		double qtdCarne = 0;
		
		System.out.println("Qual é o tipo da carne? ");
		String carne = scan.nextLine();
		
		System.out.println("Qual é a quantidade (Kg): ");
		qtdCarne = scan.nextDouble();
		
		System.out.println("A compra é feita no cartão tabajara?");
		String res = scan.next();
		
		
		switch(carne){
		
		
		case "File Duplo":
		case "File duplo":
		case "file Duplo":
		case "file duplo":
		case "Filé Duplo":
		case "Filé duplo":
		case "filé Duplo":
		case "filé duplo":
			
			
			if(qtdCarne <= 5){
				
				total = qtdCarne*4.9;
				
			}
			
			else{
				total = qtdCarne*5.8;
			}
			
			if(res.equals("sim") || res.equals("Sim")){
				
				double desconto = total*0.05;
				
				
				System.out.println("\nTipo de carne: " + carne + "\nQuantidade de carne: " + qtdCarne + " Kg" 
						+ "\nPreço total: R$ " + total + "\nTipo de pagamento: cartão" + "\nValor do desconto : R$ "
						+ desconto + "\nValor a pagar: R$ " + (total - desconto));
			}
			
			else{
				
				double desconto = 0;
				
				
				System.out.println("\nTipo de carne: " + carne + "\nQuantidade de carne: " + qtdCarne + " Kg" 
						+ "\nPreço total: R$ " + total + "\nTipo de pagamento: dinheiro" + "\nValor do desconto : R$ "
						+ desconto + "\nValor a pagar: R$ " + (total - desconto));
				
			}
			
			
		break;
		
		
		case "Alcatra":
		case "alcatra":
			
			if(qtdCarne <= 5){
				
				total = qtdCarne*5.9;
				
			}
			
			else{
				total = qtdCarne*6.8;
			}
			
			if(res.equals("sim") || res.equals("Sim")){
				
				double desconto = total*0.05;
				
				
				System.out.println("\nTipo de carne: " + carne + "\nQuantidade de carne: " + qtdCarne + " Kg" 
						+ "\nPreço total: R$ " + total + "\nTipo de pagamento: cartão" + "\nValor do desconto : R$ "
						+ desconto + "\nValor a pagar: R$ " + (total - desconto));
			}
			
			else{
				
				double desconto = 0;
				
				
				System.out.println("\nTipo de carne: " + carne + "\nQuantidade de carne: " + qtdCarne + " Kg" 
						+ "\nPreço total: R$ " + total + "\nTipo de pagamento: dinheiro" + "\nValor do desconto : R$ "
						+ desconto + "\nValor a pagar: R$ " + (total - desconto));
				
			}
			
		break;
		
		case "Picanha":
		case "picanha":
			
			
			if(qtdCarne <= 5){
				
				total = qtdCarne*6.9;
				
			}
			
			else{
				total = qtdCarne*7.8;
			}
			
			if(res.equals("sim") || res.equals("Sim")){
				
				double desconto = total*0.05;
				
				
				System.out.println("\nTipo de carne: " + carne + "\nQuantidade de carne: " + qtdCarne + " Kg" 
						+ "\nPreço total: R$ " + total + "\nTipo de pagamento: cartão" + "\nValor do desconto : R$ "
						+ desconto + "\nValor a pagar: R$ " + (total - desconto));
			}
			
			else{
				
				double desconto = 0;
				
				
				System.out.println("\nTipo de carne: " + carne + "\nQuantidade de carne: " + qtdCarne + " Kg" 
						+ "\nPreço total: R$ " + total + "\nTipo de pagamento: dinheiro" + "\nValor do desconto : R$ "
						+ desconto + "\nValor a pagar: R$ " + (total - desconto));
				
			}
			
			
		break;	
		
		}
		
		
	}

}
