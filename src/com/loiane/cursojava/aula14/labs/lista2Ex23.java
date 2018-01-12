package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

public class lista2Ex23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double total;
		double qtdCarne = 0;
		
		System.out.println("Qual � o tipo da carne? ");
		String carne = scan.nextLine();
		
		System.out.println("Qual � a quantidade (Kg): ");
		qtdCarne = scan.nextDouble();
		
		System.out.println("A compra � feita no cart�o tabajara?");
		String res = scan.next();
		
		
		switch(carne){
		
		
		case "File Duplo":
		case "File duplo":
		case "file Duplo":
		case "file duplo":
		case "Fil� Duplo":
		case "Fil� duplo":
		case "fil� Duplo":
		case "fil� duplo":
			
			
			if(qtdCarne <= 5){
				
				total = qtdCarne*4.9;
				
			}
			
			else{
				total = qtdCarne*5.8;
			}
			
			if(res.equals("sim") || res.equals("Sim")){
				
				double desconto = total*0.05;
				
				
				System.out.println("\nTipo de carne: " + carne + "\nQuantidade de carne: " + qtdCarne + " Kg" 
						+ "\nPre�o total: R$ " + total + "\nTipo de pagamento: cart�o" + "\nValor do desconto : R$ "
						+ desconto + "\nValor a pagar: R$ " + (total - desconto));
			}
			
			else{
				
				double desconto = 0;
				
				
				System.out.println("\nTipo de carne: " + carne + "\nQuantidade de carne: " + qtdCarne + " Kg" 
						+ "\nPre�o total: R$ " + total + "\nTipo de pagamento: dinheiro" + "\nValor do desconto : R$ "
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
						+ "\nPre�o total: R$ " + total + "\nTipo de pagamento: cart�o" + "\nValor do desconto : R$ "
						+ desconto + "\nValor a pagar: R$ " + (total - desconto));
			}
			
			else{
				
				double desconto = 0;
				
				
				System.out.println("\nTipo de carne: " + carne + "\nQuantidade de carne: " + qtdCarne + " Kg" 
						+ "\nPre�o total: R$ " + total + "\nTipo de pagamento: dinheiro" + "\nValor do desconto : R$ "
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
						+ "\nPre�o total: R$ " + total + "\nTipo de pagamento: cart�o" + "\nValor do desconto : R$ "
						+ desconto + "\nValor a pagar: R$ " + (total - desconto));
			}
			
			else{
				
				double desconto = 0;
				
				
				System.out.println("\nTipo de carne: " + carne + "\nQuantidade de carne: " + qtdCarne + " Kg" 
						+ "\nPre�o total: R$ " + total + "\nTipo de pagamento: dinheiro" + "\nValor do desconto : R$ "
						+ desconto + "\nValor a pagar: R$ " + (total - desconto));
				
			}
			
			
		break;	
		
		}
		
		
	}

}
