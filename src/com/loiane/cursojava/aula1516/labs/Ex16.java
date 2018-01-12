package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		int ao = 0, a1 = 1;
		int aux = 0;
		
		System.out.print(ao + " ");
		while(a1 < 500){
			
			aux = a1 + ao;
			ao = a1;
			a1 = aux;
			System.out.print(a1 + " ");
		}
			
		

	}

}
