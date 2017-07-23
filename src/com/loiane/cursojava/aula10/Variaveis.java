package com.loiane.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//segue o camel case: nomeDoMeuCachorro, convenção Java;
		
		//conveção Java
		int idade = 21;
		String nome = "Thiago";
		String nomeDoMeuCachorro = "Madao";
		String ano2014 = "2014";
		
		System.out.println("Idade: " + idade);
		
		//aceito, mas não utilizado
		int _idade;
		int $idade;
		
		
		//não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		idade = 22;
		
		System.out.println("Idade: " + idade);
		System.out.println("Nome: " + nome);
		
		
		// má prática, difícil de saber para que a varíavel serve
		int a = 10;
		String b = "Thiago";

	}

}
