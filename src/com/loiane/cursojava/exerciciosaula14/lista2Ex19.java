package com.loiane.cursojava.exerciciosaula14;

import java.util.Scanner;

public class lista2Ex19 {

	public static void main(String[] args) {
		
		double resultado = 0;
		boolean valido = true;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe dois números: \n\nn1:");
		double n1 = scan.nextDouble();
		
		System.out.println("n2: ");
		double n2 = scan.nextDouble();
		
		System.out.println("Informe o tipo de operação q deseja realizar: \nSoma (+)\nSubtração (-) \nMultiplicação (*) "
				+ "\nDivisão (/) \nResto (%)");
		char op = scan.next(".").charAt(0);
		
		
		switch(op){
		
		case '+': resultado = (n1 + n2); break;
		case '-': resultado = (n1 - n2); break;
		case '*': resultado = (n1*n2); break;
		case '/': resultado = (n1/n2);	break;
		case '%': resultado = (n1%n2); break;
	  
	  default: System.out.println("Operação não é válida.");
	  valido = false;
		
		}
		
		if(valido){
			
			
			System.out.println("Resultado: " + resultado);
			
			if((n1+n2) > 0){
				  System.out.print("É positivo e ");
			  }
			  else{
				  System.out.print("É negativo e ");
			  }
			  
			  if((n1+n2)%2 == 0){
				  System.out.println("par");
			  }
			  
			  else{
				  System.out.println("ímpar");
			  }
			
		}

	}

}
