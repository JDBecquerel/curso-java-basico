package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDosDadosDoTeclado {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("Digite seu nome completo:");
		//String nomeCompleto = scan.nextLine();
		//System.out.print("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu nome, idade, altura, quantidade de filhos e se tem cachorro");
		String nomePessoa = scan.next();
		int idadePessoa = scan.nextInt();
		float altura = scan.nextFloat();
		byte qtdFilhos = scan.nextByte();
		boolean animais = scan.nextBoolean();
		
		
		System.out.println("Voce digitou os seguintes valores: " );
		System.out.println("Nome: " + nomePessoa );
		System.out.println("Idade: " + idadePessoa );
		System.out.println("Altura: " + altura );
		System.out.println("Quantide de filhos: " + qtdFilhos );
		System.out.println("Se tem cachorro: " + animais );
		
	}

}
