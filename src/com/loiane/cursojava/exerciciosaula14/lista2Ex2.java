package com.loiane.cursojava.exerciciosaula14;

import java.util.Scanner;

public class lista2Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = scan.nextInt();
		
		if(num > 0){
			System.out.println("N�mero � positivo.");
		}
		
		else{
			System.out.println("N�mero � negativo.");
		}

	}

}
