package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thiago
 */
public class Exer02 {
    
    // versão 02 do exercicio 02 junto com o 03 da aula 34
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        boolean sair = false;
        int op = 0;
        double num1 = 0, num2 = 0;

        while (!sair) {
            while (op <= 0 || op > 2) {
                System.out.println("\nMenu de inicializacao\n");
                System.out.println("Executar programa - 1");
                System.out.println("Encerrar programa - 2");
                System.out.print("\n->");
                op = scan.nextInt();
            }

            if (op == 1) {
                do {

                    System.out.println("Escolha qual operação do menu deseja realizar...\n");
                    System.out.println("Soma - 1");
                    System.out.println("Subtração - 2");
                    System.out.println("Produto - 3");
                    System.out.println("Divisão - 4");
                    System.out.println("Potência - 5");
                    System.out.println("Fatorial de um numero - 6");
                    System.out.println("Todas operações - 7");
                    System.out.println("Sair - 8");

                    System.out.print("-> ");
                    op = scan.nextInt();

                    if (op <= 0 || op > 7) {
                        System.out.println("Opcao invalida! Entre com outra opcao");
                    }
                } while (op <= 0 || op > 7);

                switch (op) {

                    case 1:
                        System.out.println("\nInsira o valor do primeiro numero: ");
                        System.out.print("->");
                        num1 = scan.nextInt();
                        
                        System.out.println("Insira o valor do segundo numero: ");
                        System.out.print("->");
                        num2 = scan.nextInt();

                        System.out.println(num1 + " + " + num2 + " = " + Calculadora.somar(num1, num2));
                        break;

                    case 2:

                        System.out.println("\nInsira o valor do primeiro numero: ");
                        System.out.print("->");
                        num1 = scan.nextInt();
                        
                        System.out.println("Insira o valor do segundo numero: ");
                        System.out.print("->");
                        num2 = scan.nextInt();
                        
                        System.out.println(num1 + " - " + num2 + " = " + Calculadora.subtrair(num1, num2));
                        break;

                    case 3:

                        System.out.println("\nInsira o valor do primeiro numero: ");
                        System.out.print("->");
                        num1 = scan.nextInt();
                        
                        System.out.println("Insira o valor do segundo numero: ");
                        System.out.print("->");
                        num2 = scan.nextInt();
                        
                        System.out.println(num1 + " * " + num2 + " = " + Calculadora.multiplicar(num1, num2));
                        break;

                    case 4:

                        System.out.println("\nInsira o valor do primeiro numero: ");
                        System.out.print("->");
                        num1 = scan.nextInt();
                        
                        System.out.println("Insira o valor do segundo numero: ");
                        System.out.print("->");
                        num2 = scan.nextInt();
                        
                        System.out.println(num1 + " / " + num2 + " = " + Calculadora.dividir(num1, num2));
                        break;

                    case 5:

                        System.out.println("\nInsira o valor do primeiro numero: ");
                        System.out.print("->");
                        num1 = scan.nextInt();
                        
                        System.out.println("Insira o valor do segundo numero: ");
                        System.out.print("->");
                        num2 = scan.nextInt();
                        
                        System.out.println(num1 + " ^ " + num2 + " = " + Calculadora.elevarAPotencia(num1, num2));
                        break;
                        
                    case 6:
                        
                        int fat = 0;
                        System.out.println("Entre com o valor para calcular seu fatorial");
                        System.out.println("Entre com um número positivo");
                        System.out.print("->");
                        
                        do{
                            fat = scan.nextInt();
                            
                            if(fat < 0){
                               System.out.println("Número inválido, entre novamente.");
                               System.out.print("->");
                            }
                        }while(fat < 0);
                        
                        System.out.println(fat + "! = " + Calculadora.fatorial(fat));
                        break;

                    case 7:

                        System.out.println("\nInsira o valor do primeiro numero: ");
                        System.out.print("->");
                        num1 = scan.nextInt();
                        System.out.println("Insira o valor do segundo numero: ");
                        System.out.print("->");
                        num2 = scan.nextInt();
                        
                        System.out.println("Insira o valor do numero para calcular seu fatorial");
                        System.out.print("->");
                        
                        do{
                            fat = scan.nextInt();
                            
                            if(fat < 0){
                               System.out.println("Número inválido, entre novamente.");
                               System.out.print("->");
                            }
                        }while(fat < 0);

                        System.out.println("Todas operações: ");
                        System.out.println(num1 + " + " + num2 + " = " + Calculadora.somar(num1, num2));
                        System.out.println(num1 + " - " + num2 + " = " + Calculadora.subtrair(num1, num2));
                        System.out.println(num1 + " * " + num2 + " = " + Calculadora.multiplicar(num1, num2));
                        System.out.println(num1 + " / " + num2 + " = " + Calculadora.dividir(num1, num2));
                        System.out.println(num1 + " ^ " + num2 + " = " + Calculadora.elevarAPotencia(num1, num2));
                        System.out.println(fat + "! = " + Calculadora.fatorial(fat));
                        break;
                        
                    case 8:
                        System.out.println("O programa da calculadora encerrou...");
                        sair = true;
                        break;

                }
            } else if (op == 2) {
                System.out.println("O programa da calculadora encerrou...");
                sair = true;
            } else {
                System.out.println("Opcao invalida! Entre com outra opcao");
            }

        }

    }

}
