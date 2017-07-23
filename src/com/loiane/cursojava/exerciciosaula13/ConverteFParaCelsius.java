package com.loiane.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ConverteFParaCelsius {

	public static void main(String[] args) {

		double tempF, tempC;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite a temperatura em Fº: ");
		tempF = scan.nextDouble();
		
		tempC = (5*(tempF - 32)/9);
		
		System.out.println("Temperatura em Celsius é: " + tempC + " Cº");
		

	}

}
