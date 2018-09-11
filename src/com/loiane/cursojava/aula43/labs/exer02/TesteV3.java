/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula43.labs.exer02;

/**
 *
 * @author thiago
 */
public class TesteV3 {
    
    public static void main(String[] args) {
        
        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Contribuinte 01");
        p1.setRendaBruta(1000);
        p1.setCpf("126.316.336-01");
        
        PessoaJuridica p2 = new PessoaJuridica();
        p2.setNome("Contribuinte 02");
        p2.setRendaBruta(5000);
        p2.setCnpj("34.983.348/0001-68");
        
        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Contribuinte 03");
        p3.setRendaBruta(2000);
        p3.setCpf("473.428.742-21");
        
        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Contribuinte 04");
        p4.setRendaBruta(3000);
        p4.setCnpj("92.360.395/0001-51");
        
        PessoaFisica p5 = new PessoaFisica();
        p5.setNome("Contribuinte 05");
        p5.setRendaBruta(3700);
        p5.setCpf("531.755.576-00");
        
        PessoaJuridica p6 = new PessoaJuridica();
        p6.setNome("Contribuinte 06");
        p6.setRendaBruta(4000);
        p6.setCnpj("74.286.736/0001-04");
        
        //para ver como funciona a questão do polimorfismo
        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;
        
        for(Contribuinte c: contribuintes){
            System.out.println(c);
        }
    }
}
