package com.loiane.cursojava.aula56.labs.exercCalc;
import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		int exit = 0;
		char op;
		double n1 = 0, n2 = 0;
		Calculadora calc = new Calculadora();
		OperacaoMatematica ope = OperacaoMatematica.SOMA;
		Scanner scan = new Scanner(System.in);
		boolean invalido = true;
		
		while(exit!=1) {
			System.out.println("####### CALCULADORA #######\n\n");
			System.out.println("(+) - SOMA");
			System.out.println("(-) - SUBTRAÇÃO");
			System.out.println("(/) - DIVISÃO");
			System.out.println("(*) - MULTIPLICAÇÃO");
			System.out.println("(T) - TODAS");
			System.out.print("\n\nEscolha o tipo de operacao que deseja realizar: ");
			
			
			op = scan.next().charAt(0);
			
			
			do {	
				
				if(op == '+' || op == '-' || op == '/' || op == '*' || op == 'T') {
					invalido = false;
				}
				
				else {
					System.out.print("Opção inválida.\n");
					System.out.println("\nOpções válidas: " + "\n(+) - SOMA\n(-) - SUBTRAÇÃO\n"
					+ "(/) - DIVISÃO\n(*) - MULTIPLICAÇÃO\n(T) - TODAS");
					System.out.print("\nDigite novamente: ");
					op = scan.next().charAt(0);
				}
			}while(invalido);
			
			System.out.println("Entre com os dois números para a operação");
			System.out.print("n1: ");
			n1 = scan.nextInt();
			System.out.print("n2: ");
			n2 = scan.nextInt();
			System.out.println();
			
			
			
			switch(op) {
			case '+':
				calc.setOperacao(ope.SOMA);
				System.out.println(n1 + " + " + n2 + " = " + calc.getOperacao().executarOperacao(n1, n2));
				break;
			case '-':
				calc.setOperacao(ope.SUBTRACAO);
				System.out.println(n1 + " - " + n2 + " = " + calc.getOperacao().executarOperacao(n1, n2));
				break;
			case '/':
				calc.setOperacao(ope.DIVISAO);
				System.out.println(n1 + " / " + n2 + " = " + calc.getOperacao().executarOperacao(n1, n2));
				break;
			case '*':
				calc.setOperacao(ope.MULTIPLICACAO);
				System.out.println(n1 + " * " + n2 + " = " + calc.getOperacao().executarOperacao(n1, n2));
				break;
				
			case 'T':
				for(OperacaoMatematica opeT: OperacaoMatematica.values()) {
					calc.setOperacao(ope);
					switch(opeT) {
					case SOMA:
						System.out.println(n1 + " + " + n2 + " = " + opeT.executarOperacao(n1, n2));
						break;
					case SUBTRACAO:
						System.out.println(n1 + " - " + n2 + " = " + opeT.executarOperacao(n1, n2));
						break;
					case DIVISAO:
						System.out.println(n1 + " / " + n2 + " = " + opeT.executarOperacao(n1, n2));
						break;
					case MULTIPLICACAO:
						System.out.println(n1 + " * " + n2 + " = " + opeT.executarOperacao(n1, n2));
						break;
					}
				}
				break;
			}
			
			System.out.println();
			System.out.print("Deseja sair do programa? (1 - sim, 2 - nao): ");
			
			exit = scan.nextInt();
			
			do {
				if(exit < 1 || exit > 2) {
					System.out.println("Entrada inválida.");
					System.out.println("Opções válidas:\n(1) - Sair\n(2) - Voltar ao menu");
					System.out.print("->");
					exit = scan.nextInt();
				}
			}while(exit < 1 || exit > 2);
		}
			
	}

}
