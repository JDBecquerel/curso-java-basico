package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		boolean primo = true;
		int cont = 0;
		
		System.out.println("Digite um número para verificar se é primo: ");
		num = scan.nextInt();
		
		for(int i = 1; i <= num; i++){
			if(num%i == 0 && num%1 == 0	){
				cont++;
			}
		}
		
		if(cont <= 2){
			System.out.println("é um número primo.");
		}
		else{
			System.out.println("Não é um número primo.");
		}
		
	}

}
