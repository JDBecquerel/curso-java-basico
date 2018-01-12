package com.loiane.cursojava.aula1516.labs;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String login = "";
		String senha = "";
		
		while(login.equalsIgnoreCase(senha)){
			
			System.out.println("Insira o login: ");
			login = scan.nextLine();
			
			System.out.println("Insira a senha: ");
			senha = scan.nextLine();
			
			if(login.equalsIgnoreCase(senha)){
				System.out.println("ERRO. Insira as informa��es novamente, a senha tem de ser diferente do usuario\n");
			}
		}

	}

}
