/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Ex5 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        //int A[][] = new int[30][24];
        String compromisso[][][] = new String[12][30][24];
        String op = "0", 
               dia = "0",
               horas = "-1",
               nada = "",
               mes = "-1";
        
        int auxDia = 0, auxHoras = 0, auxMin = 0, auxMes = 0;
        
        for(int i = 0; i < compromisso.length; i++){
            for(int j = 0; j < 30; j++){
                for(int k = 0; k < 24; k++){
                    compromisso[i][j][k] = "";
                }
            }
        }
        
        while(Integer.parseInt(op) != 3){
            
            do{
            System.out.println("\t\t--------- MENU AGENDA DO ANO --------- \n");
            System.out.println("(1) Agendar compromisso.");
            System.out.println("(2) Consultar agenda.");
            System.out.println("(3) Sair.");
            
            System.out.print("\nEscolha uma opção do menu: ");
            op = scan.nextLine();
            
                while(Integer.parseInt(op)  < 1 || Integer.parseInt(op)  > 3){
                    System.out.println("\nNúmero inválido! Digite um número válido.");
                    
                    System.out.println("\t\t--------- MENU AGENDA DO ANO --------- \n");
                    System.out.println("(1) Agendar compromisso.");
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
                    //min = "-1";
                    mes = "-1";
                    
                    for (int i = 0; i < 100; ++i)  
                        System.out.println();
                    
                    System.out.println("\t\t\n\n\n\nINSERINDO/ALTERANDO\n");
                    
                    while(Integer.parseInt(mes)  < 0 || Integer.parseInt(mes) > 12){
                        System.out.print("Insira o mês de forma númerica(Janeiro - 1\tFevereiro - 2\t"
                                + "Março - 3\tAbril - 4\nMaio - 5\tJunho - 6\tJulho - 7\tAgosto - 8\n"
                                + "Setembro - 9\tOutubro - 10\tNovembro - 11\tDezembro - 12):");
                        mes = scan.nextLine();
                    }
                    
                    auxMes = Integer.parseInt(mes) - 1;
                
                    while(Integer.parseInt(dia)  < 1 || Integer.parseInt(dia) > 30){
                        System.out.print("Indique o dia do mês(1 - 30):");
                        dia = scan.nextLine();
                    }
                    
                    auxDia = Integer.parseInt(dia) - 1;
                
                    while(Integer.parseInt(horas) < 8 || Integer.parseInt(horas) > 16){
                        System.out.print("Indique as horas(8 - 16 horas):");
                            horas = scan.nextLine();
                    }
                    
                    auxHoras = Integer.parseInt(horas) - 8;
                    
                    
                    /*
                    while(Integer.parseInt(min) < 0 || Integer.parseInt(min) >= 60){
                        System.out.print("Forneça os minutos(00 - 59 minutos):");
                        min = scan.nextLine();
                    }
                    
                    auxMin = Integer.parseInt(min);
                    */
                    
                    
                    
                    if(auxMes == 0){
                        System.out.print("Insira o compromisso do mês de Janeiro");
                    }
                            
                    if(auxMes == 1){
                        System.out.print("Insira o compromisso do mês de Fevereiro");
                    }
                            
                    if(auxMes == 2){
                        System.out.print("Insira o compromisso do mês de Março");
                    }
                            
                    if(auxMes == 3){
                        System.out.print("Insira o compromisso do mês de Abril");
                    }
                            
                    if(auxMes == 4){
                        System.out.print("Insira o compromisso do mês de Maio");
                    }
                            
                    if(auxMes == 5){
                        System.out.print("Insira o compromisso do mês de Junho");
                    }
                            
                    if(auxMes == 6){
                        System.out.print("Insira o compromisso do mês de Julho");
                    }
                            
                    if(auxMes == 7){
                        System.out.print("Insira o compromisso do mês de Agosto");
                    }
                            
                    if(auxMes == 8){
                        System.out.print("Insira o compromisso do mês de Setembro");
                    }
                            
                    if(auxMes == 9){
                        System.out.print("Insira o compromisso do mês de Outubro");
                    }
                            
                    if(auxMes == 10){
                        System.out.print("Insira o compromisso do mês de Novembro");
                    }
                            
                            
                    if(auxMes == 11){
                       System.out.println("Insira o compromisso do mês de Dezembro");
                    }
                    
                    System.out.print(", dia " + Integer.parseInt(dia) + " as " +
                            Integer.parseInt(horas) + " horas -> ");
                    compromisso[auxMes][auxDia][auxHoras] = scan.nextLine();
                    
                    for (int i = 0; i < 10; ++i)  
                        System.out.println();
                break;
            
                case 2:

                    dia = "0";
                    horas = "-1";
                    //min = "-1";
                    mes = "-1";
                    
                    for (int i = 0; i < 10; ++i)  
                        System.out.println();
                    
                    System.out.println("\t\t\n\n\nCONSULTANDO\n");
                    
                    while(Integer.parseInt(mes)  < 0 || Integer.parseInt(mes) > 12){
                        System.out.print("Insira o mês de forma númerica(Janeiro - 1\tFevereiro - 2\t"
                                + "Março - 3\tAbril - 4\nMaio - 5\tJunho - 6\tJulho - 7\tAgosto - 8\n"
                                + "Setembro - 9\tOutubro - 10\tNovembro - 11\tDezembro - 12):");
                        mes = scan.nextLine();
                    }
                    
                    auxMes = Integer.parseInt(mes) - 1;
                    
                    
                    
                    
                    
                    while(Integer.parseInt(dia) < 1 || Integer.parseInt(dia) > 30){
                        System.out.print("Indique o dia do mês(1 - 30):");
                        dia = scan.nextLine();
                    }
                    auxDia = Integer.parseInt(dia) - 1;


                    while(Integer.parseInt(horas) < 0 || Integer.parseInt(horas) > 23){
                        System.out.print("Forneça as horas(08:00 - 16:00 horas):");
                        horas = scan.nextLine();
                    }
                    
                    auxHoras = Integer.parseInt(horas) - 8;
                    
                    /*
                    while(Integer.parseInt(min) < 0 || Integer.parseInt(min) >= 60){
                        System.out.print("Forneça os minutos(00 - 59 minutos):");
                        min = scan.nextLine();
                    }
                    
                    auxMin = Integer.parseInt(min);
                    */
                    
                    for (int i = 0; i < 10; ++i)  
                        System.out.println();
                    
                        if(compromisso[auxMes][auxDia][auxHoras] == ""){
                            
                            if(auxMes == 0){
                                System.out.print("Mês de Janeiro");
                            }
                            
                            if(auxMes == 1){
                                System.out.print("Mês de Fevereiro");
                            }
                            
                            if(auxMes == 2){
                                System.out.print("Mês de Março");
                            }
                            
                            if(auxMes == 3){
                                System.out.print("Mês de Abril");
                            }
                            
                            if(auxMes == 4){
                                System.out.print("Mês de Maio");
                            }
                            
                            if(auxMes == 5){
                                System.out.print("Mês de Junho");
                            }
                            
                            if(auxMes == 6){
                                System.out.print("Mês de Julho");
                            }
                            
                            if(auxMes == 7){
                                System.out.print("Mês de Agosto");
                            }
                            
                            if(auxMes == 8){
                                System.out.print("Mês de Setembro");
                            }
                            
                            if(auxMes == 9){
                                System.out.print("Mês de Outubro");
                            }
                            
                            if(auxMes == 10){
                                System.out.println("Mês de Novembro");
                            }
                            
                            
                            if(auxMes == 11){
                                System.out.println("Mês de Dezembro");
                            }
                        
                            System.out.println(", Dia " + dia +", " + horas + " horas" +
                                    " - Sem compromisso marcado na agenda");
                        
                        }
                        
                        else{
                            
                            
                            if(auxMes == 0){
                                System.out.print("Mês de Janeiro");
                            }
                            
                            if(auxMes == 1){
                                System.out.print("Mês de Fevereiro");
                            }
                            
                            if(auxMes == 2){
                                System.out.print("Mês de Março");
                            }
                            
                            if(auxMes == 3){
                                System.out.print("Mês de Abril");
                            }
                            
                            if(auxMes == 4){
                                System.out.print("Mês de Maio");
                            }
                            
                            if(auxMes == 5){
                                System.out.print("Mês de Junho");
                            }
                            
                            if(auxMes == 6){
                                System.out.print("Mês de Julho");
                            }
                            
                            if(auxMes == 7){
                                System.out.print("Mês de Agosto");
                            }
                            
                            if(auxMes == 8){
                                System.out.print("Mês de Setembro");
                            }
                            
                            if(auxMes == 9){
                                System.out.print("Mês de Outubro");
                            }
                            
                            if(auxMes == 10){
                                System.out.println("Mês de Novembro");
                            }
                            
                            
                            if(auxMes == 11){
                                System.out.println("Mês de Dezembro");
                            }
                            
                            System.out.println(", Dia " + dia +", " + horas +
                                    " horas \tCompromisso:" + compromisso[auxMes][auxDia][auxHoras] + "\n");
                        }

                break;

                case 3: 

                    System.out.println("\n\nPrograma encerrou...");
            }
        }   
    }  
}

