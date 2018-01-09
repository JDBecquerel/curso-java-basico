/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.exerciciosaula27;

import java.util.Scanner;

/**
 *
 * @author thiago
 */

public class Exercicio03 {
    
    public static void main(String[] args){
     
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();
       
        aluno.disciplinasNotas = new String[3][4];
        
        
        aluno.inserirDados();
        aluno.exibirDisciplinas();
        //aluno.calcularMedia();
        
        
        
        
    }
    
}
