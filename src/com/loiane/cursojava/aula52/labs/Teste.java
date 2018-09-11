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
        
        boolean sair = false;
        
        Agenda agenda = new Agenda();
        Contato[] contatos = new Contato[3];
        int op = 0;
        
        while(!sair){
            
            while(op > 3 || op < 1){
                try{
                    System.out.println("------------ MENU ------------");
                    System.out.println();
                    System.out.println("1 - Consultar um contato da agenda");
                    System.out.println("2 - Para adicionar um contato na agenda");
                    System.out.println("3 0 Para sair");
                    System.out.print("-> ");
                    op = scan.nextInt();
                }
                catch(Exception e){
                    System.out.println("Entrada inválida. Insira um número válido.");
                }
            }
            
            switch(op){
                case 1: 
                    try{
                        System.out.print("Verificando o contato João na agenda: ");
                        verificarContato(agenda);
                    }
                    catch(ContatoNaoExisteException e){
                        ContatoNaoExisteException contatoException = new ContatoNaoExisteException();
                        System.out.println(contatoException.toString());
                    }
                    
                break;
                
                case 2: 
                    try{
                        System.out.println("Adicionando um contato na agenda: ");
                        Contato contato = new Contato();
                        agenda.adicionarContato(contato, 1);
                    }
                    catch(AgendaCheiaException e){
                        System.out.println("Ocorreu um erro, a agenda está lotada");
                        e.printStackTrace();
                    }
                break;
                
                case 3:
                    System.out.println("Fim do programa...");
                    sair = true;
            }
        }
    }
    
         
        public static void verificarContato(Agenda agenda) throws ContatoNaoExisteException{
            if(agenda.consultarContato("João", 0)){
                System.out.println("Contato existe");
            } 
        }
}
