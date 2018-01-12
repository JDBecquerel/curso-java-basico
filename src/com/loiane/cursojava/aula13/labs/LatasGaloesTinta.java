package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class LatasGaloesTinta {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double areaSerPintada, preco = 0, qtdLatas;
		double qtdLitros, qtdGaloes, folga, fracionaria;
		int lataF, galaoF;
		
		lataF = 0;
		galaoF = 0;
		
		System.out.println("Informe a area a ser pintada: ");
		areaSerPintada = scan.nextDouble();
		
		qtdLitros = areaSerPintada/6;
		folga = qtdLitros*0.10;
		
		qtdLatas = qtdLitros/18;
		
		qtdGaloes = qtdLitros/3.6;
		
		// quantas latas vou precisar - Caso 1
		
		fracionaria = qtdLatas - (int)qtdLatas;
		
		if(fracionaria != 0){
			lataF = (int)((qtdLatas + 1));
		}
		
		else{
			lataF = (int)(qtdLatas);
		}
		
		// quantos galoes vou precisar - Caso 2
		
		fracionaria = qtdGaloes - (int)qtdGaloes;
		
		if(fracionaria != 0){
			galaoF = (int)((qtdGaloes + 1));
		}
		
		else{
			galaoF = (int)(qtdGaloes);
		}
		
		System.out.println("\nQuantidade de tinta a ser comprada em litros: " + qtdLitros);
		System.out.println("\nCaso 1 - Latas: " + lataF +" - R$ " + lataF*80 +
		"\nCaso 2 - Gal�es: " + galaoF + " - R$ " + galaoF*25);
		
		
		// Galoes e Latas - Caso 3
		
		//qtdGaloes = (qtdLatas - (int)(qtdLatas));
		qtdGaloes = (qtdLitros%18)/3.6;
		System.out.println("galoes: " + qtdGaloes);
		
		if(qtdGaloes <= ((0.21*qtdLitros)/3.6)){
			
			lataF = (int)(qtdLatas);
			qtdGaloes = qtdGaloes + (folga/3.6);
			fracionaria = qtdGaloes - (int)qtdGaloes;
			
			
			if(fracionaria != 0){
				galaoF = (int)((qtdGaloes +1));
			}
			preco = galaoF*25 + lataF*80;
		}
		
		else if(qtdGaloes > ((0.21*qtdLitros)/3.6)){
			
			qtdGaloes = (int)((0.21*qtdLitros)/3.6);
			galaoF = (int)(qtdGaloes);
			qtdLitros = qtdLitros - (int)(0.21*qtdLitros);
			qtdLatas = (qtdLitros/18) + (folga/18);
			fracionaria = qtdLatas - (int)qtdLatas;
			
			if(fracionaria != 0){
				lataF = (int)((qtdLatas + 1));
			}
			
			preco = galaoF*25 + lataF*80;
		}
		
		System.out.print("Caso 3 - ");
		System.out.print("Latas: " + lataF + 
				"; Gal�es: " + galaoF + "; Folga: " + folga + " - R$ " + preco);
		
		
		

	}

}
