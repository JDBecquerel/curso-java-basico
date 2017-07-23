package com.loiane.cursojava.exerciciosaula14;

import java.util.Scanner;

public class lista2Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//valores de entrada 
		
		System.out.println("Insira o valor por horas trabalhadas: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite o total de horas trabalhadas por mês: ");
		double horasTrabalhadas = scan.nextDouble();
		
		// operações
		
		double salBruto = valorHora*horasTrabalhadas;
		double FGTS = salBruto*0.11;
		double sindicato = salBruto*0.03;
		
		if(salBruto <= 900){
			
			double IR = 0;
			double INSS = salBruto*0.1;
			double descontos = IR + sindicato + INSS;
			double salLiq = salBruto - descontos;
			
			
			
			System.out.println("\n\nSalário bruto: (" + horasTrabalhadas + " * " + valorHora + ") "
					+ "		: R$ " + salBruto);
			System.out.println("(-) IR (0%) 				: R$ " + IR);
			System.out.println("(-) INSS (10%) 				: R$ " + INSS);
			System.out.println("(-) Sindicato (3%) 			: R$ " + sindicato);
			System.out.println("FGTS (11%) 				: R$ " + FGTS);
			System.out.println("Total de descontos	 		: R$ " + descontos);
			System.out.println("Salário liquído	 			: R$ " + salLiq);
		}
		
		else if(salBruto > 900 && salBruto <= 1500){
			
			double IR = salBruto*0.05;
			double INSS = salBruto*0.1;
			double descontos = IR + sindicato + INSS;
			double salLiq = salBruto - descontos;
			
			
			System.out.println("\n\nSalário bruto: (" + horasTrabalhadas + " * " + valorHora + ") "
					+ "		: R$ " + salBruto);
			System.out.println("(-) IR (5%) 				: R$ " + IR);
			System.out.println("(-) INSS (10%) 				: R$ " + INSS);
			System.out.println("(-) Sindicato (3%) 			: R$ " + sindicato);
			System.out.println("FGTS (11%) 				: R$ " + FGTS);
			System.out.println("Total de descontos	 		: R$ " + descontos);
			System.out.println("Salário liquído	 			: R$ " + salLiq);
			
			
		}
		
		else if(salBruto > 1500 && salBruto <= 2500){
			
			double IR = salBruto*0.10;
			double INSS = salBruto*0.1;
			double descontos = IR + sindicato + INSS;
			double salLiq = salBruto - descontos;
			
			
			System.out.println("\n\nSalário bruto: (" + horasTrabalhadas + " * " + valorHora + ") "
					+ "		: R$ " + salBruto);
			System.out.println("(-) IR (10%) 				: R$ " + IR);
			System.out.println("(-) INSS (10%) 				: R$ " + INSS);
			System.out.println("(-) Sindicato (3%) 			: R$ " + sindicato);
			System.out.println("FGTS (11%) 				: R$ " + FGTS);
			System.out.println("Total de descontos	 		: R$ " + descontos);
			System.out.println("Salário liquído	 			: R$ " + salLiq);
			
		}
		
		else{
			
			double IR = salBruto*0.20;
			double INSS = salBruto*0.1;
			double descontos = IR + sindicato + INSS;
			double salLiq = salBruto - descontos;
			
			
			System.out.println("\n\nSalário bruto: (" + horasTrabalhadas + " * " + valorHora + ") "
					+ "		: R$ " + salBruto);
			System.out.println("(-) IR (20%) 				: R$ " + IR);
			System.out.println("(-) INSS (10%) 				: R$ " + INSS);
			System.out.println("(-) Sindicato (3%) 			: R$ " + sindicato);
			System.out.println("FGTS (11%) 				: R$ " + FGTS);
			System.out.println("Total de descontos	 		: R$ " + descontos);
			System.out.println("Salário liquído	 			: R$ " + salLiq);
		}

	}

}
