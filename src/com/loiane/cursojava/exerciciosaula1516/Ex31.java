package com.loiane.cursojava.exerciciosaula1516;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double salInicial = 1000;
		double sal;
		double percentual = 0.015;
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		System.out.println("Digite o salário inicial do funcionário em 1995: ");
		salInicial = scan.nextDouble();
		
		System.out.println("Salário inicial em 1995 de: R$ " + salInicial);
		sal = salInicial + salInicial*percentual;
		System.out.println("Salário em 1996 de: R$ " + sal);
		
		
		
		sal = salInicial;
		
		for(int i = 1997; i <= 2017;i++){
			sal = sal + sal*percentual;
			percentual = 2*percentual;
		}
		
		System.out.println("O salário atual do funcionário é: R$" + format.format(sal));
		
		

	}

}
