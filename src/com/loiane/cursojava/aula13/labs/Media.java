package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		int n1, n2, n3, n4, media;
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Entre com os valores das notas: \n N1: ");
		n1 = scan.nextInt();
		
		System.out.print("N2: ");
		n2 = scan.nextInt();
		
		System.out.print("N3: ");
		n3 = scan.nextInt();
		
		System.out.print("N4: ");
		n4 = scan.nextInt();
		
		
		media = (n1 + n2 + n3 + n4)/4;
		System.out.println("A media �: " + media);
		

	}

}
