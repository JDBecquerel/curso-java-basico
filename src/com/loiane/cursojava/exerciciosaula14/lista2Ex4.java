package com.loiane.cursojava.exerciciosaula14;

import java.util.Scanner;

public class lista2Ex4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		char l = scan.next(".").charAt(0);
		
		//poddo usar case tb e usar equalignorecase
		
		if(l == 'a' ||  l == 'e' ||  l == 'i' ||  l == 'o' ||  l == 'u'){
			
			System.out.println("É uma vogal.");
		}
		
		else{
			System.out.println("É uma consoante.");
		}
		

	}

}
