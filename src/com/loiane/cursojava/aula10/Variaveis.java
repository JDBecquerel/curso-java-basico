package com.loiane.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//segue o camel case: nomeDoMeuCachorro, conven��o Java;
		
		//conve��o Java
		int idade = 21;
		String nome = "Thiago";
		String nomeDoMeuCachorro = "Madao";
		String ano2014 = "2014";
		
		System.out.println("Idade: " + idade);
		
		//aceito, mas n�o utilizado
		int _idade;
		int $idade;
		
		
		//n�o � conven��o Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		idade = 22;
		
		System.out.println("Idade: " + idade);
		System.out.println("Nome: " + nome);
		
		
		// m� pr�tica, dif�cil de saber para que a var�avel serve
		int a = 10;
		String b = "Thiago";

	}

}
