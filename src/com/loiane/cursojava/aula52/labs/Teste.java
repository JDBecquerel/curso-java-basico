 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula52.labs;

import java.util.InputMismatchException;
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
        Agenda agenda = new Agenda();
        int op = 0;
        
        while(!sair){ 
                try{    
                    System.out.println("==================================");
                    System.out.println("------------ MENU ------------");
                    System.out.println();
                    System.out.println("1 - Consultar um contato da agenda");
                    System.out.println("2 - Para adicionar um contato na agenda");
                    System.out.println("3 - Para sair");
                    
                    System.out.print("-> ");
                    
                
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
                catch(NumberFormatException e){
                    System.out.println("\nFormato inv�llido como entrada do menu "
                            + "somente n�meros de 1 a 3.");
                }
            
            
            switch(op){
                case 1: 
                	try{
                		System.out.print("Digite o ID do contato que deseja consultar: ");
                		int id = scan.nextInt();
                		scan.nextLine();
                		consultarContato(agenda, id);
                    }
                	catch(InputMismatchException e) {
                    	System.out.println("Digite apenas um n�mero para consultar o ID");
                    }
                    catch(ContatoNaoExisteException e){
                        System.out.println(e.getMessage());
                    }
                    
                    
                break;
                
                case 2: 
                    try{
                        boolean cheia = false;
                        cheia = agenda.agendaCheia(); 
                        adicionarContato(scan, agenda);
                        
                    }
                    catch(AgendaCheiaException e){
                        System.out.println("\n" + e.getMessage());
                        
                        System.out.println("\nContatos da agenda\n");
                        System.out.println(agenda);
                    }
                break;
                
                case 3:
                    System.out.println("Fim do programa...");
                    sair = true;
            }
            op = 0;
            System.out.println("==================================\n\n\n");
        }
    }      
    
    public static void consultarContato(Agenda agenda, int id) throws ContatoNaoExisteException {
    	
    	Contato contatoID = new Contato(id);
		contatoID = null;
        
    
        contatoID = agenda.consultarContatoID(id);
        
        if(contatoID != null){
            System.out.println("\nContato com o ID " + 
            contatoID.getIdentificador() +" existe");
            System.out.println("E os seus dados s�o:\n");
            System.out.println("Nome: " + contatoID.getNome()
            + "\n" + "Telefone: " + contatoID.getTelefone()
            + "\n" + "Email: " + contatoID.getEmail());
            System.out.println();
        }
    }
    

    public static void adicionarContato(Scanner scan, Agenda agenda) {
    	
    	System.out.println("Criando novo contato");
        Contato contato = new Contato();
        String entradaDados = "";
        boolean verificacao = false;
        
        System.out.println("\nInsira os dados do contato: ");
        
        System.out.print("Nome: ");
        entradaDados = scan.nextLine();
        contato.setNome(entradaDados);
        
        
        do{
            System.out.print("Telefone: ");
            entradaDados = scan.nextLine();
            verificacao = contato.isTelefone(entradaDados);
            if(verificacao){
                contato.setTelefone(entradaDados);
            }
            else{
                System.out.println("\nN�o � um telefone v�lido! Digite novamente.");
                System.out.println("Formato: (XX) XXXX-XXXX ou (XX) XXXXX-XXXX)");
            }
        }while(!verificacao);
        
        
        do{
            System.out.print("Email: ");
            entradaDados = scan.nextLine();
            verificacao = contato.isEmail(entradaDados);
            if(verificacao){
                contato.setEmail(entradaDados);
            }
            else{
                System.out.println("\nN�o � um email v�lido! Digite novamente.");
                System.out.println("Formato: fulano@gmail.com");
            }
        }while(!verificacao);

        
        System.out.println();
        
        System.out.println("Dados contato: ");
        System.out.println(contato);
        
        agenda.adicionarContato(contato);
    }
}



