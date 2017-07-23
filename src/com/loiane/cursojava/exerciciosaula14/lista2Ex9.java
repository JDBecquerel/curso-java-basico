package com.loiane.cursojava.exerciciosaula14;

import java.util.Scanner;

public class lista2Ex9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double n1, n2, n3;
		
		System.out.println("Digite os três números, n1: ");
		n1 = scan.nextDouble();
		
		System.out.println("n2: ");
		n2 = scan.nextDouble();
		
		System.out.println("n3: ");
		n3 = scan.nextDouble();
		
		
		if((n1 > n2) && (n1 > n3)){
			if(n2 > n3){
				System.out.println(n1 + ", " + n2 + " e " + n3);
			}
			
			else{
				System.out.println(n1 + ", " + n3 + " e " + n2);
			}
		}
		
		else if(n2 > n1 && n2 > n3){
			if(n1 > n3){
				System.out.println(n2 + ", " + n1 +" e " + n3);
			}
			
			else{
				System.out.println(n2 + ", " + n3 +" e " + n1);
			}
		}
		
		else{
			if(n1 > n2){
				System.out.println(n3 + ", " + n1 +" e " + n2);
			}
			
			else{
				System.out.println(n3 + ", " + n2 +" e " + n1);
			}
		}

	}

}
