/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula40;

/**
 *
 * @author thiago
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        
        pessoa.setEndereco("Rua 1, numero 1");
        aluno.setEndereco("Rua 2, numero 2");
        professor.setEndereco("Rua 3, numero 3");
        
        //aqui vemos o conceito de polimorfismo nas classes
        //a mesma declaração em classes diferentes
        //acontece o override nas subclasses
        
        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
    }
    
}
