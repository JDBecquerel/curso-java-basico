/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Exer01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        String entrada = null;

        System.out.println("Entre com um nome para a agenda");
        System.out.print("-> ");
        entrada = scan.nextLine();
        agenda.setNome(entrada);

        
        System.out.println("\nEntre com 3 contatos para a agenda " + agenda.getNome());
        
        
        Contato[] contatos = new Contato[3];
        
        //Entrada de dados dos contatos       
        for (int i = 0; i < contatos.length; i++) {
            System.out.println("\n\nContato " + (i+1));
            Contato c = new Contato();
            
            System.out.println("\nEntre com o nome: ");
            System.out.print("-> ");
            entrada = scan.nextLine();
            c.setNome(entrada);

            System.out.println();
            System.out.println("Entre com o telefone");
            System.out.print("-> ");
            entrada = scan.nextLine();
            c.setTelefone(entrada);

            System.out.println();
            System.out.println("Entre com o email");
            System.out.print("-> ");
            entrada = scan.nextLine();
            c.setEmail(entrada);
            
            contatos[i] = c;
        }
        
        agenda.setContatos(contatos);
        
        if(agenda != null){
            System.out.println(agenda.obterInfo());
        }
        //obtendo informações do contato 1
        //System.out.println(agenda.obterInformacoesContato(contatos[0]));
        //System.out.println();

        //obtendo informações dos contatos
        //System.out.println(agenda.obterInformacoesContatos(contatos, 0));
    }
            
    
}
