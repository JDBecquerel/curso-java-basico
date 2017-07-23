package com.loiane.cursojava.exerciciosaula13;

import java.util.Scanner;

public class QuantidadeTintas {

	public static void main(String[] args) {
		
		double area, qtdLitros, fracionaria;
		double qtdLatas, preco;
		int latasFracionaria;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho da area a ser pintada: ");
		area = scan.nextDouble();
		
		System.out.println("Area: " + area + " m^2");
		
		qtdLitros = area/3;
		
		qtdLatas = qtdLitros/18;
		fracionaria = qtdLatas - (int)(qtdLatas);
		
		if(fracionaria > 0.5){
			
			latasFracionaria = (int)((qtdLatas + 1));
			preco = latasFracionaria*80.0;
			System.out.println("Quantidade de latas a serem compradas é " + latasFracionaria + 
					" e o seu preço é R$ " + preco);
		}
		
		else{
			
			latasFracionaria = (int)(qtdLatas);
			preco = latasFracionaria*80.0;
			System.out.println("Quantidade de latas a serem compradas é " + latasFracionaria + 
					" e o seu preço é R$ " + preco);
		}
			
		
		
		
		
		
		
		
				
		
		
	}

}
