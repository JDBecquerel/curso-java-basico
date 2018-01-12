package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class SalárioLiquidoMes {

	public static void main(String[] args) {
		
		
		double salBruto, salLiq, porHora, horasMes;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe quanto ganha por hora");
		porHora = scan.nextDouble();
		
		System.out.println("Informe o n�mero de horas trabalhadas por mês: ");
		horasMes = scan.nextDouble();
		
		System.out.println();
		
		salBruto = porHora*horasMes;
		
		System.out.println("Salario Bruto: R$ " + salBruto);
		
		System.out.println("Quanto pagou ao INSS: R$ " + salBruto*0.08);
		
		System.out.println("Quanto pagou ao sindicato: R$ " + salBruto*0.05);
		
		System.out.println("Quanto pagou ao imposto de renda: R$ " + salBruto*0.11);
		
		salLiq = salBruto - ((salBruto*0.05) + (salBruto*0.08) + (salBruto*0.11));
		
		System.out.println("Total do sal�rio l�quido no referido m�s: R$ " + salLiq);
		
		
		
		

	}

}
