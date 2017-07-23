package com.loiane.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ConversaoCelsiusFarenhenit {

	public static void main(String[] args) {
		
		double tempC, tempF;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		tempC = scan.nextDouble();
		
		tempF = (tempC*9/5) + 32;
		
		System.out.println("Valor da temperatura em Fahrenheint: " + tempF + " Fº");
		

	}

}
