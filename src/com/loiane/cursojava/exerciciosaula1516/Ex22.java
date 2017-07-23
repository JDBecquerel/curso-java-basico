package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double valorCD = 0, total = 0;
		
		System.out.print("Informe a quantidade de CDs: ");
		int qtdCD = scan.nextInt();
		
		for(int i = 1; i <= qtdCD; i++){
			
			System.out.print("Insira o valor do " + i + "º CD");
			valorCD = scan.nextDouble();
			
			total = total + valorCD;
			
		}
		
		double media = total/qtdCD;
		
		System.out.println("O total gasto nos CDs é R$ "+ total);
		System.out.println("A média gasta por CD é R$ " + media);

	}

}
