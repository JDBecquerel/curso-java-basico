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


public class Aluno {
    
    String nome;
    int matricula;
    String curso;
    String[][] disciplinasNotas;
    Scanner scan = new Scanner(System.in);
    
    void calcularMedia(){
        
        double media = 0;
        double soma = 0;
        
        for(int i = 0; i < disciplinasNotas.length; i++){
            for(int j = 1; j < disciplinasNotas[i].length; j++){
                
                soma = soma + Double.parseDouble(disciplinasNotas[i][j]); 
                if(j == 3){
                    media = soma/3;
                    avaliarAluno(media);
                }
            }
            soma = 0;
        }
    }
    
    void avaliarAluno(double media){
        if(media >= 7){
            System.out.print(" Aprovado");
        }
        else{
            System.out.print(" Reprovado");
        }
    }
    
    void inserirDados(){
        
        double soma = 0;
        
        System.out.println("Inserindo as notas do aluno");
        
        System.out.print("\nDigite o nome do aluno: ");
        nome = scan.nextLine();
        System.out.print("Digite a matrícula: ");
        matricula = scan.nextInt();
        System.out.println("Qual curso o aluno está matriculado?");
        curso = scan.nextLine();
        
        System.out.println("Digite o nome de cada disciplina a seguir,");
        System.out.println();
        
        for(int i = 0; i < disciplinasNotas.length; i++){
            System.out.print("Disciplina[" + i + "]: ");
            disciplinasNotas[i][0] = scan.next();
            
            for(int j = 1; j < disciplinasNotas[i].length; j++){
                System.out.print("Nota[" + j + "]: ");
                disciplinasNotas[i][j] = scan.next();
            }
            System.out.println();
        }
    }
    
    void exibirDisciplinas(){
        int j = 0;
        double soma = 0;
        double media = 0;
        for(int i = 0; i < disciplinasNotas.length; i++){
            System.out.print("As notas da disciplina de " + disciplinasNotas[i][j] + " são: ");
            
            for(j = 1; j < disciplinasNotas[i].length; j++){
                System.out.print("\t" + disciplinasNotas[i][j]);
                soma = soma + Double.parseDouble(disciplinasNotas[i][j]); 
                if(j == 3){
                    media = soma/3;
                    avaliarAluno(media);
                }
            }
            System.out.println();
            j = 0;
        }
    }
    
}
