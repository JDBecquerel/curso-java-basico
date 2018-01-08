/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.exerciciosaula20;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Ex4 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        //int A[][] = new int[30][24];
        String compromisso[][] = new String[31  ][24];
        String op = "0", 
               dia = "0",
               min = "0",
               horas = "-1", nada = "";
        
        int aux = 0, aux2 = 0, aux3 = 0;
        
        for(int i = 0; i < compromisso.length; i++){
            for(int j = 0; j < compromisso[i].length; j++){
                compromisso[i][j] = "";
            }
        }
        
        while(Integer.parseInt(op) != 3){
            
            do{
            System.out.println("\t\t--------- MENU AGENDA DO MÊS --------- \n");
            System.out.println("(1) Alterar/Inserir compromisso no mês.");
            System.out.println("(2) Consultar agenda.");
            System.out.println("(3) Sair.");
            
            System.out.print("\nEscolha uma opção do menu: ");
            op = scan.nextLine();
            
                while(Integer.parseInt(op)  < 1 || Integer.parseInt(op)  > 3){
                    System.out.println("\nNúmero inválido! Digite um número válido.");
                    
                    System.out.println("\t\t--------- MENU AGENDA DO MÊS --------- \n");
                    System.out.println("(1) Alterar/Inserir compromisso no mês.");
                    System.out.println("(2) Consultar agenda.");
                    System.out.println("(3) Sair.");
                    
                    System.out.print("\nEscolha uma opção do menu: ");
                    op = scan.nextLine();
                }
            } while(Integer.parseInt(op)  > 3 || Integer.parseInt(op)  < 1);
            
            
        
            switch(Integer.parseInt(op) ){
                case 1: 
                
                    dia = "0";
                    horas = "-1";
                    min = "-1";
                    
                    for (int i = 0; i < 100; ++i)  
                        System.out.println();
                    
                    System.out.println("\t\t\n\n\n\nINSERINDO/ALTERANDO\n");
                
                    while(Integer.parseInt(dia)  < 1 || Integer.parseInt(dia) > 31){
                        System.out.print("Indique o dia do mês(1 - 31):");
                        dia = scan.nextLine();
                    }
                    
                    aux = Integer.parseInt(dia) - 1;
                
                    while(Integer.parseInt(horas) < 0 || Integer.parseInt(horas) > 23){
                        System.out.print("Indique as horas(0 - 23 horas):");
                            horas = scan.nextLine();
                    }
                    
                    aux2 = Integer.parseInt(horas);
                    
                    /*while(Integer.parseInt(min) < 0 || Integer.parseInt(min) >= 60){
                        System.out.print("Forneça os minutos(00 - 59 minutos):");
                        min = scan.nextLine();
                    }
                    
                    aux3 = Integer.parseInt(min);*/
                    
                
                    System.out.print("Insira o compromisso as " + Integer.parseInt(horas)// + ":" 
                            //+ Integer.parseInt(min) + " h "
                            + " do dia " + Integer.parseInt(dia) + ": ");
                    compromisso[aux][aux2] = scan.next();
                    
                    for (int i = 0; i < 100; ++i)  
                        System.out.println();
                break;
            
                case 2:

                    dia = "0";
                    horas = "-1";
                    min = "-1";
                    
                    for (int i = 0; i < 100; ++i)  
                        System.out.println();
                    
                    System.out.println("\t\t\n\n\nCONSULTANDO\n");
                    while(Integer.parseInt(dia) < 1 || Integer.parseInt(dia) > 30){
                        System.out.print("Indique o dia do mês(1 - 30):");
                        dia = scan.next();
                    }
                    aux = Integer.parseInt(dia) - 1;


                    while(Integer.parseInt(horas) < 0 || Integer.parseInt(horas) > 23){
                        System.out.print("Forneça as horas(00:00 - 23:00 horas):");
                        horas = scan.next();
                    }
                    
                    aux2 = Integer.parseInt(horas);
                    
                    /*
                    while(Integer.parseInt(min) < 0 || Integer.parseInt(min) >= 60){
                        System.out.print("Forneça os minutos(00 - 59 minutos):");
                        min = scan.next();
                    }
                    
                    aux3 = Integer.parseInt(min);*/
                    
                    for (int i = 0; i < 50; ++i)  
                        System.out.println();
                    
                        if(compromisso[aux][aux2] == ""){
                        
                            System.out.println("Dia " + dia +", " + horas + ":" +  min + 
                                    " - Sem compromisso marcado na agenda");
                        
                        }
                        
                        else{
                        
                            System.out.println("Dia " + dia +", " + horas + ":" +  min +
                                    "\tCompromisso:" + compromisso[aux][aux2] + "\n");
                        }

                break;

                case 3: 

                    System.out.println("\n\nPrograma encerrou...");
            }
        }   
    }  
}

