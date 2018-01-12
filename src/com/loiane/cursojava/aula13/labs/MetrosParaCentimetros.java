package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class MetrosParaCentimetros {

	public static void main(String[] args) {
		
		int metros, centimetros;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Convers�o de metros para centimetros: " );
		metros = scan.nextInt();
		// 1m equivale q 100 cm
		
		centimetros = metros*100;
		
		System.out.println(centimetros + "cm");

	}

}
