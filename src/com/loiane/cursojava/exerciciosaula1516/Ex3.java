package com.loiane.cursojava.exerciciosaula1516;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome = "";
		double idade = -1;
		double salario = -1;
		String sexo = "s";
		String estCivil = "e";
		
		while(nome.length() < 3){
			System.out.println("Nome: ");
			nome = scan.nextLine();
			
			if(nome.length() < 3){
				System.out.println("Inválido, digite um nome com mais de 3 caracteres!\n");
			}
		}
		
		while(idade < 0 || idade > 150){
			System.out.println("Informe a idade: ");
			idade = scan.nextDouble();
			
			if(idade > 150 || idade < 0){
				System.out.println("Idade inválida.");
			}
		}
		
		while(salario < 0){
			System.out.println("Informe o salário:");
			salario = scan.nextDouble();
			
			if(salario < 0){
				System.out.println("Inválido, tem de ser maior de 0.");
			}
		}
		
		
		while(! sexo.equalsIgnoreCase("f") && ! sexo.equalsIgnoreCase("m")){
			
			System.out.println("Insira o sexo (F; M): ");
			sexo = scan.next();
			
			if(! sexo.equalsIgnoreCase("f") && ! sexo.equalsIgnoreCase("m")){
				System.out.println("Informação inválida, insira novamente:");
			}
			
			
		}
		
		System.out.println("\n");
		
		while(! estCivil.equalsIgnoreCase("s") && ! estCivil.equalsIgnoreCase("c") 
			&& ! estCivil.equalsIgnoreCase("v") && ! estCivil.equalsIgnoreCase("d")){
			
			System.out.println("Estado civil (solteiro(a) - s; casado(a) - c; viuvo(a) - v; divorciado(a) - d): ");
			estCivil = scan.next();
			
			if(! estCivil.equalsIgnoreCase("s") && ! estCivil.equalsIgnoreCase("c") 
				&& ! estCivil.equalsIgnoreCase("v") && ! estCivil.equalsIgnoreCase("d")){
				System.out.println("Informação inválida, tente novamente.");
			}
		}
		
		
		System.out.println("\n\nNome: " + nome + "\nIdade: " + idade + "\nSalário: " + salario + 
				"\nSexo: " + sexo + "\nEstado civil: " + estCivil);
		

	}

}
