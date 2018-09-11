/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula41;

/**
 *
 * @author thiago
 */
public class Teste {
    
    public static void main(String[] args) {
        
        //uma abtract class não pode ser instanciada
        //Pessoa pessoa = new Pessoa();
        
        //suas subclasses podem
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        
        //pessoa.setEndereco("Rua 1, numero 1");
        aluno.setEndereco("Rua 2, numero 2");
        professor.setEndereco("Rua 3, numero 3");
        
        //método com polimorfismo e abstract
        //System.out.println(aluno.obterEtiquetaEndereco());
        //System.out.println(professor.obterEtiquetaEndereco());
        
        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
        
    }
    
}
