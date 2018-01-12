package com.loiane.cursojava.aula14.labs;

import java.util.Scanner;

public class lista2Ex19 {

	public static void main(String[] args) {
		
		double resultado = 0;
		boolean valido = true;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe dois n�meros: \n\nn1:");
		double n1 = scan.nextDouble();
		
		System.out.println("n2: ");
		double n2 = scan.nextDouble();
		
		System.out.println("Informe o tipo de opera��o q deseja realizar: \nSoma (+)\nSubtra��o (-) \nMultiplica��o (*) "
				+ "\nDivis�o (/) \nResto (%)");
		char op = scan.next(".").charAt(0);
		
		
		switch(op){
		
		case '+': resultado = (n1 + n2); break;
		case '-': resultado = (n1 - n2); break;
		case '*': resultado = (n1*n2); break;
		case '/': resultado = (n1/n2);	break;
		case '%': resultado = (n1%n2); break;
	  
	  default: System.out.println("Opera��o n�o � v�lida.");
	  valido = false;
		
		}
		
		if(valido){
			
			
			System.out.println("Resultado: " + resultado);
			
			if((n1+n2) > 0){
				  System.out.print("� positivo e ");
			  }
			  else{
				  System.out.print("� negativo e ");
			  }
			  
			  if((n1+n2)%2 == 0){
				  System.out.println("par");
			  }
			  
			  else{
				  System.out.println("�mpar");
			  }
			
		}

	}

}
