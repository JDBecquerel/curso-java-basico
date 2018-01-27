/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula35.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Exer01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int termo;

        boolean sair = false;

        while (!sair) {

            System.out.println("Menu");
            System.out.println("Calcular o N-ésimo termo de Fibonacci (minha solução) - 1");
            System.out.println("Calcular o N-ésimo termo de Fibonacci (solução da loiane) - 2");
            System.out.println("Após observar o algoritmo da loiane - 3");
            System.out.println("Sair - 4");
            System.out.print("->");
            int op = scan.nextInt();

            switch (op) {
                case 1:
                    sair = false;
                    System.out.println("\nDigite o N-ésimo termo que deseja da sequência");
                    System.out.print("->");
                    termo = scan.nextInt();

                    System.out.println("termo: " + termo + ", é o termo desejado: "
                            + SequenciaFibonacci.fibonacci(termo, 0, 0, 0));
                    System.out.println();
                    break;

                case 2:
                    sair = false;

                    System.out.println("\nDigite o N-ésimo termo que deseja da sequência");
                    System.out.print("->");
                    termo = scan.nextInt();

                    for (int i = 0; i < termo; i++) {
                        
                        System.out.print(Calculadora.fibonacci(i) + " ");
                        
                        if (i == (termo - 1)) {
                            System.out.println("\n" + Calculadora.fibonacci(i) + " é o termo desejado ");
                        }
                    }
                    
                    System.out.println();

                    break;

                case 3:
                    sair = false;
                    System.out.println("\nDigite o N-ésimo termo que deseja da sequência");
                    System.out.print("->");
                    termo = scan.nextInt();

                    for (int i = -1; i < (termo-1); i++) {
                        
                        System.out.print(Calculadora.fibonacci2(i) + " ");
                        
                        if (i == (termo - 2)) {
                            System.out.println("\n" + Calculadora.fibonacci2(i) + " é o termo desejado ");
                        }
                    }
                    System.out.println();
                    break;
                    
                case 4:
                    sair = true;
                    System.out.println("\nO programa encerrou");
                    System.out.println();
                    break;
            }
        }
    }

}
