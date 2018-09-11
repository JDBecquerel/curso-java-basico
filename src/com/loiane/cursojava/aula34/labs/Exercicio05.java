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
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numero = 0;
        int op = 0;
        boolean validarEntrada = false;
        boolean sair = false;
        
        while (!sair) {
            System.out.println("\nConversão de unidades de volume.");

            while (!sair) {
                System.out.println("Entre com uma opção do menu\n");
                System.out.println("1 litro = 1000 centímetros cúbicos (1)");
                System.out.println("1 metro cúbico = 1000 litros (2)");
                System.out.println("1 metro cúbico = 35.32 pés cúbicos (3)");
                System.out.println("1 galão americano = 231 polegadas cúbicas (4)");
                System.out.println("1 galão americano = 3.785 litros (5)");
                System.out.println("Sair (6)");

                System.out.print("\n->");
                op = scan.nextInt();
                
                if (op > 6 || op < 1) {
                    System.out.println("Entrada inválida, tente novamente com uma opção válida.");
                } else {
                    sair = true;
                }
            }

            switch (op) {

                case 1:
                    sair = false;
                    System.out.println("\nEntre com quantos litros deseja converter para centímetros cúbicos (1 - 1000)");
                    System.out.print("->");
                    double metros = scan.nextDouble();
                    System.out.println(metros + " litros - " + ConversaoDeUnidadesDeVolume.litroCmCub(metros) + " centímetros cúbicos");
                    break;

                case 2:
                    sair = false;
                    System.out.println("\nEntre com quantos metros cúbicos deseja converter para litros (1 - 1000)");
                    System.out.print("->");
                    metros = scan.nextDouble(); // pés quadrados
                    System.out.println(metros + " metros cúbicos - " + ConversaoDeUnidadesDeVolume.mCubicoLitros(metros) + " litros");
                    break;

                case 3:
                    sair = false;
                    System.out.println("\nEntre com metros cúbicos que deseja converter para pés cúbicos (1 - 35.32)");
                    System.out.print("->");
                    metros = scan.nextDouble(); 
                    System.out.println(metros + " metros cúbicos - " + ConversaoDeUnidadesDeVolume.mCubicoPesCubico(metros) + " pés cúbicos");
                    break;

                case 4:
                    sair = false;
                    System.out.println("\nEntre com a quantidade de galões que deseja converter para polegadas cúbicas  (1 - 231)");
                    System.out.print("->");
                    metros = scan.nextDouble(); 
                    System.out.println(metros + " galões - " + ConversaoDeUnidadesDeVolume.galAmericanoPolCubicas(metros) + " polegadas cúbicas");
                    break;

                case 5:
                    
                    sair = false;
                    System.out.println("\nEntre com a quantidade de galões que deseja converter para litros (1 - 3.785)");
                    System.out.print("->");
                    metros = scan.nextDouble(); 
                    System.out.println(metros + " galões - " + ConversaoDeUnidadesDeVolume.galAmericanoLitros(metros) + " litros");
                    break;
                
                case 6:
                    System.out.println("\nO programa encerrou...");
                    sair = true;
                    break;
                    
                
            }

        }

    }

}
