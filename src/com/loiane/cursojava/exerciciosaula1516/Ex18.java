package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		boolean primo = true;
		int cont = 0;
		
		System.out.println("Digite um n�mero para verificar se � primo: ");
		num = scan.nextInt();
		
		for(int i = 1; i <= num; i++){
			if(num%i == 0 && num%1 == 0	){
				cont++;
			}
		}
		
		if(cont <= 2){
			System.out.println("� um n�mero primo.");
		}
		else{
			System.out.println("N�o � um n�mero primo.");
		}
		
	}

}
