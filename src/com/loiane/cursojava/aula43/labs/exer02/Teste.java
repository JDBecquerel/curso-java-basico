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
public class Teste {
    
    public static void main(String[] args) {
        
        PessoaJuridica pj01 = new PessoaJuridica();
        PessoaJuridica pj02 = new PessoaJuridica();
        PessoaJuridica pj03 = new PessoaJuridica();
        
        PessoaFisica pf01 = new PessoaFisica();
        PessoaFisica pf02 = new PessoaFisica();
        PessoaFisica pf03 = new PessoaFisica();
        
        String entrada;
        double rendaBruta;
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("--------#### Pessoas jurídicas ####--------");
        System.out.print("Informe o nome da pessoa: ");
        entrada = scan.nextLine();
        pj01.setNome(entrada);
        
        System.out.print("Informe a renda bruta: ");
        rendaBruta = scan.nextDouble();
        pj01.setRendaBruta(rendaBruta);
        pj01.calcularImposto();
        
        scan.nextLine();
        System.out.println();
        
        //pessoa 02
        System.out.print("Informe o nome da pessoa: ");
        entrada = scan.nextLine();
        pj02.setNome(entrada);
        
        System.out.print("Informe a renda bruta: ");
        rendaBruta = scan.nextDouble();
        pj02.setRendaBruta(rendaBruta);
        pj02.calcularImposto();
        
        scan.nextLine();
        System.out.println();
        
        //pessoa 03
        System.out.print("Informe o nome da pessoa: ");
        entrada = scan.nextLine();
        pj03.setNome(entrada);
        
        System.out.print("Informe a renda bruta: ");
        rendaBruta = scan.nextDouble();
        pj03.setRendaBruta(rendaBruta);
        pj03.calcularImposto();
        
        scan.nextLine();
        System.out.println();
        System.out.println();
        //pessoa 04
        System.out.println("--------#### Pessoas físicas jurídicas ####--------");
        System.out.print("Informe o nome da pessoa: ");
        entrada = scan.nextLine();
        pf01.setNome(entrada);
        
        System.out.print("Informe a renda bruta: ");
        rendaBruta = scan.nextDouble();
        pf01.setRendaBruta(rendaBruta);
        pf01.calcularImposto();

        scan.nextLine();
        System.out.println();
        
        //pessoa 05
        System.out.print("Informe o nome da pessoa: ");
        entrada = scan.nextLine();
        pf02.setNome(entrada);
        
        System.out.print("Informe a renda bruta: ");
        rendaBruta = scan.nextDouble();
        pf02.setRendaBruta(rendaBruta);
        pf02.calcularImposto();
        
        scan.nextLine();
        System.out.println();
        
        //pessoa 06
        System.out.print("Informe o nome da pessoa: ");
        entrada = scan.nextLine();
        pf03.setNome(entrada);
        
        System.out.print("Informe a renda bruta: ");
        rendaBruta = scan.nextDouble();
        pf03.setRendaBruta(rendaBruta);
        pf03.calcularImposto();
        
        
        System.out.println("########## Saída de dados ##########");
        System.out.println();
        System.out.println("##### Pessoas Jurídicas #####");
        System.out.print(pj01);
        System.out.print(pj02);
        System.out.print(pj03);
        
        System.out.println("\n");
        System.out.println("##### Pessoas Físicas #####");
        System.out.print(pf01);
        System.out.print(pf02);
        System.out.print(pf03);
    }
}
