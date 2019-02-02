/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula52.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String entradaDados;
        boolean sair = false;
        int tam = 3;
        
        Agenda agenda = new Agenda();
        int op = 0;
        
        while(!sair){
          
            while(op > 3 || op < 1){
                
                    System.out.println("------------ MENU ------------");
                    System.out.println();
                    System.out.println("1 - Consultar um contato da agenda");
                    System.out.println("2 - Para adicionar um contato na agenda");
                    System.out.println("3 - Para sair");
                    
                    System.out.print("-> ");
                    
                try{
                    entradaDados = scan.nextLine();
                    op = Integer.parseInt(entradaDados);
                    
                    System.out.println();
                    
                    if(op > 3 || op < 1){
                        throw new NumeroInvalidoException();
                    }  
                }
                catch(NumeroInvalidoException e){
                    System.out.println(e.toString());
                }
            }
            
            switch(op){
                case 1: 
                    
                        System.out.print("Digite o nome do contato que deseja consultar: ");
                        entradaDados = scan.nextLine();
                        
                        
                        try{
                            if(agenda.consultarContatoNome(entradaDados) >= 0){
                                System.out.println("Contato " + entradaDados +" existe\n");
                            }
                        }
                        catch(ContatoNaoExisteException e){
                            System.out.println(e.getMessage());
                        }
                    
                break;
                
                case 2: 
                    try{
                        
                        System.out.println("Criando novo contato");
                        Contato contato = new Contato();
                       
                        
                        System.out.println("\nInsira os dados do contato: ");
                        
                        System.out.print("Nome: ");
                        entradaDados = scan.nextLine();
                        contato.setNome(entradaDados);
                        
                        System.out.print("Telefone: ");
                        entradaDados = scan.nextLine();
                        contato.setTelefone(entradaDados);
                        
                        System.out.print("email: ");
                        entradaDados = scan.nextLine();
                        contato.setEmail(entradaDados);
                        
                        System.out.println();
                        
                        System.out.println("Contato a ser criado: ");
                        System.out.println(contato);
                        
                        agenda.adicionarContato(contato);
                    }
                    catch(AgendaCheiaException e){
                        System.out.println("\n" + e.getMessage());
                        
                        System.out.println("\nContatos da agenda\n");
                        System.out.println(agenda);
                    }
                    //System.out.println(agenda.toString());
                break;
                
                case 3:
                    System.out.println("Fim do programa...");
                    sair = true;
            }
            op = 0;
        }
    }      
        
}
