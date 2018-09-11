/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula43;

/**
 *
 * @author thiago
 */
public class Teste {
    
    public static void main(String[] args) {
        
       Aluno aluno = new Aluno();
       
       aluno.setCurso("Ciência da computação");
       
       double[] notas = {10, 9, 8, 5};
       aluno.setNotas(notas);
       
       //imprime a referência na memória pra onde esse objeto está apontando;
       //para mudar issso usa-se o método toString().
       System.out.println(aluno);
       
       String s1 = "djsajdas";
       String s2 = "djsajdaS";
       
       //compara as referências e não os valores com o
       //operador ==; usar o método equals para comparar objetos
       System.out.println(s1.equals(s2));
       
       Aluno aluno02 = new Aluno();
       
       aluno02.setCurso("Ciência da computação");
       double[] notas2 = {10, 9, 8, 5};
       aluno02.setNotas(notas2);
       
       //vai continuar dando falso porque ele compara os atributos
       //todos eles, podemos mudar isso no método na classe Aluno
       System.out.println(aluno.equals(aluno02));
       
       //pode controlar fazendo a sobescrita do método
       //usando a lógica que eu preciso
    }
    
}
