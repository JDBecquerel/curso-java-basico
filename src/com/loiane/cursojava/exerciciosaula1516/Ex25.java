package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int fimCompra = 1;
		double produto = 0, total = 0, dinheiro = 0, troco = 0;
		int i = 0;
		
		
		
		while(true){
			
			produto = 1; total = 0; dinheiro = 0; troco = 0; i = 0; fimCompra = 1;
			System.out.println("Lojas Tabajara");
			
			
				
				while(produto != 0){
					i++;
					
					System.out.print("Produto " + i + ": R$ ");
					produto = scan.nextDouble();
					total = total + produto;
					
					
				}
				
				System.out.println("Total: R$ " + total);
				System.out.print("Dinheiro: R$ ");
				dinheiro = scan.nextDouble();
				
				if(dinheiro > total){

					troco = dinheiro - total;
				}
				
				while(dinheiro < total){
					System.out.println("Dinheiro insuficiente, dinheiro:  R$ ");
					dinheiro = scan.nextDouble();
					troco = dinheiro - total;
				}
				
				System.out.println("Troco: R$ " + troco + "\n...");
			
			System.out.println("\nNOVA COMPRA: ");
		}

	}

}
