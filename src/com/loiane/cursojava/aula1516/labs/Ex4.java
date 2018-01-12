package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double A = 80000;
		double B = 200000;
		int anos = 0;
		
		while(A <= B){
			A = A + A*0.03;
			B = B + B*0.015;
			anos++;
		}
		
		if(A > B){
			System.out.println("\nLevaria " + anos + " anos para que A ultrapasse B");
		}
		
		else if ( A == B){
			System.out.println("\nLevaria " + anos + " anos para que A alcance");
		}

	}

}
