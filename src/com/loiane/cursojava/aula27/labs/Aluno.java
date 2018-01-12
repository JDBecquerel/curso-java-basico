/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

/**
 *
 * @author thiago
 */


public class Aluno {
    
    String nome;
    int matricula;
    String curso;
    String[][] disciplinasNotas;
    String[] nomeDisciplinas;
    double[][] notas;
    Scanner scan = new Scanner(System.in);
    
    
    double calcularMedia(int indice){
        
        double media = 0;
        double soma = 0;
        
        for(int i = 1; i < (disciplinasNotas.length+1); i++){
            soma += Double.parseDouble(disciplinasNotas[indice][i]);
        }
         
         media = soma/3;
         
         return media;     
    }
    
    boolean avaliarAluno(int indice){
        if(calcularMedia(indice)>= 7){
            return true;
        }
        else{
            return false;
        }
    }
    
    void inserirDados(){
        
        
    }
    
    void exibirInfo(){
        int j = 0;
        //double soma = 0;
        //double media = 0;
        
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + curso);
        
        for(int i = 0; i < disciplinasNotas.length; i++){
            System.out.println("As notas da disciplina de " + disciplinasNotas[i][j] + " são: ");
            
            for(j = 1; j < disciplinasNotas[i].length; j++){
                System.out.print(disciplinasNotas[i][j] + " ");

            }
            System.out.println();
            j = 0;
        }
    }
}
