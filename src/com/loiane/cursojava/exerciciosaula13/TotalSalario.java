package com.loiane.cursojava.exerciciosaula13;

import java.util.Scanner;

public class TotalSalario {
	
	public static void main(String[] args){
		
		double qtHora, numHoras, salario;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor que ganha por hora: ");
		qtHora = scan.nextDouble();
		
		System.out.println("Digite o numero de horas trabalhadas por mes: ");
		numHoras = scan.nextDouble();
		
				// 1h ---- 20reais
				// 240 --- x -> x = 240*20;
		salario = qtHora*numHoras;
		System.out.println("Salario: " + salario);
	}

}
