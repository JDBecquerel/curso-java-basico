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
        Contato[] contatos = new Contato[tam];
        int op = 0;
        
        while(!sair){
            
            while(op > 3 || op < 1){
                try{
                    System.out.println("------------ MENU ------------");
                    System.out.println();
                    System.out.println("1 - Consultar um contato da agenda");
                    System.out.println("2 - Para adicionar um contato na agenda");
                    System.out.println("3 - Para sair");
                    System.out.print("-> ");
                    op = scan.nextInt();
                }
                catch(Exception e){
                    System.out.println("Entrada inválida. Insira um número válido.");
                }
            }
            
            switch(op){
                case 1: 
                    try {
                        System.out.print("Digite alguma informação do contato que deseja consulta(nome, "
                                + "telefon e identificador: ");
                        entradaDados = scan.nextLine();
                        
                        Contato possuiContato;
                        
                        possuiContato = agenda.consultarContato(entradaDados);
                        
                        
                        if (possuiContato != null){
                            System.out.println("Consulta realizada: ");
                            System.out.println(possuiContato.toString());
                         
                        }
                        
                        throw new ContatoNaoExisteException();

                    }
                    catch(ContatoNaoExisteException e){
                        ContatoNaoExisteException contatoException = new ContatoNaoExisteException();
                        System.out.println(e.toString());
                    }
                    
                break;
                
                case 2: 
                    try{
                        Contato contato = new Contato();
                        
                        System.out.println("Insira os dados do contato: ");
                        
                        System.out.print("Nome: ");
                        entradaDados = scan.nextLine();
                        contato.setNome(entradaDados);
                        
                        System.out.print("Telefone: ");
                        entradaDados = scan.nextLine();
                        contato.setTelefone(entradaDados);
                        
                        agenda.adicionarContato(contato, tam);
                        
                        throw new AgendaCheiaException();
                    }
                    catch(AgendaCheiaException e){
                        e.toString();
                    }
                break;
                
                case 3:
                    System.out.println("Fim do programa...");
                    sair = true;
            }
        }
    }      
        
}
