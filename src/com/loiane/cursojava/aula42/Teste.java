/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula42;

/**
 *
 * @author thiago
 */
public class Teste {
    
    public static void main(String[] args) {
        
        // 1ª utilização do final -> não permitir usar extend ou a superclasse
        //por isso não posso ter instancia de aluno ou professor do tipo Pessoa
        Pessoa pessoa = new Pessoa();
        //Pessoa aluno = new Aluno();
        //Pessoa professor = new Professor();
        
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        
        //2ª utilização - para constantes em variáveis, não pode mudar o valor.
        
        //exemplo 02 de final
        System.out.println(Constantes.URL_FACEBOOK); // por ser static
        //Constantes.HOME_PAGE = "djasjdsa"; -> se não tivesse final
        
        
        //exemplo simples do tipo primitivo int
        final int total = 1;
        //total += 1;  - se essa linha executasse ia dar erro
        System.out.println(total);
    }
    
}
