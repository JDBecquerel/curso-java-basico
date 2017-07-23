package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double n1 = 0;
		
		System.out.println("Insira o primeiro número");
		n1 = scan.nextDouble();
		
		
		System.out.println("Insira o segundo número");
		double n2 = scan.nextDouble();
		
		if(n1 < n2){
			int i = 0;
			for(n1 = n1; n1 <= n2; n1++){
				System.out.println("Número " + i + " : " + n1);
				i++;
			}
		}
		
		else{
			
			int i = 0;
			for(n2 = n2; n2 <= n1; n2++){
				System.out.println("Número " + i + " : " + n1);
				i++;
			}
		}

	}

}
