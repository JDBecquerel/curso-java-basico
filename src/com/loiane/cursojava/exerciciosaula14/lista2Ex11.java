package com.loiane.cursojava.exerciciosaula14;

import java.util.Scanner;

public class lista2Ex11 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		double salario, reajuste, percentual;
		
		System.out.println("Digite o salario atual do colaborador: ");
		salario = scan.nextDouble();
		
		
		if(salario <= 280){
			reajuste = salario + salario*0.2;
			percentual = 20;
			
		}
		
		else if(salario > 280 && salario <= 700){
			reajuste = salario + salario*0.15;
			percentual = 15;
		}
		
		else if(salario > 700 && salario <= 1500){
			reajuste = salario + salario*0.10;
			percentual = 10;
		}
		
		else{
			reajuste = salario + salario*0.05;
			percentual = 5;
		}
		
		System.out.println("Salario antes do reajuste: R$ " + salario + "\nO percentual de aumento"
				+ " aplicado: " + percentual + "%" + "\nValor do aumento: R$ " + (reajuste - salario) +
				"\nNovo salário após o reajuste: R$ " + reajuste);
		

	}

}
