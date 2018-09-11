/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula36.labs.madao;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class Exer02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String entrada;
        
        System.out.println("Entre com as informações do curso: ");
        System.out.print("Nome: ");
        entrada = scan.nextLine();
        
        Curso curso = new Curso();
        curso.setNome(entrada);
        
        System.out.print("Horário: ");
        entrada = scan.nextLine();
        curso.setHorario(entrada);
        
        System.out.println();
        
        System.out.println("Entre com as informações do professor: ");
        System.out.print("Nome: ");
        entrada = scan.nextLine();
        
        Professor professor = new Professor();
        professor.setNome(entrada);
        
        System.out.print("Departamento: ");
        entrada = scan.nextLine();
        professor.setDepartamento(entrada);
        
        System.out.print("Email: ");
        entrada = scan.nextLine();
        professor.setEmail(entrada);
        
        curso.setProfessor(professor);
        
        System.out.println();
        System.out.println();
        System.out.println("Entre com as informações dos alunos");
        
        Aluno[] alunos = new Aluno[5];
        String nomeAluno = "";
        
        for(int i = 0; i < alunos.length; i++){
            Aluno aluno = new Aluno();
            
            System.out.println();
            System.out.println("Entre com os dados do aluno " + (i+1));
            System.out.print("Nome: ");
            nomeAluno = scan.nextLine();
            aluno.setNome(nomeAluno);
        
            System.out.print("Matrícula: ");
            entrada = scan.nextLine();
            aluno.setMatricula(entrada);
        
            double[] notas = new double[4];
            
            System.out.println();
            for(int j = 0; j < notas.length; j++){
                System.out.print("Entre com a nota " + (j+1) + ": ");
                notas[j] = scan.nextDouble();
                
                while (notas[j] < 0 || notas[j] > 10) {

                    System.out.print("Entrada inválida, digite novamente a nota " + (j+1) + ": ");
                    notas[j] = scan.nextDouble();

                }
            }
            
            scan.nextLine(); //limpando o buffer do teclado
            
            aluno.setNotas(notas);
            alunos[i] = aluno;
            
        }
        
        curso.setAlunos(alunos);
        
        if(curso != null){
            System.out.println(curso.obterInfo());
        }
        
        
    }
    
    
}
