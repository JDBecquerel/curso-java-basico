package com.loiane.cursojava.exerciciosaula13;

import java.util.Scanner;

public class Download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double tamMB, velMbps, min;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo em MB: ");
		tamMB = scan.nextDouble();
		System.out.println("Digite a velocidade de um link de internet em Mbps: ");
		velMbps = scan.nextDouble();
		
		min = (tamMB/velMbps);
		
		System.out.println("O tempo do download é: " + min);
		
		
	}

}
