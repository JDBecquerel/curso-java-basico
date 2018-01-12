package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double numAlunos = 0, soma = 0;
		double media;
		
		System.out.print("Insira o n�mero de turmas: ");
		int numTurmas = scan.nextInt();
		
		for(int i = 1; i <= numTurmas; i++){
			
			System.out.print("Insira o n�mero de alunos para a turma " + i + " :");
			numAlunos = scan.nextDouble();
			
			if(numAlunos > 40){
				while(numAlunos > 40){
					System.out.print("\nInv�lido, tem de ser no m�ximo 40. \nInsira o n�mero de alunos para a turma " + i + " :");
					numAlunos = scan.nextDouble();
				}
			}
			
			soma = soma + numAlunos;
			
		}
		
		media = soma/numTurmas;
		
		System.out.print("\nM�dia de " + media + " alunos por turma");

	}

}
