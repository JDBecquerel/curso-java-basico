/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula43.labs.exer02;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class TesteV2{
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        PessoaJuridica pessoaJurid[] = new PessoaJuridica[3]; 
        PessoaFisica pessoaFisic[] = new PessoaFisica[3];
        
        String nome;
        double rendaBruta;
        
        System.out.println("########### Pessoas Jurídicas ##########");
        System.out.println("Insira as informações de cada um abaixo\n");
        
        for(int i = 0; i < pessoaJurid.length; i++){
            PessoaJuridica pj = new PessoaJuridica();
            
            System.out.println("Informações da pessoa jurídica " + (i+1) +" -> " );
            System.out.print("Nome: ");
            nome = scan.nextLine();
            pj.setNome(nome);
            
            System.out.print("Renda Bruta: ");
            rendaBruta = scan.nextDouble();
            pj.setRendaBruta(rendaBruta);
            
            pj.calcularImposto();
            
            scan.nextLine();
            pessoaJurid[i] = pj;
            System.out.println();
        }
        
        System.out.println("########### Pessoas Fisícas ##########");
        System.out.println("Insira as informações de cada um abaixo\n");
        
        for(int i = 0; i < pessoaFisic.length; i++){
            PessoaFisica pf = new PessoaFisica();
            
            System.out.println("Informações da pessoa física " + (i+1) +" -> " );
            System.out.print("Nome: ");
            nome = scan.nextLine();
            pf.setNome(nome);
            
            System.out.print("Renda Bruta: ");
            rendaBruta = scan.nextDouble();
            pf.setRendaBruta(rendaBruta);
            
            pf.calcularImposto();
            
            scan.nextLine();
            pessoaFisic[i] = pf;
            System.out.println();
        }
        
        
        System.out.println("########## Saída de dados ##########");
        System.out.println();
        
        System.out.println("########## Pessoas Físicas ##########");
        System.out.println();
        
        for(int i = 0; i < pessoaJurid.length; i++){ 
            System.out.println("\nDados da pessoa jurídica " + (i+1) + ": ");
            System.out.println(pessoaJurid[i]);
        }
        
        for(int i = 0; i < pessoaFisic.length; i++){  
            System.out.println("\nDados da pessoa fisíca " + (i+1) + ": ");
            System.out.println(pessoaFisic[i]);
        }
    }
}
