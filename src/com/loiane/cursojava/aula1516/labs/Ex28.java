package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cont = 0;
		int num;
		
		while(true){
			cont = 0;
			System.out.println("Digite um n�mero para verificar se � primo: ");
			 num = scan.nextInt();
			
			for(int i = 1; i <= num; i++){
				if(num%i == 0 && num%1 == 0){
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

}
