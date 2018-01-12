package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double soma = 0;
		double media;
		double idade;
		int n;
		
		System.out.println("Insira o n� de idades a inserir: ");
		n = scan.nextInt();
		
		for(int i = 1; i <= n; i++){
			
			System.out.println("Insira a " + i + "� idade: ");
			idade = scan.nextDouble();
			
			soma = soma + idade;
		}
		
		media = soma/n;
		
		System.out.println("media: " + media);
		
		if(media > 0 && media <= 25){
			System.out.println("A turma � jovem");
		}
		
		else if(media >= 26 && media <= 60){
			System.out.println("A turma � adulta");
		}
		
		else if(media > 60){
			System.out.println("A turma � idosa");
		}
		
		

	}

}
