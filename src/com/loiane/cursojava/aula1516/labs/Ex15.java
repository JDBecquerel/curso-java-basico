package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double ao = 0, a1 = 1;
		double aux = 0;
		
		System.out.print("Insira um n�mero para saber quando parar a s�rie de fibonacci: ");
		double num = scan.nextDouble();
		
		//System.out.println(ao + "\n" + a1);
		for(int i = 1; i <= num; i++){
			System.out.print(a1 + " ");
			
			aux = a1 + ao;
			ao = a1;
			a1 = aux;
		}
		

	}

}
