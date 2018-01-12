package com.loiane.cursojava.aula1516.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double salInicial = 1000;
		double sal;
		double percentual = 0.015;
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		System.out.println("Digite o sal�rio inicial do funcion�rio em 1995: ");
		salInicial = scan.nextDouble();
		
		System.out.println("Sal�rio inicial em 1995 de: R$ " + salInicial);
		sal = salInicial + salInicial*percentual;
		System.out.println("Sal�rio em 1996 de: R$ " + sal);
		
		
		
		sal = salInicial;
		
		for(int i = 1997; i <= 2017;i++){
			sal = sal + sal*percentual;
			percentual = 2*percentual;
		}
		
		System.out.println("O sal�rio atual do funcion�rio �: R$" + format.format(sal));
		
		

	}

}
