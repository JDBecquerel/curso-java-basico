/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula36.labs.madao;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Exer01Teste {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        
        System.out.println("Entre com o nome da agenda");
        System.out.print("->");
        agenda.setNome(scan.nextLine());
        
        Contato[] contatos = new Contato[3];
        
        for(int i = 0; i < contatos.length; i++){
            Contato c = new Contato();
            System.out.println();
            
            System.out.println("Contato " + (i+1));
            System.out.println("\nEntre com o nome do contato");
            System.out.print("->");
            String nome = scan.nextLine();
            c.setNome(nome);
            
            System.out.println("Entre com o telefone do contato " + (i+1));
            System.out.print("->");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);
            
            System.out.println("Entre com o email do contato " + (i+1));
            System.out.print("->");
            String email = scan.nextLine();
            c.setEmail(email);
            
            contatos[i] = c;
            
        }
        
        agenda.setContatos(contatos);
        
        //obter informações de um contato
        //System.out.println(contatos[0].obterInfo(contatos[0]));
        
        if(agenda != null){
            System.out.println(agenda.obterInfo(agenda));
        }
        
        
    }
    
}
