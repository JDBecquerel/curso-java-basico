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
public class Exercicio06 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double numero = 0;
        int op = 0;
        boolean sair = false;
        
        while (!sair) {
            System.out.println("\nConversão de unidades de tempo.");

            while (!sair) {
                System.out.println("Entre com uma opção do menu\n");
                System.out.println("1 minuto = 60 segundos (1)");
                System.out.println("1 hora = 60 minutos (2)");
                System.out.println("1 dia = 24 horas (3)");
                System.out.println("1 semana = 7 dias (4)");
                System.out.println("1 mês = 30 dias (5)");
                System.out.println("1 ano = 365.25 dias (6)");
                System.out.println("Sair (7)");

                System.out.print("\n->");
                op = scan.nextInt();
                
                if (op > 7 || op < 1) {
                    System.out.println("Entrada inválida, tente novamente com uma opção válida.");
                } else {
                    sair = true;
                }
            }

            switch (op) {

                case 1:
                    sair = false;
                    System.out.println("\nEntre com os minutos(1 min - 60s)");
                    System.out.print("->");
                    int tempo = scan.nextInt();
                    System.out.println(tempo + " minutos - " + ConversaoDeUnidadesDeTempo.minSegundos(tempo) + " segundos");
                    break;

                case 2:
                    sair = false;
                    System.out.println("\nEntre (1 h - 60 min)");
                    System.out.print("->");
                    tempo = scan.nextInt(); 
                    System.out.println(tempo + " horas - " + ConversaoDeUnidadesDeTempo.horaMinutos(tempo) + " minutos");
                    break;

                case 3:
                    sair = false;
                    System.out.println("\nEntre com os dias(1 dia - 24 horas)");
                    System.out.print("->");
                    tempo = scan.nextInt(); 
                    System.out.println(tempo + " dias - " + ConversaoDeUnidadesDeTempo.diaHoras(tempo) + " horas");
                    break;

                case 4:
                    sair = false;
                    System.out.println("\nEntre com as semanas (1 semana - 7 dias)");
                    System.out.print("->");
                    tempo = scan.nextInt(); 
                    System.out.println(tempo + " semanas - " + ConversaoDeUnidadesDeTempo.semanaDias(tempo) + " dias");
                    break;

                case 5:
                    
                    sair = false;
                    System.out.println("\nEntre com os meses (1 mês - 30 dias)");
                    System.out.print("->");
                    tempo = scan.nextInt(); 
                    System.out.println(tempo + " meses - " + ConversaoDeUnidadesDeTempo.mesDias(tempo) + " dias");
                    break;
                
                case 6:
                    sair = false;
                    System.out.println("\nEntre com os anos (1 anos - 365.25 dias)");
                    System.out.print("->");
                    tempo = scan.nextInt(); 
                    System.out.println(tempo + " anos - " + ConversaoDeUnidadesDeTempo.anoDias(tempo) + " dias");
                    break;
                    
                    
                case 7:
                    System.out.println("\nO programa encerrou...");
                    sair = true;
                    break;
            }

        }
    }
    
}
