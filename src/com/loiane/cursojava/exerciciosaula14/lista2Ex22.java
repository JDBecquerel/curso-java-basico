package com.loiane.cursojava.exerciciosaula14;

import java.util.Scanner;

public class lista2Ex22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe quantos kg de fruta o cliente comprou, \nMorango: ");
		double kgMor = scan.nextDouble();
		
		System.out.println("Maçã: ");
		double kgMac = scan.nextDouble();
		
		double totalKg = kgMac + kgMor;
		double valTotal = 0;
		
		
		//morango
			
		if(kgMor <= 5){
			valTotal = valTotal +  kgMor*2.5;
		}
			
		else{
			 valTotal = valTotal +  kgMor*2.2;
		}
			
		
		//maça
		
		if(kgMac <= 5){
			valTotal = valTotal +  kgMac*1.8;
	
		}
		
		else{
			valTotal = valTotal + kgMac*1.5;
		}
		
		if(totalKg > 8 || valTotal > 25){
			valTotal = valTotal - valTotal*0.1;
		}
		
		System.out.println("O valor a ser pago pelo cliente é: R$ " + valTotal);
			
			
			
			
		
		
		
		
		

	}

}
