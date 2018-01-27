/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numero = 0;
        int op = 0;
        boolean validarEntrada = false;
        boolean sair = false;
        while (!sair) {
            System.out.println("\nConversão de unidades de área.");

            while (!sair) {
                System.out.println("Entre com uma opção do menu\n");
                System.out.println("1 metro quadrado - 10.76 pés quadrados (1)");
                System.out.println("1 pé quadrado - 929 centímetros quadrados (2)");
                System.out.println("1 milha quadrada - 640 acres (3)");
                System.out.println("1 acre - 43.560 pés quadrados (4)");
                System.out.println("Sair (5)");

                System.out.print("->");
                op = scan.nextInt();
                if (op > 5 || op < 1) {
                    System.out.println("Entrada inválida, tente novamente com uma opção válida.");
                } else {
                    sair = true;
                }
            }

            switch (op) {

                case 1:
                    sair = false;
                    System.out.println("Entre com quantos metros deseja converter para pés quadrados");
                    System.out.print("->");
                    double metros = scan.nextDouble();
                    System.out.println(metros + " metros - " + ConversaoDeUnidadesDeArea.metroQuadradoPe(metros) + " pés quadrados");
                    break;

                case 2:
                    sair = false;
                    System.out.println("Entre com quantos pés quadrados deseja converter para centímetros quadrados");
                    System.out.print("->");
                    metros = scan.nextDouble(); // pés quadrados
                    System.out.println(metros + " metros - " + ConversaoDeUnidadesDeArea.peQuadradoCm(metros) + " centimetros quadrados");
                    break;

                case 3:
                    sair = false;
                    System.out.println("Entre com milhas quadradas deseja converter para acres (1 - 640)");
                    System.out.print("->");
                    metros = scan.nextDouble(); // milhas quadradas
                    System.out.println(metros + " milhas quadradas - " + ConversaoDeUnidadesDeArea.milhaQuadradaAcres(metros) + " acres");
                    break;

                case 4:
                    sair = false;
                    System.out.println("Entre com acres deseja converter pés quadrados (1 - 43560)");
                    System.out.print("->");
                    metros = scan.nextDouble(); // milhas quadradas
                    System.out.println(metros + " qcres - " + ConversaoDeUnidadesDeArea.acrePesQuadrados(metros) + " pés quadrados");
                    break;

                case 5:
                    System.out.println("O programa encerrou...");
                    sair = true;
                    break;
                    
                
            }

        }

    }

}
