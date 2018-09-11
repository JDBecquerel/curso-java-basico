/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula45;

/**
 *
 * @author thiago
 */
public class Teste {
    
    public static void main(String[] args) {
    /*    
    Aluno aluno = new Aluno();
    Pessoa pessoaAluno = aluno; //upcasting
    
    Pessoa aluno2 = (Pessoa) new Aluno();
    
    Pessoa aluno3 = new Pessoa();
    Aluno aluno4 = (Aluno) aluno3; // a superclasse tem atributos que a subclasse
                                   // não tem e isso não permite converter
    
    */
    
    Pessoa pessoa = new Pessoa();
    Aluno aluno = new Aluno();
    Professor prof = new Professor();
    
    if(pessoa instanceof Pessoa){
        System.out.println("É do tipo Pessoa");
    }
    
    if(aluno instanceof Aluno){
        System.out.println("É do tipo Aluno");
    }
    
    if(prof instanceof Professor){
        System.out.println("É do tipo Professor");
    }
 }
}
